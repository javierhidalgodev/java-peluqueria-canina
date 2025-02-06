package com.mycompany.peluqueriacanina.utils;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Highlighter;

public class FormValidator {

    private static JComponent jComponentDemo;

    public static Map<JComponent, String> validateForm(JComponent... fields) {
        Map<JComponent, String> errors = new HashMap<>();

        for (JComponent f : fields) {
            if (f instanceof JTextField) {
                JTextField textField = (JTextField) f;
                
                if (textField.getText().trim().isEmpty()) {
                    errors.put(f, "Este campo es requerido");
                    f.setBorder(BorderFactory.createLineBorder(Color.red));
                } else {
                    jComponentDemo = new JTextField();
                    f.setBorder(jComponentDemo.getBorder());
                }
            } else if (f instanceof JComboBox) {
                JComboBox comboBox = (JComboBox) f;

                if (!comboBox.getSelectedItem().equals("Sí") && !comboBox.getSelectedItem().equals("No")) {
                    errors.put(f, "Debes seleccionar una de las opciones");
                    f.setBorder(BorderFactory.createLineBorder(Color.red));
                } else {
                    jComponentDemo = new JComboBox();
                    f.setBorder(jComponentDemo.getBorder());
                }
            } else if (f instanceof JTextArea) {
                JTextArea textArea = (JTextArea) f;

                if (textArea.getText().trim().isEmpty()) {
                    errors.put(f, "Este campo es requerido");
                    f.setBorder(BorderFactory.createLineBorder(Color.red));
                } else {
                    jComponentDemo = new JTextArea();
                    f.setBorder(jComponentDemo.getBorder());
                }
            }
        }

        return errors;
    }

}
