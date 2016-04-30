/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import quj.Item;
import quj.ItemPanel;

class ItemEditor
extends JPanel {
    ItemPanel itemPanel;
    JLabel classSpecificsLabel;
    JLabel packageLabel;
    JLabel importsLabel;
    JLabel protectionLabel;
    JLabel finalLabel;
    JLabel abstractLabel;
    JLabel isInterfaceLabel;
    JLabel nameLabel;
    JLabel extendsLabel;
    JLabel implementsLabel;
    JTextArea importsText;
    JTextArea implementsText;
    JCheckBox finalCheckBox;
    JCheckBox abstractCheckBox;
    JCheckBox isInterfaceCheckBox;
    JCheckBox protectionCheckBox;
    JTextField packageText;
    JTextField nameText;
    JTextField extendsText;

    ItemEditor(ItemPanel itemPanel) {
        this.itemPanel = itemPanel;
        this.classSpecificsLabel = new JLabel("Class Specifics");
        this.classSpecificsLabel.setHorizontalAlignment(0);
        this.packageLabel = new JLabel("Package");
        this.importsLabel = new JLabel("Imports");
        this.protectionLabel = new JLabel("");
        this.finalLabel = new JLabel("");
        this.abstractLabel = new JLabel("");
        this.isInterfaceLabel = new JLabel("");
        this.nameLabel = new JLabel("Name");
        this.extendsLabel = new JLabel("Extends");
        this.implementsLabel = new JLabel("Implements");
        this.importsText = new JTextArea();
        this.implementsText = new JTextArea();
        this.finalCheckBox = new JCheckBox("Final?");
        this.abstractCheckBox = new JCheckBox("Abstract?");
        this.isInterfaceCheckBox = new JCheckBox("Interface?");
        this.protectionCheckBox = new JCheckBox("Public?");
        this.packageText = new JTextField();
        this.nameText = new JTextField();
        this.extendsText = new JTextField();
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridwidth = 2;
        this.add((Component)this.classSpecificsLabel, gridBagConstraints);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.packageLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.packageText, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.importsLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 1;
        this.add((Component)new JScrollPane(this.importsText), gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.protectionLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.protectionCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.finalLabel, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.finalCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.abstractLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.abstractCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.isInterfaceLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.isInterfaceCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.nameLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.nameText, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.extendsLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.extendsText, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.implementsLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)new JScrollPane(this.implementsText), gridBagConstraints);
    }

    ItemPanel getItemPanel() {
        return this.itemPanel;
    }

    void saveItem(Item item) {
        item.setPackage(this.packageText.getText());
        item.setPublic(this.protectionCheckBox.isSelected());
        item.setFinal(this.finalCheckBox.isSelected());
        item.setAbstract(this.abstractCheckBox.isSelected());
        item.setInterface(this.isInterfaceCheckBox.isSelected());
        item.setName(this.nameText.getText());
        item.setSuperClass(this.extendsText.getText());
        Vector vector = item.getInterfaces();
        vector.clear();
        StringTokenizer stringTokenizer = new StringTokenizer(this.implementsText.getText(), "\n");
        while (stringTokenizer.hasMoreTokens()) {
            vector.addElement(stringTokenizer.nextToken().trim());
        }
        vector = item.getImports();
        vector.clear();
        stringTokenizer = new StringTokenizer(this.importsText.getText(), "\n");
        while (stringTokenizer.hasMoreTokens()) {
            vector.addElement(stringTokenizer.nextToken().trim());
        }
    }

    void setItem(Item item) {
        Vector vector = item.getImports();
        StringBuffer stringBuffer = new StringBuffer();
        int n = 0;
        while (n < vector.size()) {
            stringBuffer.append((String)vector.elementAt(n));
            if (n != vector.size() - 1) {
                stringBuffer.append("\n");
            }
            ++n;
        }
        this.importsText.setText(stringBuffer.toString());
        vector = item.getInterfaces();
        stringBuffer = new StringBuffer();
        int n2 = 0;
        while (n2 < vector.size()) {
            stringBuffer.append((String)vector.elementAt(n2));
            if (n2 != vector.size() - 1) {
                stringBuffer.append("\n");
            }
            ++n2;
        }
        this.implementsText.setText(stringBuffer.toString());
        this.protectionCheckBox.setSelected(item.isPublic());
        this.nameText.setText(item.getName());
        this.packageText.setText(item.getPackage());
        this.extendsText.setText(item.getSuperClass());
        this.finalCheckBox.setSelected(item.isFinal());
        this.abstractCheckBox.setSelected(item.isAbstract());
        this.isInterfaceCheckBox.setSelected(item.isInterface());
    }
}

