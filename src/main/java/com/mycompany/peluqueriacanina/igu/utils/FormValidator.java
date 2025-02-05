package com.mycompany.peluqueriacanina.igu.utils;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormValidator {

    public static Map<JComponent, String> validateForm(JComponent... fields) {
        Map<JComponent, String> errors = new HashMap<>();

        for (JComponent f : fields) {
            if (f instanceof JTextField) {
                JTextField textField = (JTextField) f;

                if (textField.getText().trim().isEmpty()) {
                    errors.put(f, "Este campo es requerido");
                }
            } else if (f instanceof JComboBox) {
                JComboBox comboBox = (JComboBox) f;

                if (!comboBox.getSelectedItem().equals("Sí") && !comboBox.getSelectedItem().equals("No")) {
                    errors.put(f, "Debes seleccionar una de las opciones");
                }
            } else if (f instanceof JTextArea) {
                JTextArea textArea = (JTextArea) f;
                
                if(textArea.getText().trim().isEmpty()) {
                    errors.put(f, "Este campo es requerido");
                }
            }
        }

        return errors;
    }

}
