/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import Model.Regitro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldair.jimenez3
 */
public class frmregistro extends javax.swing.JFrame {

    /**
     * Creates new form frmregistro
     */
    ArrayList<Regitro> productos;
    public frmregistro() {
        this.productos= new ArrayList<>();
        this.setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lbldes = new javax.swing.JLabel();
        lblpreciocompra = new javax.swing.JLabel();
        lblprecioventa = new javax.swing.JLabel();
        lblcan = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdes = new javax.swing.JTextField();
        txtpreciocompra = new javax.swing.JTextField();
        txtprecioventa = new javax.swing.JTextField();
        txtcan = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setText("REGISTRO PRODUCTOS");

        lblid.setText("Codigo:");

        lblnombre.setText("Nombre");

        lbldes.setText("Descripcion");

        lblpreciocompra.setText("Precio de Compra");

        lblprecioventa.setText("Precio de venta");

        lblcan.setText("Cantidad");

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Precio de compra", "Precio de venta", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpreciocompra)
                                    .addComponent(lblid))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpreciocompra, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(txtid)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnregistrar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblprecioventa)
                                    .addComponent(lblnombre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtprecioventa, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(txtnombre))
                                .addGap(18, 51, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblcan)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtcan))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbldes)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnactualizar)
                                        .addGap(67, 67, 67)
                                        .addComponent(btneliminar)
                                        .addGap(80, 80, 80)
                                        .addComponent(btnmostrar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(142, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid)
                    .addComponent(lblnombre)
                    .addComponent(lbldes)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpreciocompra)
                    .addComponent(lblprecioventa)
                    .addComponent(txtpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcan)
                    .addComponent(txtcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar)
                    .addComponent(btnmostrar))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        agregar();
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar(Integer.parseInt(txtid.getText()));
        mostrar();
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizar();
        mostrar();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int pocicion = jTable1.getSelectedRow();
        
        txtid.setText(jTable1.getValueAt(pocicion, 0).toString());
        txtnombre.setText(jTable1.getValueAt(pocicion, 1).toString());
        txtdes.setText(jTable1.getValueAt(pocicion, 2).toString());
        txtpreciocompra.setText(jTable1.getValueAt(pocicion, 3).toString());
        txtprecioventa.setText(jTable1.getValueAt(pocicion, 4).toString());
        txtcan.setText(jTable1.getValueAt(pocicion, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked
    public void eliminar(int id){
        Regitro productos=null;
        for (int i = 0; i < this.productos.size(); i++) {
            final Regitro productos1 = this.productos.get(i);
            if(productos1.getId()==id){
                productos= productos1;
            }
        }
        this.productos.remove(productos);
        JOptionPane.showMessageDialog(null, "Producto Eliminado");
        txtid.setText("");
        }

    public void actualizar() {
        int cambiar = jTable1.getSelectedRow();
        final Regitro regitro = productos.get(cambiar);
        regitro.setId(Integer.parseInt(txtid.getText()));
        regitro.setNombre(txtnombre.getText());
        regitro.setDescripcion(txtdes.getText());
        regitro.setPrecioCompra(Double.parseDouble(txtpreciocompra.getText()));
        regitro.setPrecioVenta(Double.parseDouble(txtprecioventa.getText()));
        regitro.setCantidad(Integer.parseInt(txtcan.getText()));
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        for (Regitro g : productos) {
            modelo.addRow(new Object[]{
                    g.getId(), g.getNombre(), g.getDescripcion(), g.getPrecioCompra(), g.getPrecioVenta(), g.getCantidad()});
        }
    }
           
 
    public void agregar() {
        int id = 0;
        int cant =0;
        double compra = 0;
        double venta = 0;
        String nombre = null;
        String descrip = null;
        if (txtid.getText().equals("") || (txtnombre.getText().equals("")) || (txtdes.getText().equals("")) || (txtpreciocompra.getText().equals("")) || (txtprecioventa.getText().equals("")) || (txtcan.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Llene el campo vacio");
        } else {
            try {
               
                    id = Integer.parseInt(txtid.getText());
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Solo se aceptan datos numericos, verifique el campo Codigo");
                return;
            }
            
            nombre = txtnombre.getText();
            descrip = txtdes.getText();
            try {
                compra = Double.parseDouble(txtpreciocompra.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan datos numericos, verifique el campo Precio de compra");
                return;
            }

            try {
                venta = Double.parseDouble(txtprecioventa.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan datos numericos, verifique el campo precio de venta");
                return;
            }
            try {
                cant =  Integer.parseInt(txtcan.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan datos numericos, verifique el campo cantidad");
                return;
            }
            Regitro rega = new Regitro(id, nombre, descrip, compra, venta, cant);
            
            productos.add(rega);

            JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
            txtid.setText("");
            txtnombre.setText("");
            txtdes.setText("");
            txtpreciocompra.setText("");
            txtprecioventa.setText("");
            txtcan.setText("");
        }
        mostrar();
    }
    
    public void mostrar() {
        String matriz[][] = new String[productos.size()][6];

        for (int i = 0; i < productos.size(); i++) {
            final Regitro regitro = productos.get(i);
            matriz[i][0] = Integer.toString(regitro.getId());
            matriz[i][1] = regitro.getNombre();
            matriz[i][2] = regitro.getDescripcion();
            matriz[i][3] = Double.toString(regitro.getPrecioCompra());
            matriz[i][4] = Double.toString(regitro.getPrecioVenta());
            matriz[i][5] = Integer.toString(regitro.getCantidad());
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Codigo", "Nombre", "Descripcion", "Precio de compra", "Precio de venta", "Cantidad"
                }
        ));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcan;
    private javax.swing.JLabel lbldes;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpreciocompra;
    private javax.swing.JLabel lblprecioventa;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtcan;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpreciocompra;
    private javax.swing.JTextField txtprecioventa;
    // End of variables declaration//GEN-END:variables
}
