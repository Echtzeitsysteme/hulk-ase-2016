/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import quj.Item;
import quj.ItemEditor;
import quj.MemberPanel;
import quj.MethodPanel;
import quj.UMLEditor;

class ItemPanel
extends JPanel {
    UMLEditor editor;
    ItemEditor itemEditor;
    MemberPanel memberPanel;
    MethodPanel methodPanel;

    public ItemPanel(UMLEditor uMLEditor) {
        this.editor = uMLEditor;
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(7, 3, 2, 3);
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 1.0;
        this.itemEditor = new ItemEditor(this);
        this.add((Component)this.itemEditor, gridBagConstraints);
        this.memberPanel = new MemberPanel(this);
        gridBagConstraints.gridy = 1;
        this.add((Component)this.memberPanel, gridBagConstraints);
        this.methodPanel = new MethodPanel(this);
        gridBagConstraints.gridy = 2;
        this.add((Component)this.methodPanel, gridBagConstraints);
    }

    void setItem(Item item) {
        this.itemEditor.setItem(item);
        this.memberPanel.setItem(item);
        this.methodPanel.setItem(item);
    }

    Item getCurrentItem() {
        return this.editor.getCurrentItem();
    }

    void saveItem(Item item) {
        this.itemEditor.saveItem(item);
    }
}

