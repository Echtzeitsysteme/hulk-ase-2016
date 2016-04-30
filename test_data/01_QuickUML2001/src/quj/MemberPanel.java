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
import quj.Member;
import quj.MemberEditorPanel;
import quj.MemberListPanel;
import quj.Method;

class MemberPanel
extends JPanel
implements ActionListener {
    ItemPanel itemPanel;
    Member currentMember;
    MemberEditorPanel editor;
    MemberListPanel list;
    CardLayout layout;
    JPanel cards;

    MemberPanel(ItemPanel itemPanel) {
        this.itemPanel = itemPanel;
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(7, 2, 3, 2);
        JLabel jLabel = new JLabel("Members");
        jLabel.setHorizontalAlignment(0);
        this.add((Component)jLabel, gridBagConstraints);
        this.layout = new CardLayout();
        this.cards = new JPanel();
        this.cards.setLayout(this.layout);
        this.editor = new MemberEditorPanel(this);
        this.list = new MemberListPanel(this);
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
            this.currentMember = null;
            this.layout.show(this.cards, "editor");
        } else if (string.equals("EDIT")) {
            this.currentMember = this.list.getSelectedMember();
            this.editor.editMember(this.currentMember);
            this.layout.show(this.cards, "editor");
        } else if (string.equals("DELETE")) {
            this.currentMember = this.list.getSelectedMember();
            if (this.currentMember != null) {
                this.getItemPanel().getCurrentItem().getMembers().remove(this.currentMember);
                this.list.setItem(this.getItemPanel().getCurrentItem());
            }
        } else if (string.equals("OK")) {
            boolean bl = false;
            if (this.currentMember == null) {
                bl = true;
                this.currentMember = new Member();
            }
            this.editor.saveMember(this.currentMember);
            if (this.currentMember.getName().equals("")) {
                bl = false;
            }
            if (bl) {
                Item item = this.getItemPanel().getCurrentItem();
                item.getMembers().addElement(this.currentMember);
                this.list.setItem(item);
            }
            this.generateMethods(this.currentMember.getType(), this.currentMember.getName());
            this.layout.show(this.cards, "list");
        } else if (string.equals("CANCEL")) {
            this.editor.clearFields();
            this.layout.show(this.cards, "list");
        }
    }

    void generateMethods(String string, String string2) {
        int n;
        boolean bl;
        String string3;
        Method method;
        String string4 = string2.substring(0, 1).toUpperCase() + string2.substring(1, string2.length());
        Vector vector = this.getItemPanel().getCurrentItem().getMethods();
        boolean bl2 = false;
        Item item = this.getItemPanel().getCurrentItem();
        if (this.editor.generateGet()) {
            bl = false;
            n = 0;
            while (n < vector.size()) {
                method = (Method)vector.elementAt(n);
                if (method.getName().equals("get" + string4)) {
                    bl = true;
                    break;
                }
                ++n;
            }
            if (!bl) {
                method = new Method();
                method.setProtection("public");
                method.setName("get" + string4);
                method.setType(string);
                method.setDefaultValue(string2);
                item.getMethods().addElement(method);
                bl2 = true;
            }
        }
        if (this.editor.generateSet()) {
            bl = false;
            n = 0;
            while (n < vector.size()) {
                method = (Method)vector.elementAt(n);
                if (method.getName().equals("set" + string4)) {
                    bl = true;
                    break;
                }
                ++n;
            }
            if (!bl) {
                method = new Method();
                method.setProtection("public");
                method.setName("set" + string4);
                method.setType("void");
                method.setDefinition(string2 + " = " + string2 + "_;");
                method.setArgument(string2 + "_", string);
                item.getMethods().addElement(method);
                bl2 = true;
            }
        }
        if (this.editor.generateAdd()) {
            bl = false;
            n = 0;
            while (n < vector.size()) {
                method = (Method)vector.elementAt(n);
                if (method.getName().equals("add" + string4)) {
                    bl = true;
                    break;
                }
                ++n;
            }
            if (!bl) {
                string3 = string.endsWith("[]") ? string.substring(0, string.length() - 2) : string;
                method = new Method();
                method.setProtection("public");
                method.setName("add" + string4);
                method.setType("void");
                method.setDefinition("// fill me in");
                method.setArgument(string2 + "_", string3);
                item.getMethods().addElement(method);
                bl2 = true;
            }
        }
        if (this.editor.generateRemove()) {
            bl = false;
            n = 0;
            while (n < vector.size()) {
                method = (Method)vector.elementAt(n);
                if (method.getName().equals("remove" + string4)) {
                    bl = true;
                    break;
                }
                ++n;
            }
            if (!bl) {
                string3 = string.endsWith("[]") ? string.substring(0, string.length() - 2) : string;
                method = new Method();
                method.setProtection("public");
                method.setName("remove" + string4);
                method.setType("void");
                method.setDefinition("// fill me in");
                method.setArgument(string2 + "_", string3);
                item.getMethods().addElement(method);
                bl2 = true;
            }
        }
        if (bl2) {
            this.getItemPanel().setItem(item);
        }
    }
}

