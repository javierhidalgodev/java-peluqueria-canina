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

/**
 *
 * @author Javi
 */
public class EditMascota extends javax.swing.JFrame {

    Controladora controladora = null;
    Mascota mascota = null;
    VerMascotas ventanaAnterior = null;

    public EditMascota(Controladora controladora, Mascota
            mascota, VerMascotas ventanaAnterior) {
        this.controladora = controladora;
        this.mascota = mascota;
        this.ventanaAnterior = ventanaAnterior;

        initComponents();
        setLocationRelativeTo(null);
        setTitle("Editor de mascotas");

        lDNICuidador.setText("DNI del cuidador: " + mascota.getCuidador().getId_cuidador());
        txtNumeroCliente.setText(String.valueOf(mascota.getNum_cliente()));
        txtNombre.setText(mascota.getNombre_mascota());
        txtRaza.setText(mascota.getRaza());
        txtColor.setText(mascota.getColor());
        comboAlergico.setSelectedIndex(mascota.isAlergico() ? 0 : 1);
        comboAtencionEspecial.setSelectedIndex(mascota.isAtencion_especial()? 0 : 1);
        txtaObservaciones.setText(mascota.getObservaciones());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pGeneral = new javax.swing.JPanel();
        lDNICuidador = new javax.swing.JLabel();
        lNumeroCliente = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        lColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lAlergico = new javax.swing.JLabel();
        comboAlergico = new javax.swing.JComboBox<>();
        lAtencionEspecial = new javax.swing.JLabel();
        comboAtencionEspecial = new javax.swing.JComboBox<>();
        lObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaObservaciones = new javax.swing.JTextArea();
        btnGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lTitle.setText("EDITANDO MASCOTA");

        javax.swing.GroupLayout pTitleLayout = new javax.swing.GroupLayout(pTitle);
        pTitle.setLayout(pTitleLayout);
        pTitleLayout.setHorizontalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTitleLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(lTitle)
                .addGap(103, 103, 103))
        );
        pTitleLayout.setVerticalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTitleLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lTitle)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lDNICuidador.setText("DNI del cuidador: ");

        lNumeroCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNumeroCliente.setText("Nº Cliente:");

        txtNumeroCliente.setEditable(false);

        lNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNombre.setText("Nombre* :");

        lRaza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lRaza.setText("Raza* :");

        lColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lColor.setText("Color* :");

        lAlergico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lAlergico.setText("Alérgico* :");

        comboAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        lAtencionEspecial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lAtencionEspecial.setText("Atención especial:");

        comboAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        lObservaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lObservaciones.setText("Observaciones* :");

        txtaObservaciones.setColumns(20);
        txtaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtaObservaciones);

        btnGrabar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGrabar.setText("Modificar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pGeneralLayout = new javax.swing.GroupLayout(pGeneral);
        pGeneral.setLayout(pGeneralLayout);
        pGeneralLayout.setHorizontalGroup(
            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralLayout.createSequentialGroup()
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pGeneralLayout.createSequentialGroup()
                                .addComponent(lNumeroCliente)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pGeneralLayout.createSequentialGroup()
                                .addComponent(lAtencionEspecial)
                                .addGap(18, 18, 18)
                                .addComponent(comboAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pGeneralLayout.createSequentialGroup()
                                    .addComponent(lColor)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtColor))
                                .addComponent(lObservaciones, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pGeneralLayout.createSequentialGroup()
                                    .addComponent(lNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pGeneralLayout.createSequentialGroup()
                                    .addComponent(lRaza)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pGeneralLayout.createSequentialGroup()
                                    .addComponent(lAlergico)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnGrabar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGeneralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lDNICuidador)
                .addGap(150, 150, 150))
        );
        pGeneralLayout.setVerticalGroup(
            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lDNICuidador)
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumeroCliente)
                    .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAlergico)
                    .addComponent(comboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAtencionEspecial)
                    .addComponent(comboAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGrabar)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addComponent(pTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            ventanaAnterior.setEnabled(true);
        }

        super.dispose();
    }

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(pPrincipal, "¿Está seguro que desea editar la mascota?", "Editando...", JOptionPane.YES_NO_OPTION);

        if (confirmacion == 0) {
            String nombre = txtNombre.getText();
            String raza = txtRaza.getText();
            String color = txtColor.getText();
            String alergico = String.valueOf(comboAlergico.getSelectedItem());
            String atencionEspecial = String.valueOf(comboAtencionEspecial.getSelectedItem());
            String observaciones = txtaObservaciones.getText();
            
            mascota.setNombre_mascota(nombre);
            mascota.setRaza(raza);
            mascota.setColor(color);
            mascota.setAlergico(alergico.equals("Sí") ? true : false);
            mascota.setAtencion_especial(atencionEspecial.equals("Sí") ? true : false);
            mascota.setObservaciones(observaciones);

            try {
                controladora.editarMascota(mascota);
                ventanaAnterior.setEnabled(true);
                ventanaAnterior.initTable();

                JOptionPane.showMessageDialog(pPrincipal, "Mascota editada correctamente", "Edición completada", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(pPrincipal, "Algo fue mal...", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<String> comboAlergico;
    private javax.swing.JComboBox<String> comboAtencionEspecial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAlergico;
    private javax.swing.JLabel lAtencionEspecial;
    private javax.swing.JLabel lColor;
    private javax.swing.JLabel lDNICuidador;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lNumeroCliente;
    private javax.swing.JLabel lObservaciones;
    private javax.swing.JLabel lRaza;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pGeneral;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextArea txtaObservaciones;
    // End of variables declaration//GEN-END:variables
}
