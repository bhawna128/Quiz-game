package work1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class quiz extends javax.swing.JFrame {

    /**
     * Creates new form quiz
     */
    public quiz() {
        initComponents();
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

        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem11 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem12 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem13 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem14 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem15 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem16 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem19 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem18 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem17 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem20 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem21 = new javax.swing.JCheckBoxMenuItem();

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("jCheckBoxMenuItem5");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("jCheckBoxMenuItem6");

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("jCheckBoxMenuItem7");

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("jCheckBoxMenuItem8");

        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText("jCheckBoxMenuItem9");

        jCheckBoxMenuItem10.setSelected(true);
        jCheckBoxMenuItem10.setText("jCheckBoxMenuItem10");

        jCheckBoxMenuItem11.setSelected(true);
        jCheckBoxMenuItem11.setText("jCheckBoxMenuItem11");

        jCheckBoxMenuItem12.setSelected(true);
        jCheckBoxMenuItem12.setText("jCheckBoxMenuItem12");

        jCheckBoxMenuItem13.setSelected(true);
        jCheckBoxMenuItem13.setText("jCheckBoxMenuItem13");

        jCheckBoxMenuItem14.setSelected(true);
        jCheckBoxMenuItem14.setText("jCheckBoxMenuItem14");

        jCheckBoxMenuItem15.setSelected(true);
        jCheckBoxMenuItem15.setText("jCheckBoxMenuItem15");

        jCheckBoxMenuItem16.setSelected(true);
        jCheckBoxMenuItem16.setText("jCheckBoxMenuItem16");

        jCheckBoxMenuItem19.setSelected(true);
        jCheckBoxMenuItem19.setText("jCheckBoxMenuItem19");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 900));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 900));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(230, 238, 105));
        jPanel5.setLayout(null);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(jTextField2);
        jTextField2.setBounds(270, 370, 170, 50);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(500, 360, 170, 60);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel2.setText(" SELECTED ROOT NAME");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(50, 370, 210, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jButton2.setText("SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(370, 130, 160, 60);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(170, 130, 158, 59);
        jPanel5.add(jTextField1);
        jTextField1.setBounds(360, 40, 160, 55);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel1.setText("ENTER ROOT NAME");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(160, 40, 170, 55);

        kGradientPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel3.setText("ROOT TABLE");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(30, 230, 140, 40);

        jTable1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "rootid", "rootname"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 220, 610, 90);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4);
        jButton4.setBounds(810, 10, 80, 70);

        jPanel5.add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1500, 1000);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 940, 1000);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 40, 10, 10);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 40, 10, 10);

        jMenu1.setText("File");

        jCheckBoxMenuItem18.setSelected(true);
        jCheckBoxMenuItem18.setText("quiz1");
        jCheckBoxMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem18ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem18);

        jCheckBoxMenuItem17.setSelected(true);
        jCheckBoxMenuItem17.setText("questions");
        jCheckBoxMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem17ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem17);

        jCheckBoxMenuItem20.setSelected(true);
        jCheckBoxMenuItem20.setText("updatequestions");
        jCheckBoxMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem20ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem20);

        jCheckBoxMenuItem21.setSelected(true);
        jCheckBoxMenuItem21.setText("updatelimit");
        jCheckBoxMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem21ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem21);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void jCheckBoxMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem18ActionPerformed
      dispose();
      new quiz1().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem18ActionPerformed

   private void jCheckBoxMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem17ActionPerformed
     dispose();
     new questions().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem17ActionPerformed

   private void jCheckBoxMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem20ActionPerformed
     dispose();
     new updatequestions().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem20ActionPerformed

   private void jCheckBoxMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem21ActionPerformed
      dispose();
      new Updatelimit().setVisible(true);
   }//GEN-LAST:event_jCheckBoxMenuItem21ActionPerformed

   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
   }//GEN-LAST:event_jButton4ActionPerformed

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      String nm=jTextField1.getText();
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=project_logics.GetDataFromDataBase.getDbInstance();
         PreparedStatement pstmt=con.prepareStatement("select `rootname` from root where `rootname`=?");
         pstmt.setString(1,nm);
         ResultSet rs=pstmt.executeQuery();
         if(rs.next())
         {
            JOptionPane.showMessageDialog(null,"value already exists");

         }
         else
         {
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
                Connection con1=project_logics.GetDataFromDataBase.getDbInstance();
               PreparedStatement pstmt1=con1.prepareStatement("insert into root(`rootname`) values(?)");
               pstmt1.setString(1, nm);
               int ab=pstmt1.executeUpdate();

               if(ab>0)
               {
                  JOptionPane.showMessageDialog(null,"Value Inserted");
               }
               else
               {
                  JOptionPane.showMessageDialog(null,"Value NOT Inserted");
               }
               pstmt1.close();
               con1.close();
            }
            catch (Exception e)
            {
               JOptionPane.showMessageDialog(null,"Error is --> "+e);
            }
         }
         pstmt.close();
         con.close();
      }
      catch (Exception e)
      {
         JOptionPane.showMessageDialog(null,"Error is --> "+e);
      }
   }//GEN-LAST:event_jButton1ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try
      {
         Connection con=project_logics.GetDataFromDataBase.getDbInstance();
         PreparedStatement pstmt=con.prepareStatement("select * from root");
         ResultSet rs=pstmt.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"error is-->"+e);
      }
   }//GEN-LAST:event_jButton2ActionPerformed

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      DefaultTableModel dtml=(DefaultTableModel)jTable1.getModel();
      int row_number=jTable1.getSelectedRow();
      String root_name=dtml.getValueAt(row_number,1).toString();
      String root_id=String.valueOf(project_logics.GetDataFromDataBase.getRootid(root_name));
      try
      {
         Connection con=project_logics.GetDataFromDataBase.getDbInstance();
         PreparedStatement pstmt=con.prepareStatement("delete from root where `rootname`=?");
         pstmt.setString(1,root_name);
         int flag=pstmt.executeUpdate();
         if(flag>0)
         {
            JOptionPane.showMessageDialog(null,"root deleted");

            int abc=project_logics.GetDataFromDataBase.deleteRoot(root_id,root_name);
            try
            {
               Connection con1=project_logics.GetDataFromDataBase.getDbInstance();
               PreparedStatement pstmt1=con1.prepareStatement("Select * from root");
               ResultSet rs1=pstmt1.executeQuery();
               jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
            }
            catch(Exception e)
            {
               JOptionPane.showMessageDialog(null,"error is-->"+e);
            }
         }
      }
      catch(Exception el)
      {
         JOptionPane.showMessageDialog(null,"exception  is-->"+el);
      }
   }//GEN-LAST:event_jButton3ActionPerformed

   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
      int row_number=jTable1.getSelectedRow();
      String root=dtm.getValueAt(row_number,1).toString();
      jTextField2.setText(root);
   }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem11;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem12;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem13;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem14;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem15;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem16;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem17;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem18;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem19;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem20;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem21;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
