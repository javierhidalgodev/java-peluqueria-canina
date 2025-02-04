/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Cuidador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class EditCuidador extends javax.swing.JFrame {

    Controladora controladora = null;
    Cuidador cuidador = null;
    VerCuidadores ventanaAnterior = null;

    public EditCuidador(Controladora controladora, Cuidador cuidador, VerCuidadores ventanaAnterior) {
        this.controladora = controladora;
        this.cuidador = cuidador;
        this.ventanaAnterior = ventanaAnterior;

        initComponents();
        setLocationRelativeTo(null);

        txtNombre.setText(cuidador.getNombre());
        txtTelefono.setText(cuidador.getTelefono());
        txtDireccion.setText(cuidador.getDireccion());
        txtDNI.setText(String.valueOf(cuidador.getId_cuidador()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pGeneral = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        lDNI = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lTitle.setText("EDITANDO CUIDADOR");

        javax.swing.GroupLayout pTitleLayout = new javax.swing.GroupLayout(pTitle);
        pTitle.setLayout(pTitleLayout);
        pTitleLayout.setHorizontalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTitleLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
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

        txtDNI.setEditable(false);

        lDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lDNI.setText("DNI* :");

        lDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lDireccion.setText("Dirección* :");

        lTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lTelefono.setText("Teléfono* :");

        lNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNombre.setText("Nombre* :");

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
                .addGap(59, 59, 59)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addComponent(lDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion))
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addComponent(lDNI)
                        .addGap(18, 18, 18)
                        .addComponent(txtDNI))
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addComponent(lNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addComponent(lTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGrabar)
                .addGap(143, 143, 143))
        );
        pGeneralLayout.setVerticalGroup(
            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnGrabar)
                .addContainerGap(164, Short.MAX_VALUE))
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
        int confirmacion = JOptionPane.showConfirmDialog(pPrincipal, "¿Está seguro que desea editar el contacto?", "Editando...", JOptionPane.YES_NO_OPTION);

        if (confirmacion == 0) {
            String nombre = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String direccion = txtDireccion.getText();

            cuidador.setNombre(nombre);
            cuidador.setTelefono(telefono);
            cuidador.setDireccion(direccion);

            try {
                controladora.editarCuidador(cuidador);
                ventanaAnterior.setEnabled(true);
                ventanaAnterior.initTable();

                JOptionPane.showMessageDialog(pPrincipal, "Cuidador editado correctamente", "Edición completada", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(pPrincipal, "Algo fue mal...", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JLabel lDNI;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pGeneral;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
