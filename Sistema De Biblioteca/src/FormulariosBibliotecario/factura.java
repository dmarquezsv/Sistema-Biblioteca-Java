/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulariosBibliotecario;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import java.awt.print.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel_Márquez
 */
public class factura extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form factura
     */
    public factura() {
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

        recibo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recibo.setName(""); // NOI18N
        recibo.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Colegio Ramón Belloso");
        recibo.add(jLabel1);
        jLabel1.setBounds(130, 10, 260, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        recibo.add(jLabel2);
        jLabel2.setBounds(30, 130, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Servicio Biblioteca");
        recibo.add(jLabel3);
        jLabel3.setBounds(220, 90, 160, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha:");
        recibo.add(jLabel4);
        jLabel4.setBounds(30, 90, 70, 17);

        nombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nombre.setText("jLabel3");
        recibo.add(nombre);
        nombre.setBounds(90, 130, 170, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Recibo Cancelado");
        recibo.add(jLabel6);
        jLabel6.setBounds(150, 240, 180, 22);

        fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fecha.setText("jLabel3");
        recibo.add(fecha);
        fecha.setBounds(90, 90, 120, 14);

        Tipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tipo.setText("jLabel3");
        recibo.add(Tipo);
        Tipo.setBounds(300, 130, 120, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Multa por:");
        recibo.add(jLabel5);
        jLabel5.setBounds(220, 130, 120, 17);

        dinero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dinero.setText("jLabel3");
        recibo.add(dinero);
        dinero.setBounds(210, 210, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("RECIBO DE PAGO");
        recibo.add(jLabel8);
        jLabel8.setBounds(170, 40, 170, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Total:");
        recibo.add(jLabel7);
        jLabel7.setBounds(150, 210, 120, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoFac.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        recibo.add(jLabel10);
        jLabel10.setBounds(-170, -86, 690, 440);

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cerrar))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        factura fact = new factura();
        fact.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PrinterJob imp = PrinterJob.getPrinterJob();
            imp.setPrintable(this);
            boolean top = imp.printDialog();
            if(top)
            {
                imp.print();
            }
        } catch (PrinterException pex) 
        {
            JOptionPane.showMessageDialog(null, "Error DE PROGRMA AL IMPRIMIR" + pex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Tipo;
    private javax.swing.JButton cerrar;
    public javax.swing.JLabel dinero;
    public javax.swing.JLabel fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel nombre;
    private javax.swing.JPanel recibo;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pageFor, int Index) throws PrinterException {
      if(Index > 0)
      {
          return NO_SUCH_PAGE;
      }
      
     Graphics2D hwb = (Graphics2D) graf;
     hwb.translate(pageFor.getImageableX() + 30, pageFor.getImageableY() + 30 );//Valores para la impresión
     hwb.scale(1.0, 1.0);
     recibo.printAll(graf);
     return PAGE_EXISTS;
    }
}
