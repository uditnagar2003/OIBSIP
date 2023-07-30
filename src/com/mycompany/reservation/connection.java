/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservation;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Udit
 */
public class connection {
   public static Connection connect() 
   {
      try
      {
       Connection con;
       con =DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation","root","Udit@2003");
       return con;
   
      }
   catch(Exception e)
   {
       System.out.println(e);
   }
      return connect();
   }
   public static String tname(int a)
   {
       Connection con = login.con;
       try {
           PreparedStatement stm=con.prepareStatement("select * from train where numbr=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
           stm.setInt(1, a);
           ResultSet rst = stm.executeQuery();
           if(!rst.next())
           {
               return null;
           }
           else
           {
           rst.first();
           return rst.getString(2);
           }   
       } catch (SQLException ex) {
           Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
       }
            return "";
   }
  
}
