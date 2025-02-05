package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class SeleccionData extends javax.swing.JFrame {

    JFrame ventanaAnterior;

    public SeleccionData(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
        
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Visualización de datos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pGeneral = new javax.swing.JPanel();
        lGeneral = new javax.swing.JLabel();
        btnMascotas = new javax.swing.JButton();
        btnCuidadores = new javax.swing.JButton();
        lGeneral1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualización de datos");

        lTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lTitle.setText("PELUQUERÍA CANINA");

        javax.swing.GroupLayout pTitleLayout = new javax.swing.GroupLayout(pTitle);
        pTitle.setLayout(pTitleLayout);
        pTitleLayout.setHorizontalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitle)
                .addGap(103, 103, 103))
        );
        pTitleLayout.setVerticalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTitleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lTitle)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lGeneral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lGeneral.setText("Seleccione una de las opciones");

        btnMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dog-face-logo-free-vectorx100.jpg"))); // NOI18N
        btnMascotas.setText("MASCOTAS");
        btnMascotas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMascotas.setIconTextGap(10);
        btnMascotas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        btnCuidadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuidadorx100.png"))); // NOI18N
        btnCuidadores.setText("CUIDADORES");
        btnCuidadores.setAlignmentX(0.5F);
        btnCuidadores.setAlignmentY(0.0F);
        btnCuidadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuidadores.setIconTextGap(10);
        btnCuidadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCuidadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuidadoresActionPerformed(evt);
            }
        });

        lGeneral1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lGeneral1.setText("Visualización de datos");

        javax.swing.GroupLayout pGeneralLayout = new javax.swing.GroupLayout(pGeneral);
        pGeneral.setLayout(pGeneralLayout);
        pGeneralLayout.setHorizontalGroup(
            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGeneralLayout.createSequentialGroup()
                        .addComponent(btnCuidadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGeneralLayout.createSequentialGroup()
                        .addComponent(lGeneral)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGeneralLayout.createSequentialGroup()
                        .addComponent(lGeneral1)
                        .addGap(178, 178, 178))))
        );
        pGeneralLayout.setVerticalGroup(
            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lGeneral1)
                .addGap(18, 18, 18)
                .addComponent(lGeneral)
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuidadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
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
            .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCuidadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuidadoresActionPerformed
        try {
            Controladora controladora = new Controladora();

            VerCuidadores verCuidadores = new VerCuidadores(controladora, SeleccionData.this);
            verCuidadores.setVisible(true);
            
            SeleccionData.this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(pPrincipal, "No se puedo conectar con la base de datos", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCuidadoresActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        try {
            Controladora controladora = new Controladora();

            VerMascotas verMascotas = new VerMascotas(controladora, SeleccionData.this);
            verMascotas.setVisible(true);

            SeleccionData.this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(pPrincipal, "No se puedo conectar con la base de datos", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMascotasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuidadores;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JLabel lGeneral;
    private javax.swing.JLabel lGeneral1;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pGeneral;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    // End of variables declaration//GEN-END:variables
}
