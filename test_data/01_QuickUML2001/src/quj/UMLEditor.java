/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JViewport;
import quj.BoxPanel;
import quj.ButtonPanel;
import quj.Item;
import quj.ItemPanel;
import quj.QujFilter;
import quj.SelectionEvent;
import quj.SelectionListener;

public class UMLEditor
extends JPanel
implements SelectionListener {
    private Vector items = new Vector();
    private Item currentItem;
    private File dir;
    private ButtonPanel buttonPanel;
    private ItemPanel itemPanel;
    private BoxPanel boxPanel;

    public static void main(String[] arrstring) {
        UMLEditor uMLEditor = new UMLEditor();
        JFrame jFrame = new JFrame("Quick UML for Java");
        jFrame.addWindowListener(new WindowAdapter(){

            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        jFrame.setSize(1000, 800);
        jFrame.getContentPane().add(uMLEditor);
        jFrame.setVisible(true);
    }

    public UMLEditor() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        this.buttonPanel = new ButtonPanel(this);
        this.add((Component)this.buttonPanel, gridBagConstraints);
        this.itemPanel = new ItemPanel(this);
        this.boxPanel = new BoxPanel(this);
        JScrollPane jScrollPane = new JScrollPane(this.boxPanel, 22, 32);
        jScrollPane.getViewport().setBackground(Color.white);
        JSplitPane jSplitPane = new JSplitPane(1, this.itemPanel, jScrollPane);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = 1;
        ++gridBagConstraints.gridy;
        this.add((Component)jSplitPane, gridBagConstraints);
    }

    void open() {
        if (!this.promptForDir("Choose directory to open QUJ files", "Open")) {
            return;
        }
        String[] arrstring = this.dir.list(new QujFilter());
        Vector vector = this.getItems();
        vector.clear();
        try {
            int n = 0;
            while (n < arrstring.length) {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(this.dir, arrstring[n])));
                Item item = (Item)objectInputStream.readObject();
                vector.addElement(item);
                ++n;
            }
            this.refresh();
        }
        catch (IOException var5_4) {
            System.out.println("Can't open files. Reason:\n" + var5_4);
        }
        catch (ClassNotFoundException var6_7) {
            System.out.println("Can't find a class:\n" + var6_7 + "\n\nThis is a serious problem, so I'll just quit.");
            System.exit(0);
        }
    }

    void newItem() {
        Item item = new Item();
        this.items.addElement(item);
        this.setCurrentItem(item);
        this.itemPanel.setItem(this.getCurrentItem());
        this.boxPanel.addItem(this.getCurrentItem());
        this.boxPanel.repaint();
    }

    void deleteItem() {
        Item item = this.getCurrentItem();
        this.items.remove(item);
        if (this.items.size() == 0) {
            this.newItem();
        } else {
            Item item2 = (Item)this.items.elementAt(0);
            this.setCurrentItem(item2);
            this.itemPanel.setItem(item2);
        }
        this.boxPanel.removeItem(item);
        this.boxPanel.repaint();
    }

    void createNewItem() {
        Item item = new Item();
        this.items.addElement(item);
        this.currentItem = item;
    }

    void saveCurrent() {
        if (this.getCurrentItem() == null) {
            this.createNewItem();
        }
        this.itemPanel.saveItem(this.getCurrentItem());
        this.setCurrentItem(this.currentItem);
    }

    Vector getItems() {
        return this.items;
    }

    Item getCurrentItem() {
        return this.currentItem;
    }

    void saveAll() {
        this.saveCurrent();
        if (this.dir == null && !this.promptForDir("Choose directory to save QUJ files", "Save")) {
            return;
        }
        this.boxPanel.savePositions();
        System.out.println("Saved " + this.items.size() + " files in " + this.dir.getAbsolutePath());
        try {
            int n = 0;
            while (n < this.items.size()) {
                Item item = (Item)this.items.elementAt(n);
                File file = new File(this.dir, item.getName() + ".quj");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                objectOutputStream.writeObject(item);
                objectOutputStream.flush();
                objectOutputStream.close();
                ++n;
            }
        }
        catch (FileNotFoundException var4_2) {
            System.out.println(var4_2);
        }
        catch (IOException var5_6) {
            System.out.println(var5_6);
        }
    }

    private boolean promptForDir(String string, String string2) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle(string2);
        jFileChooser.setFileSelectionMode(1);
        int n = jFileChooser.showDialog(this, string2);
        if (n == 0) {
            this.dir = jFileChooser.getSelectedFile();
            return true;
        }
        this.dir = null;
        return false;
    }

    void quit() {
        this.saveAll();
        this.setVisible(false);
        System.out.println("Thanks for using Quick UML for Java");
        System.exit(0);
    }

    public void selectionEvent(SelectionEvent selectionEvent) {
        this.saveCurrent();
        this.setCurrentItem(selectionEvent.getSelected());
    }

    void refresh() {
        this.setCurrentItem((Item)this.getItems().elementAt(0));
        this.itemPanel.setItem(this.getCurrentItem());
        this.boxPanel.setItems(this.getItems());
    }

    void printToPaper() {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(this.boxPanel);
        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            }
            catch (Exception var2_2) {
                var2_2.printStackTrace();
            }
        }
    }

    void generate() {
        this.saveAll();
        if (!this.promptForDir("Choose Source code directory", "Generate")) {
            return;
        }
        Vector vector = this.getItems();
        try {
            int n = 0;
            while (n < vector.size()) {
                File file;
                Item item = (Item)vector.elementAt(n);
                String string = item.generateCode();
                String string2 = item.getPackage();
                if (!string2.equals("")) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string2, ".");
                    StringBuffer stringBuffer = new StringBuffer();
                    while (stringTokenizer.hasMoreTokens()) {
                        stringBuffer.append(stringTokenizer.nextToken() + File.separator);
                        file = new File(this.dir, stringBuffer.toString());
                        if (file.exists()) continue;
                        file.mkdir();
                    }
                    file = new File(this.dir, stringBuffer.toString() + item.getName() + ".java");
                } else {
                    file = new File(this.dir, item.getName() + ".java");
                }
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(string);
                fileWriter.close();
                System.out.println("Wrote " + file.getAbsolutePath());
                ++n;
            }
        }
        catch (Exception var9_3) {
            System.out.println("Error in generating code. Reason:\n" + var9_3);
        }
    }

    void setCurrentItem(Item item) {
        this.currentItem = item;
        this.itemPanel.setItem(this.currentItem);
        this.boxPanel.setCurrent(item);
    }

}

