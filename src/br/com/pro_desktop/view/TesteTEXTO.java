/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pro_desktop.view;

import br.com.pro_desktop.arquivos.TestaArquivo;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author gardh
 */
public class TesteTEXTO extends javax.swing.JFrame {

    /**
     * Creates new form TesteTEXTO
     */
    public TesteTEXTO() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAbrir = new javax.swing.JMenu();
        txtAbrir = new javax.swing.JMenuItem();
        menuSalvar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setPreferredSize(new java.awt.Dimension(400, 250));
        txtArea.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtAreaComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1);

        menuAbrir.setBackground(new java.awt.Color(51, 51, 255));
        menuAbrir.setText("Arquivo");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });

        txtAbrir.setText(" Abrir");
        txtAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbrirActionPerformed(evt);
            }
        });
        menuAbrir.add(txtAbrir);

        menuSalvar.setText("Salvar");
        menuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalvarActionPerformed(evt);
            }
        });
        menuAbrir.add(menuSalvar);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuAbrir.add(jMenuItem3);

        jMenuBar1.add(menuAbrir);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(655, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbrirActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtAreaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtAreaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaComponentHidden

    private void menuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalvarActionPerformed
        // TODO add your handling code here:
        String str = txtArea.getText();
        File arquivo = TestaArquivo.getArquivo();
        if(arquivo != null) {
            if(TestaArquivo.escreverTexto(arquivo,str)){
            JOptionPane.showMessageDialog(this,"Texto Escreito com sucesso");
            }else {
                JOptionPane.showMessageDialog(this, "Erro ao escrever texto");
               }
        } else {
            JOptionPane.showMessageDialog(this, "error");
        }
        
        
    }//GEN-LAST:event_menuSalvarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(TesteTEXTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteTEXTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteTEXTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteTEXTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteTEXTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAbrir;
    private javax.swing.JMenuItem menuSalvar;
    private javax.swing.JMenuItem txtAbrir;
    private javax.swing.JTextPane txtArea;
    // End of variables declaration//GEN-END:variables
}
