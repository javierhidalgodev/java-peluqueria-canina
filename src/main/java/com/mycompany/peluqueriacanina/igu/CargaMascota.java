/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Cuidador;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Javi
 */
public class CargaMascota extends javax.swing.JFrame {
//    Controladora controladora = new Controladora();

    Controladora controladora;
    JFrame ventanaAnterior;

    public CargaMascota(Controladora controladora, JFrame ventanaAnterior) {
        this.controladora = controladora;
        this.ventanaAnterior = ventanaAnterior;

        initComponents();
        setTitle("Peluquería canina");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pForm = new javax.swing.JPanel();
        lClienteID = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lRaza = new javax.swing.JLabel();
        lColor = new javax.swing.JLabel();
        lAlergico = new javax.swing.JLabel();
        lAtencionEspecial = new javax.swing.JLabel();
        lDNIDuenio = new javax.swing.JLabel();
        lObservaciones = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        comboAlergico = new javax.swing.JComboBox<>();
        comboAtencionEspecial = new javax.swing.JComboBox<>();
        txtDNIDuenio = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        pImage = new javax.swing.JPanel();
        iCompany = new javax.swing.JLabel();
        pActionBtns = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitle.setText("Peluquería canina");

        javax.swing.GroupLayout pTitleLayout = new javax.swing.GroupLayout(pTitle);
        pTitle.setLayout(pTitleLayout);
        pTitleLayout.setHorizontalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitle)
                .addGap(327, 327, 327))
        );
        pTitleLayout.setVerticalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTitleLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lTitle)
                .addGap(30, 30, 30))
        );

        lClienteID.setLabelFor(txtCliente);
        lClienteID.setText("Cliente nº:");

        lNombre.setLabelFor(txtNombre);
        lNombre.setText("Nombre:");

        lRaza.setLabelFor(txtRaza);
        lRaza.setText("Raza:");

        lColor.setLabelFor(txtColor);
        lColor.setText("Color:");

        lAlergico.setLabelFor(comboAlergico);
        lAlergico.setText("Alérgico:");

        lAtencionEspecial.setLabelFor(comboAtencionEspecial);
        lAtencionEspecial.setText("Atención especial:");

        lDNIDuenio.setLabelFor(txtDNIDuenio);
        lDNIDuenio.setText("DNI dueño");

        lObservaciones.setLabelFor(txtObservaciones);
        lObservaciones.setText("Observaciones:");

        comboAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Sí", "No" }));

        comboAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Sí", "No" }));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        javax.swing.GroupLayout pFormLayout = new javax.swing.GroupLayout(pForm);
        pForm.setLayout(pFormLayout);
        pFormLayout.setHorizontalGroup(
            pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pFormLayout.createSequentialGroup()
                        .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lClienteID)
                            .addComponent(lNombre)
                            .addComponent(lRaza)
                            .addComponent(lColor)
                            .addComponent(lAlergico))
                        .addGap(59, 59, 59)
                        .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(txtRaza)
                            .addComponent(txtColor)
                            .addComponent(txtCliente)))
                    .addGroup(pFormLayout.createSequentialGroup()
                        .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAtencionEspecial)
                            .addComponent(lDNIDuenio)
                            .addComponent(lObservaciones))
                        .addGap(18, 18, 18)
                        .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNIDuenio)
                            .addGroup(pFormLayout.createSequentialGroup()
                                .addComponent(comboAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pFormLayout.setVerticalGroup(
            pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lClienteID)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAlergico)
                    .addComponent(comboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAtencionEspecial)
                    .addComponent(comboAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDNIDuenio)
                    .addComponent(txtDNIDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        iCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dog-face-logo-free-vector.jpg"))); // NOI18N

        javax.swing.GroupLayout pImageLayout = new javax.swing.GroupLayout(pImage);
        pImage.setLayout(pImageLayout);
        pImageLayout.setHorizontalGroup(
            pImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pImageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iCompany)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pImageLayout.setVerticalGroup(
            pImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iCompany)
                .addGap(60, 60, 60))
        );

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pActionBtnsLayout = new javax.swing.GroupLayout(pActionBtns);
        pActionBtns.setLayout(pActionBtnsLayout);
        pActionBtnsLayout.setHorizontalGroup(
            pActionBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pActionBtnsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        pActionBtnsLayout.setVerticalGroup(
            pActionBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pActionBtnsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pActionBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addComponent(pForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pActionBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addComponent(pTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pActionBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void dispose() {
        if (ventanaAnterior != null) {
            ventanaAnterior.setVisible(true);
        }

        super.dispose();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(pForm, "¿Estás seguro de que quieres limpiar el formulario?", "Limpiar formulario", JOptionPane.YES_NO_OPTION);

        if (confirm == 0) {
            txtCliente.setText("");
            txtColor.setText("");
            txtNombre.setText("");
            txtDNIDuenio.setText("");
            txtObservaciones.setText("");
            txtRaza.setText("");
            comboAlergico.setSelectedIndex(0);
            comboAtencionEspecial.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private boolean isFormValid() {
        boolean isValid = txtCliente.getText().trim().isEmpty() || txtColor.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty() || txtDNIDuenio.getText().trim().isEmpty() || txtObservaciones.getText().trim().isEmpty() || txtRaza.getText().trim().isEmpty() || comboAlergico.getSelectedItem().equals("---") || comboAtencionEspecial.getSelectedItem().equals("---");

        return isValid;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!isFormValid()) {
            // 1. Se recupera la data del formulario
            int idCliente = Integer.parseInt(txtCliente.getText());
            String color = txtColor.getText();
            String nombre = txtNombre.getText();
            int dni_duenio = Integer.parseInt(txtDNIDuenio.getText());
            String observaciones = txtObservaciones.getText();
            String raza = txtRaza.getText();
            String alergico = (String) comboAlergico.getSelectedItem();
            String atencionEspecial = (String) comboAtencionEspecial.getSelectedItem();

            // 2. Se llama a la instancia del controlador para guardar la data del Dueño (si procede) y de la mascota
//        Cuidador cuidadorNuevo = controladora.encontrarCuidador(nom)
            Cuidador cuidadorExistente = controladora.encontrarCuidador(dni_duenio);

            if (cuidadorExistente != null) {
                controladora.guardarMascota(idCliente, color, nombre, dni_duenio, observaciones, raza, alergico, atencionEspecial, cuidadorExistente);

                JOptionPane.showMessageDialog(pPrincipal, "Mascota añadida", "Operación existosa", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(pPrincipal, "No se encontró un cuidador con el DNI indicado. Por favor, ingrese un DNI correcto o inscribase en la aplicación.", "Error", JOptionPane.OK_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(pPrincipal, "Todos los campos marcados con * son obligatorios", "Formulario incompleto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboAlergico;
    private javax.swing.JComboBox<String> comboAtencionEspecial;
    private javax.swing.JLabel iCompany;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAlergico;
    private javax.swing.JLabel lAtencionEspecial;
    private javax.swing.JLabel lClienteID;
    private javax.swing.JLabel lColor;
    private javax.swing.JLabel lDNIDuenio;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lObservaciones;
    private javax.swing.JLabel lRaza;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pActionBtns;
    private javax.swing.JPanel pForm;
    private javax.swing.JPanel pImage;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDNIDuenio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
