/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import quj.UMLEditor;

class ButtonPanel
extends JPanel
implements ActionListener {
    UMLEditor editor;
    JButton newButton;
    JButton saveButton;
    JButton openButton;
    JButton generateButton;
    JButton printButton;
    JButton deleteButton;
    JButton quitButton;

    ButtonPanel(UMLEditor uMLEditor) {
        this.editor = uMLEditor;
        this.newButton = new JButton("New Class");
        this.newButton.setActionCommand("NEW");
        this.newButton.addActionListener(this);
        this.saveButton = new JButton("Save All");
        this.saveButton.setActionCommand("SAVE");
        this.saveButton.addActionListener(this);
        this.openButton = new JButton("Open Directory");
        this.openButton.setActionCommand("OPEN");
        this.openButton.addActionListener(this);
        this.deleteButton = new JButton("Delete Item");
        this.deleteButton.setActionCommand("DELETE");
        this.deleteButton.addActionListener(this);
        this.generateButton = new JButton("Generate Source");
        this.generateButton.setActionCommand("GENERATE");
        this.generateButton.addActionListener(this);
        this.printButton = new JButton("Print Diagram");
        this.printButton.setActionCommand("PRINT");
        this.printButton.addActionListener(this);
        this.quitButton = new JButton("Quit Quj");
        this.quitButton.setActionCommand("QUIT");
        this.quitButton.addActionListener(this);
        this.setLayout(new GridLayout(1, 7));
        this.add(this.newButton);
        this.add(this.saveButton);
        this.add(this.openButton);
        this.add(this.generateButton);
        this.add(this.printButton);
        this.add(this.deleteButton);
        this.add(this.quitButton);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String string = actionEvent.getActionCommand();
        if (string.equals("NEW")) {
            this.editor.newItem();
        } else if (string.equals("SAVE")) {
            this.editor.saveAll();
        } else if (string.equals("OPEN")) {
            this.editor.open();
        } else if (string.equals("GENERATE")) {
            this.editor.generate();
        } else if (string.equals("PRINT")) {
            this.editor.printToPaper();
        } else if (string.equals("DELETE")) {
            this.editor.deleteItem();
        } else if (string.equals("QUIT")) {
            this.editor.quit();
        }
    }
}

