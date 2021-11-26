/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Gabriel
 */
public class FrmPrincipal extends javax.swing.JFrame {
FondoPanel fondoPanel = new FondoPanel();
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        this.setContentPane(fondoPanel);
        initComponents();
        this.setLocationRelativeTo(null);
        this.Refresh();

    }

    void Refresh() {
        /*ImageIcon imagen= new ImageIcon("src/imagenes/materiales.jpg");
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(lblmateriales.getWidth(), lblmateriales.getHeight(),Image.SCALE_DEFAULT));
        lblmateriales.setIcon(icono);
        this.repaint();
        
        ImageIcon imagenT=new ImageIcon("src/imagenes/trabajos.jpg");
        Icon iconoT=new ImageIcon(imagenT.getImage().getScaledInstance(lbltrabajos1.getWidth(), lbltrabajos1.getHeight(),Image.SCALE_DEFAULT));
        lbltrabajos1.setIcon(iconoT);
        this.repaint();
        
        ImageIcon imagenC=new ImageIcon("src/imagenes/clientes.jpg");
        Icon iconoC=new ImageIcon(imagenC.getImage().getScaledInstance(lblClientes.getWidth(), lblClientes.getHeight(),Image.SCALE_DEFAULT));
        lblClientes.setIcon(iconoC);
        this.repaint(); */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblmateriales = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbltrabajos1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("FlexSystem");

        lblmateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/materiales.jpg"))); // NOI18N
        lblmateriales.setPreferredSize(new java.awt.Dimension(900, 800));
        lblmateriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmaterialesMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel4.setText("Materiales");

        lbltrabajos1.setBackground(new java.awt.Color(255, 51, 51));
        lbltrabajos1.setForeground(new java.awt.Color(255, 102, 102));
        lbltrabajos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajos.jpg"))); // NOI18N
        lbltrabajos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltrabajos1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setText("   Trabajos");

        lblClientes.setBackground(new java.awt.Color(255, 51, 51));
        lblClientes.setForeground(new java.awt.Color(255, 102, 102));
        lblClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.jpg"))); // NOI18N
        lblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClientesMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblmateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(lbltrabajos1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel4)
                .addGap(231, 231, 231)
                .addComponent(jLabel3)
                .addGap(253, 253, 253)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltrabajos1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(376, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblmaterialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmaterialesMouseClicked
        FrmMateriales frmMateriales = new FrmMateriales();
        frmMateriales.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_lblmaterialesMouseClicked

    private void lblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseClicked
        FrmClientes frmClientes = new FrmClientes();
        frmClientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblClientesMouseClicked

    private void lbltrabajos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrabajos1MouseClicked
        FrmTrabajos frmTrabajos = new FrmTrabajos();
        frmTrabajos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbltrabajos1MouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    
    public class FondoPanel extends JPanel {

        private Image imagen;

        //...
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),
                    this);

            setOpaque(false);
            super.paint(g);
        }

        //...
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblmateriales;
    private javax.swing.JLabel lbltrabajos1;
    // End of variables declaration//GEN-END:variables
}
