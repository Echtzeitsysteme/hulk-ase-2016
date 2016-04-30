/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import quj.Member;
import quj.MemberPanel;

class MemberEditorPanel
extends JPanel {
    JLabel protectionLabel = new JLabel("Protection");
    JLabel finalLabel = new JLabel("");
    JLabel staticLabel = new JLabel("");
    JLabel transientLabel = new JLabel("");
    JLabel typeLabel = new JLabel("Type");
    JLabel nameLabel = new JLabel("Name");
    JLabel defaultValueLabel = new JLabel("Def. Value");
    JCheckBox finalCheckBox = new JCheckBox("Final?");
    JCheckBox staticCheckBox = new JCheckBox("Static?");
    JCheckBox transientCheckBox = new JCheckBox("Transient?");
    JCheckBox genGetCheckBox;
    JCheckBox genSetCheckBox;
    JCheckBox genAddCheckBox;
    JCheckBox genRemoveCheckBox;
    JTextField typeText = new JTextField();
    JTextField nameText = new JTextField();
    JTextField protectionText = new JTextField();
    JTextField defaultValueText = new JTextField();
    JButton okButton = new JButton("OK");
    JButton cancelButton;

    MemberEditorPanel(MemberPanel memberPanel) {
        this.okButton.setActionCommand("OK");
        this.okButton.addActionListener(memberPanel);
        this.cancelButton = new JButton("Cancel");
        this.cancelButton.setActionCommand("CANCEL");
        this.cancelButton.addActionListener(memberPanel);
        this.genGetCheckBox = new JCheckBox("Get");
        this.genSetCheckBox = new JCheckBox("Set");
        this.genAddCheckBox = new JCheckBox("Add");
        this.genRemoveCheckBox = new JCheckBox("Remove");
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridy = 0;
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
        this.add((Component)this.protectionText, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.finalLabel, gridBagConstraints);
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
        this.add((Component)this.staticLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.staticCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.transientLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.transientCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.typeLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.typeText, gridBagConstraints);
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
        this.add((Component)this.defaultValueLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.defaultValueText, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.okButton, gridBagConstraints);
        ++gridBagConstraints.gridx;
        this.add((Component)this.cancelButton, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.genGetCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 0;
        this.add((Component)this.genSetCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.genAddCheckBox, gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 0;
        this.add((Component)this.genRemoveCheckBox, gridBagConstraints);
    }

    void saveMember(Member member) {
        if (member == null) {
            return;
        }
        member.setProtection(this.protectionText.getText());
        member.setFinal(this.finalCheckBox.isSelected());
        member.setStatic(this.staticCheckBox.isSelected());
        member.setTransient(this.transientCheckBox.isSelected());
        member.setType(this.typeText.getText());
        member.setName(this.nameText.getText());
        member.setDefaultValue(this.defaultValueText.getText());
    }

    void clearFields() {
        this.protectionText.setText("private");
        this.finalCheckBox.setSelected(false);
        this.staticCheckBox.setSelected(false);
        this.transientCheckBox.setSelected(false);
        this.typeText.setText("");
        this.nameText.setText("");
        this.defaultValueText.setText("");
    }

    void editMember(Member member) {
        if (member != null) {
            this.protectionText.setText(member.getProtection());
            this.finalCheckBox.setSelected(member.isFinal());
            this.staticCheckBox.setSelected(member.isStatic());
            this.transientCheckBox.setSelected(member.isTransient());
            this.typeText.setText(member.getType());
            this.nameText.setText(member.getName());
            this.defaultValueText.setText(member.getDefaultValue());
        } else {
            this.clearFields();
        }
    }

    boolean generateGet() {
        return this.genGetCheckBox.isSelected();
    }

    boolean generateSet() {
        return this.genSetCheckBox.isSelected();
    }

    boolean generateAdd() {
        return this.genAddCheckBox.isSelected();
    }

    boolean generateRemove() {
        return this.genRemoveCheckBox.isSelected();
    }
}

