/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashScreenz;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author User
 */
public class myconnection {
      public static Connection getConnection(){
     
        Connection con =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
         //   System.out.println("tested");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project1", "root", "root123");
        } catch (java.lang.ClassNotFoundException ex) {
         //  System.out.println(ex+"hiiiii");
        }catch(SQLException ex){
            ;
            
        }
          
        
        
        return con;
        
        
    }
      public static void ShowDataInTable(ResultSet rs,javax.swing.JTable jTable1,javax.swing.JFrame frame) throws CloneNotSupportedException {
        int count = 0;
        Vector<String> columnnames = new Vector<String>();
        Vector<String> row = new Vector<String>();
        try {
            ResultSetMetaData metaRS = rs.getMetaData();
            int columns = metaRS.getColumnCount();
           for (int i = 1; i <= columns; i++) {
                columnnames.add(metaRS.getColumnName(i)); //retrieve all column names
            }
           Vector<Vector<Object>> data=new Vector<Vector<Object>>();
      //  rs.first();
      // Vector<Object> data = new Vector<Object>();
       Vector<Object> rowData = new Vector<Object>();
      // Vector<Vector<Object>> rowData=new Vector<Vector<Object>>();
            while (rs.next()) {
                rowData.clear();
                ++count;
                for (int i = 1; i <= columns; i++) {
                    rowData.add(rs.getObject(i)); //to get all coulmns of the current rwo
                }
                data.add((Vector<Object>) rowData.clone());////populate data inot jtable
            }
            // System.out.println(data);
            // ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{data});
             DefaultTableModel tablemodel = new DefaultTableModel(data,columnnames);
            jTable1.setModel(tablemodel);
            JTableHeader THeader=jTable1.getTableHeader();
            THeader.setBackground(Color.red);
            THeader.setForeground(Color.black);
            THeader.setFont(new Font("Times New Roman", Font.BOLD,20));
            THeader.resizeAndRepaint();
             if (count == 0) {
                JOptionPane.showMessageDialog(frame, "No record found", "Record search ", 1);
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Check your query!!!!"+ex, "Record search", 1);
       }
    }
    
}
