/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashScreenz;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class team_delete extends javax.swing.JFrame {

    /**
     * Creates new form team_delete
     */
    public team_delete() {
        initComponents();
        this.setLocationRelativeTo(this);
            this.setLocationRelativeTo(this);
            System.out.print(a1.length);
        try{
            if(a1.length==5){   
        int x=Integer.parseInt(a1[0]);
        int y=Integer.parseInt(a1[1]);
        int w=Integer.parseInt(a1[2]);
        int h=Integer.parseInt(a1[3]);
        this.setBounds(x, y, w, h);
        }
        }catch(NullPointerException e){}
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tigerback.jpg")));
        try{
            String sql="select FACULTY_ID,FACULTY,MOBILE from faculty where id=(select ID from department where DEPARTMENT=?)";
            PreparedStatement ps=myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,a1[4].trim());
            ResultSet rs=ps.executeQuery();
            myconnection.ShowDataInTable(rs, jTable1, this);
        }
        catch(Exception e){ System.out.print(e);}
    }
    Point FormLocation=this.getLocation();
     String we=String.valueOf(FormLocation.x).trim();
    String he=String.valueOf(FormLocation.y).trim();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(51, 255, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "contact", "Title 3"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DELETE ALL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 0));
        jButton3.setText("< CANCEL >");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton2)
                        .addGap(83, 83, 83)
                        .addComponent(jButton1)
                        .addGap(81, 81, 81)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{  
           String sql="delete from faculty where FACULTY_ID=? and id=(select id from department where DEPARTMENT=?)";
            PreparedStatement ps=myconnection.getConnection().prepareStatement(sql);
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            ps.setString(1, (model.getValueAt(jTable1.getSelectedRow(), 0)).toString().trim());
            ps.setString(2,a1[4].trim());
            ps.executeUpdate();
            
             sql="select FACULTY_ID,FACULTY,MOBILE from faculty where id=(select id from department where DEPARTMENT=?)";
           ps=myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,a1[4].trim());
            ResultSet rs=ps.executeQuery();
            myconnection.ShowDataInTable(rs, jTable1, this);
       }
catch(Exception e){System.out.println(e);}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
String sql=" delete from faculty where id=(select id from department where DEPARTMENT=?)";
    PreparedStatement ps=myconnection.getConnection().prepareStatement(sql);
ps.setString(1, a1[4].trim());
ps.executeUpdate();

  sql="select FACULTY_ID,FACULTY,MOBILE from faculty where id=(select id from department where dname=?)";
           ps=myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,a1[4].trim());
            ResultSet rs=ps.executeQuery();
            myconnection.ShowDataInTable(rs, jTable1, this);
       }
    catch(Exception e){System.out.println(e);}
    
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[5];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf("600");
    s[3]=String.valueOf("500");
    s[4]="deletes";
    this.dispose();
    DEPARTMENT_BUTTON.main(s);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
   private static String a1[]=new String[6];
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
            java.util.logging.Logger.getLogger(team_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(team_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(team_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(team_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        a1=args;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new team_delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
