/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package work1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class welcomeplay extends javax.swing.JFrame {

    /**
     * Creates new form welcomeplay
     */
    public welcomeplay() {
        initComponents();
        this.setSize(1000,500);
       this.setTitle("BHAWNA");
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      getContentPane().setLayout(null);

      jPanel1.setBackground(new java.awt.Color(51, 0, 51));
      jPanel1.setLayout(null);

      jPanel2.setBackground(new java.awt.Color(153, 153, 0));
      jPanel2.setToolTipText("");
      jPanel2.setLayout(null);

      jLabel1.setBackground(new java.awt.Color(102, 102, 0));
      jLabel1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
      jLabel1.setText("WELCOME TO THE PLAYZONE");
      jPanel2.add(jLabel1);
      jLabel1.setBounds(40, 10, 712, 56);

      jButton1.setBackground(new java.awt.Color(255, 51, 51));
      jButton1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
      jButton1.setText("PLAYER");
      jButton1.setBorder(new javax.swing.border.MatteBorder(null));
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });
      jPanel2.add(jButton1);
      jButton1.setBounds(520, 190, 210, 80);

      jButton2.setBackground(new java.awt.Color(255, 51, 51));
      jButton2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
      jButton2.setText("ADMIN");
      jButton2.setBorder(null);
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });
      jPanel2.add(jButton2);
      jButton2.setBounds(80, 190, 220, 80);

      jPanel1.add(jPanel2);
      jPanel2.setBounds(60, 90, 840, 400);

      getContentPane().add(jPanel1);
      jPanel1.setBounds(-20, -20, 1500, 1000);

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
new playerchoice().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //new quiz().setVisible(true);
      String pass=JOptionPane.showInputDialog(null,"enter password");
      if(pass.equals("bhawna"))
      {dispose();
        new quiz().setVisible(true);
      }  
      else
      {
        JOptionPane.showMessageDialog(null,"access denied");
      }     
   }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(welcomeplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomeplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomeplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomeplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomeplay().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   // End of variables declaration//GEN-END:variables
}
