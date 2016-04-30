/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JPanel;
import quj.Item;
import quj.ItemPanel;
import quj.Method;
import quj.MethodEditorPanel;
import quj.MethodListPanel;

class MethodPanel
extends JPanel
implements ActionListener {
    ItemPanel itemPanel;
    Method currentMethod;
    MethodEditorPanel editor;
    MethodListPanel list;
    CardLayout layout;
    JPanel cards;

    MethodPanel(ItemPanel itemPanel) {
        this.itemPanel = itemPanel;
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(7, 2, 3, 2);
        JLabel jLabel = new JLabel("Methods");
        jLabel.setHorizontalAlignment(0);
        this.add((Component)jLabel, gridBagConstraints);
        this.layout = new CardLayout();
        this.cards = new JPanel();
        this.cards.setLayout(this.layout);
        this.editor = new MethodEditorPanel(this);
        this.list = new MethodListPanel(this);
        this.cards.add((Component)this.list, "list");
        this.cards.add((Component)this.editor, "editor");
        this.layout.show(this.cards, "list");
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ++gridBagConstraints.gridy;
        this.add((Component)this.cards, gridBagConstraints);
    }

    void setItem(Item item) {
        this.list.setItem(item);
    }

    ItemPanel getItemPanel() {
        return this.itemPanel;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String string = actionEvent.getActionCommand();
        if (string.equals("NEW")) {
            this.editor.clearFields();
            this.currentMethod = null;
            this.layout.show(this.cards, "editor");
        } else if (string.equals("EDIT")) {
            this.currentMethod = this.list.getSelectedMethod();
            this.editor.editMethod(this.currentMethod);
            this.layout.show(this.cards, "editor");
        } else if (string.equals("DELETE")) {
            this.currentMethod = this.list.getSelectedMethod();
            if (this.currentMethod != null) {
                this.getItemPanel().getCurrentItem().getMethods().remove(this.currentMethod);
                this.list.setItem(this.getItemPanel().getCurrentItem());
            }
        } else if (string.equals("OK")) {
            boolean bl = false;
            if (this.currentMethod == null) {
                bl = true;
                this.currentMethod = new Method();
            }
            this.editor.saveMethod(this.currentMethod);
            if (this.currentMethod.getName().equals("")) {
                bl = false;
            }
            if (bl) {
                Item item = this.getItemPanel().getCurrentItem();
                item.getMethods().addElement(this.currentMethod);
                this.list.setItem(item);
            }
            this.layout.show(this.cards, "list");
        } else if (string.equals("CANCEL")) {
            this.editor.clearFields();
            this.layout.show(this.cards, "list");
        }
    }
}

