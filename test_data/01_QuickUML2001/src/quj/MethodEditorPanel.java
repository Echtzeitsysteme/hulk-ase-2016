/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import quj.Method;
import quj.MethodPanel;

class MethodEditorPanel
extends JPanel {
    JLabel protectionLabel = new JLabel("Protection");
    JLabel constructorLabel = new JLabel("");
    JLabel finalLabel = new JLabel("");
    JLabel staticLabel = new JLabel("");
    JLabel abstractLabel = new JLabel("");
    JLabel typeLabel = new JLabel("Return Type");
    JLabel nameLabel = new JLabel("Name");
    JLabel argumentsLabel = new JLabel("Arguments");
    JLabel exceptionsLabel = new JLabel("Exceptions");
    JLabel defaultValueLabel = new JLabel("Def. Value");
    JCheckBox constructorCheckBox = new JCheckBox("Constructor?");
    JCheckBox finalCheckBox = new JCheckBox("Final?");
    JCheckBox staticCheckBox = new JCheckBox("Static?");
    JCheckBox abstractCheckBox = new JCheckBox("Abstract?");
    JTextArea argumentsText = new JTextArea();
    JTextArea exceptionsText = new JTextArea();
    JTextField typeText = new JTextField(30);
    JTextField nameText = new JTextField();
    JTextField protectionText = new JTextField();
    JTextField defaultValueText = new JTextField();
    JButton okButton = new JButton("OK");
    JButton cancelButton;

    MethodEditorPanel(MethodPanel methodPanel) {
        this.okButton.setActionCommand("OK");
        this.okButton.addActionListener(methodPanel);
        this.cancelButton = new JButton("Cancel");
        this.cancelButton.setActionCommand("CANCEL");
        this.cancelButton.addActionListener(methodPanel);
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
        this.add((Component)this.constructorLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 2;
        this.add((Component)this.constructorCheckBox, gridBagConstraints);
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
        this.add((Component)this.argumentsLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 1;
        this.add((Component)new JScrollPane(this.argumentsText), gridBagConstraints);
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        gridBagConstraints.fill = 0;
        this.add((Component)this.exceptionsLabel, gridBagConstraints);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ++gridBagConstraints.gridx;
        gridBagConstraints.fill = 1;
        this.add((Component)new JScrollPane(this.exceptionsText), gridBagConstraints);
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
    }

    void saveMethod(Method method) {
        if (method == null) {
            return;
        }
        method.setConstructor(this.constructorCheckBox.isSelected());
        method.setFinal(this.finalCheckBox.isSelected());
        method.setStatic(this.staticCheckBox.isSelected());
        method.setAbstract(this.abstractCheckBox.isSelected());
        method.setType(this.typeText.getText());
        method.setName(this.nameText.getText());
        method.setProtection(this.protectionText.getText());
        method.setDefaultValue(this.defaultValueText.getText());
        method.clearArguments();
        StringTokenizer stringTokenizer = new StringTokenizer(this.argumentsText.getText(), "\n");
        while (stringTokenizer.hasMoreTokens()) {
            String string = stringTokenizer.nextToken();
            try {
                StringTokenizer stringTokenizer2 = new StringTokenizer(string);
                String string2 = stringTokenizer2.nextToken();
                String string3 = stringTokenizer2.nextToken();
                method.setArgument(string3, string2);
                continue;
            }
            catch (Exception var7_7) {
                // empty catch block
            }
        }
        method.getExceptions().clear();
        stringTokenizer = new StringTokenizer(this.exceptionsText.getText(), "\n");
        while (stringTokenizer.hasMoreTokens()) {
            method.getExceptions().addElement(stringTokenizer.nextToken().trim());
        }
    }

    void clearFields() {
        this.constructorCheckBox.setSelected(false);
        this.finalCheckBox.setSelected(false);
        this.staticCheckBox.setSelected(false);
        this.abstractCheckBox.setSelected(false);
        this.argumentsText.setText("");
        this.exceptionsText.setText("");
        this.typeText.setText("");
        this.nameText.setText("");
        this.protectionText.setText("");
        this.defaultValueText.setText("");
    }

    void editMethod(Method method) {
        if (method != null) {
            this.constructorCheckBox.setSelected(method.isConstructor());
            this.finalCheckBox.setSelected(method.isFinal());
            this.staticCheckBox.setSelected(method.isStatic());
            this.abstractCheckBox.setSelected(method.isAbstract());
            this.typeText.setText(method.getType());
            this.nameText.setText(method.getName());
            this.protectionText.setText(method.getProtection());
            this.defaultValueText.setText(method.getDefaultValue());
            StringBuffer stringBuffer = new StringBuffer();
            Vector vector = method.getArgumentNames();
            int n = 0;
            while (n < vector.size()) {
                stringBuffer.append(method.getArgument((String)vector.elementAt(n)) + " ");
                stringBuffer.append((String)vector.elementAt(n) + "\n");
                ++n;
            }
            this.argumentsText.setText(stringBuffer.toString());
            stringBuffer = new StringBuffer();
            vector = method.getExceptions();
            int n2 = 0;
            while (n2 < vector.size()) {
                stringBuffer.append((String)vector.elementAt(n2) + "\n");
                ++n2;
            }
            this.exceptionsText.setText(stringBuffer.toString());
        } else {
            this.clearFields();
        }
    }
}

