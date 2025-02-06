package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.utils.FormValidator;
import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Cuidador;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class CargaCuidador extends javax.swing.JFrame {

    Controladora controladora;
    JFrame ventanaAnterior;

    public CargaCuidador(Controladora controladora, JFrame ventanaAnterior) {
        this.controladora = controladora;
        this.ventanaAnterior = ventanaAnterior;

        initComponents();
        setTitle("Nuevo cuidador");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lNuevoCuidador = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lTelefono = new javax.swing.JLabel();
        lDireccion = new javax.swing.JLabel();
        lDNI = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lTitle.setText("Peluquería Canina");

        javax.swing.GroupLayout pTitleLayout = new javax.swing.GroupLayout(pTitle);
        pTitle.setLayout(pTitleLayout);
        pTitleLayout.setHorizontalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTitleLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lTitle)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pTitleLayout.setVerticalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTitleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lTitle)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lNuevoCuidador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lNuevoCuidador.setText("Nuevo cuidador");

        lNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNombre.setText("Nombre* :");

        lTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lTelefono.setText("Teléfono* :");

        lDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lDireccion.setLabelFor(txtDireccion);
        lDireccion.setText("Dirección* :");

        lDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lDNI.setText("DNI* :");

        btnGrabar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnGrabar))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lDireccion)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDireccion))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lDNI)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDNI))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lTelefono)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lNuevoCuidador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lNuevoCuidador)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGrabar)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addComponent(pTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        Map<JComponent, String> errors = FormValidator.validateForm(txtNombre, txtTelefono, txtDireccion, txtDNI);

        if (errors.isEmpty()) {
            String nombre = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String direccion = txtDireccion.getText();
            int DNI = Integer.parseInt(txtDNI.getText());

            Cuidador cuidadorExistente = controladora.encontrarCuidador(DNI);

            System.out.println(cuidadorExistente);
            if (cuidadorExistente == null) {
                try {
                    controladora.guardarCuidador(nombre, telefono, direccion, DNI);
                    JOptionPane.showMessageDialog(pPrincipal, "Cuidador añadido correctamente", "Nuevo cuidador añadido", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(pPrincipal, "Algo fue mal...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(pPrincipal, "El usuario que intenta registrar ya existe", "Usuario ya registrado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            for(Map.Entry<JComponent, String> entry : errors.entrySet()) {
                System.out.println(entry.getValue());
            }
            
            JOptionPane.showMessageDialog(pPrincipal, "Todos los campos marcados con * son obligatorios.", "Falta información", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lDNI;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lNuevoCuidador;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
