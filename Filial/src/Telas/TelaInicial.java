/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Akio
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jmVendas = new javax.swing.JMenu();
        jmPedidos = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmRelatorioPedidos = new javax.swing.JMenuItem();
        jmEstoque = new javax.swing.JMenu();
        jmConsultaEstoque = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jmVendas.setText("Vendas");

        jmPedidos.setText("Pedidos");
        jmPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidosActionPerformed(evt);
            }
        });
        jmVendas.add(jmPedidos);

        jMenuBar1.add(jmVendas);

        jmRelatorios.setText("Relatórios");

        jmRelatorioPedidos.setText("Relatório de Pedidos");
        jmRelatorioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRelatorioPedidosActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmRelatorioPedidos);

        jMenuBar1.add(jmRelatorios);

        jmEstoque.setText("Estoque");

        jmConsultaEstoque.setText("Consulta Estoque");
        jmConsultaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaEstoqueActionPerformed(evt);
            }
        });
        jmEstoque.add(jmConsultaEstoque);

        jMenuBar1.add(jmEstoque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidosActionPerformed
        new Pedidos().setVisible(true);                
    }//GEN-LAST:event_jmPedidosActionPerformed

    private void jmRelatorioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRelatorioPedidosActionPerformed
        new Relatório().setVisible(true);
    }//GEN-LAST:event_jmRelatorioPedidosActionPerformed

    private void jmConsultaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaEstoqueActionPerformed
        new Estoque().setVisible(true);
    }//GEN-LAST:event_jmConsultaEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmConsultaEstoque;
    private javax.swing.JMenu jmEstoque;
    private javax.swing.JMenuItem jmPedidos;
    private javax.swing.JMenuItem jmRelatorioPedidos;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmVendas;
    // End of variables declaration//GEN-END:variables
}
