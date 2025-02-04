package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javi
 */
public class VerMascotas extends javax.swing.JFrame {

    private Controladora controladora;
    private JFrame ventanaAnterior;

    public VerMascotas(Controladora controladora, JFrame ventanaAnterior) {
        this.controladora = controladora;
        this.ventanaAnterior = ventanaAnterior;

        initComponents();
        setLocationRelativeTo(null);

        initTable();
    }

    @Override
    public void dispose() {
        if (ventanaAnterior != null) {
            ventanaAnterior.setVisible(true);
        }

        super.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pGeneral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lMascotas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lTitle.setText("PELUQUERÍA CANINA");

        javax.swing.GroupLayout pTitleLayout = new javax.swing.GroupLayout(pTitle);
        pTitle.setLayout(pTitleLayout);
        pTitleLayout.setHorizontalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTitleLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTitleLayout.setVerticalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTitleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lTitle)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tData);

        btnEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\frare\\Documents\\NetBeansProjects\\java-peluqueria-canina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\images\\edit-icon.png")); // NOI18N
        btnEdit.setToolTipText("Edit");

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\frare\\Documents\\NetBeansProjects\\java-peluqueria-canina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\images\\delete-icon.png")); // NOI18N
        btnDelete.setToolTipText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lMascotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lMascotas.setText("Mascotas");

        javax.swing.GroupLayout pGeneralLayout = new javax.swing.GroupLayout(pGeneral);
        pGeneral.setLayout(pGeneralLayout);
        pGeneralLayout.setHorizontalGroup(
            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMascotas)
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pGeneralLayout.setVerticalGroup(
            pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lMascotas)
                .addGap(18, 18, 18)
                .addGroup(pGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGeneralLayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tData.getRowCount() > 0) {
            if (tData.getSelectedRow() != -1) {
                int selectedRow = tData.getSelectedRow();
                int numCliente = (int) tData.getValueAt(selectedRow, 0);

                try {
                    controladora.eliminarMascota(numCliente);

                    initTable();
                    JOptionPane.showMessageDialog(tData, "Cuidador eliminado exitósamente", "Usuario eliminado", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(tData, "Hubo algún problema a la hora de eliminar el cuidador. Inténtelo de nuevo más tarde o revise su conexión.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(tData, "Seleccione el usuario que desea eliminar", "Falta selección", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMascotas;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pGeneral;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    private javax.swing.JTable tData;
    // End of variables declaration//GEN-END:variables

    private void initTable() {

        List<Mascota> mascotas = controladora.encontrarMascotas();

        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Nº CLIENTE", "NOMBRE", "RAZA", "COLOR", "ALÉRGICO", "ATENCIÓN ESPECIAL", "OBSERVACIONES", "DNI CUIDADOR"};

        tabla.setColumnIdentifiers(titulos);

        if (mascotas.size() > 0) {

            for (Mascota m : mascotas) {
                Object[] objeto = {m.getNum_cliente(), m.getNombre_mascota(), m.getRaza(), m.getColor(), m.isAlergico(), m.isAtencion_especial(), m.getObservaciones(), m.getCuidador().getId_cuidador()};

                tabla.addRow(objeto);
            }
        } else {
            Object[] objeto = {"No hay data"};
            tabla.addRow(objeto);
        }
        
        tData.setModel(tabla);
    }
}
