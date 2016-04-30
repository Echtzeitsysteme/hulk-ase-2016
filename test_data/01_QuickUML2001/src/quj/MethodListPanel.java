/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import quj.Item;
import quj.Method;
import quj.MethodPanel;

class MethodListPanel
extends JPanel
implements ListSelectionListener {
    JList list;
    DefaultListModel listModel;
    JButton newButton;
    JButton editButton;
    JButton deleteButton;
    MethodPanel methodPanel;
    Method selectedMethod;

    MethodListPanel(MethodPanel methodPanel) {
        this.methodPanel = methodPanel;
        this.list = new JList();
        this.listModel = new DefaultListModel();
        this.list.addListSelectionListener(this);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = 2;
        this.newButton = new JButton("New");
        this.newButton.setActionCommand("NEW");
        this.newButton.addActionListener(this.methodPanel);
        this.editButton = new JButton("Edit");
        this.editButton.setActionCommand("EDIT");
        this.editButton.addActionListener(this.methodPanel);
        this.deleteButton = new JButton("Delete");
        this.deleteButton.setActionCommand("DELETE");
        this.deleteButton.addActionListener(this.methodPanel);
        this.add((Component)this.newButton, gridBagConstraints);
        ++gridBagConstraints.gridx;
        this.add((Component)this.editButton, gridBagConstraints);
        ++gridBagConstraints.gridx;
        this.add((Component)this.deleteButton, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.add((Component)new JScrollPane(this.list), gridBagConstraints);
    }

    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        this.selectedMethod = (Method)((JList)listSelectionEvent.getSource()).getSelectedValue();
    }

    Method getSelectedMethod() {
        return this.selectedMethod;
    }

    void setItem(Item item) {
        Vector vector = item.getMethods();
        this.listModel.clear();
        int n = 0;
        while (n < vector.size()) {
            this.listModel.addElement((Method)vector.elementAt(n));
            ++n;
        }
        this.list.setModel(this.listModel);
    }
}

