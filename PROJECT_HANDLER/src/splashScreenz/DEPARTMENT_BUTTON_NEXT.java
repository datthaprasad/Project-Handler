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
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DEPARTMENT_BUTTON_NEXT extends javax.swing.JFrame {

    /**
     * Creates new form DEPARTMENT_BUTTON_NEXT
     */
    public DEPARTMENT_BUTTON_NEXT() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tigerback.jpg")));
        this.setResizable(false);
        this.setLocationRelativeTo(this);
          try{
            if(a1.length==5){   
        int x=Integer.parseInt(a1[0]);
        int y=Integer.parseInt(a1[1]);
        int w=Integer.parseInt(a1[2]);
        int h=Integer.parseInt(a1[3]);
        this.setBounds(x, y, w, h);
        }
        }catch(NullPointerException e){}
       
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("FACULTY ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 70, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("MOBILE NUMBER :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 20));

        jTextField1.setBackground(new java.awt.Color(102, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 220, -1));

        jTextField2.setBackground(new java.awt.Color(102, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 220, -1));

        jTextField3.setBackground(new java.awt.Color(102, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 220, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("< CANCEL >");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 110, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("< SUBMIT >");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dragback.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[5];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim1.width);
    s[3]=String.valueOf(dim1.height);
    s[4]="cancel for next";
    this.dispose();
        DEPARTMENT_BUTTON.main(s);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ResultSet rs;
         String s="";             
       
            
           
        //  
           String sql1="select ID from department where DEPARTMENT=?";
           if(jTextField1.getText().trim().equals(""))
               JOptionPane.showMessageDialog(this, "ENTER THE FACULTY ID");
           else if(jTextField2.getText().trim().equals(""))
               JOptionPane.showMessageDialog(this, "ENTER THE NAME");
           else if(jTextField3.getText().trim().equals(""))
               JOptionPane.showMessageDialog(this, "ENTER THE MOBILE NUMBER");
           else{
        try{
            String check="select FACULTY_ID from FACULTY where FACULTY_ID=?";
           PreparedStatement p1=myconnection.getConnection().prepareStatement(check);
           p1.setString(1, jTextField1.getText().trim());
           ResultSet r=p1.executeQuery();
           r.next();try{
            s=r.getString(1);
           }catch(Exception e){}
           System.out.println("ok ok"+s);
            
           p1=myconnection.getConnection().prepareStatement(sql1);
             p1.setString(1, a1[4].trim());
             rs=p1.executeQuery();
             rs.next();
            a1[4]=rs.getString(1);
         }
         catch(Exception e){System.out.print(e);}
         try{
             if(s.trim().equalsIgnoreCase(jTextField1.getText().trim()))  JOptionPane.showMessageDialog(this, "DUPLICATE ENTRY OF FACULTY ID");
             else{
           
        String sql="insert into faculty values (?,?,?,?)";
        PreparedStatement p=myconnection.getConnection().prepareStatement(sql);
        String a=jTextField1.getText().trim();
        String b=jTextField2.getText().trim();
        String c=jTextField3.getText().trim();
        p.setString(1,a);
        p.setString(2, b);
        p.setString(3, c);
        p.setString(4,a1[4].trim());
         
          int count=p.executeUpdate();
          if(count>0)
              JOptionPane.showMessageDialog(this, "Succesfuly Added","",1);
          else
              JOptionPane.showMessageDialog(rootPane, "WRONG INFORMATION","ERROR",3);
          
        
        }
         }
         
           
        catch(Exception e ){}
           }
           
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private static String a1[]=new String[10];
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
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON_NEXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON_NEXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON_NEXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON_NEXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        a1=args;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEPARTMENT_BUTTON_NEXT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
