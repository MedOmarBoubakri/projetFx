/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author OmaR
 */
public class ConnectionUtil {
   Connection conn = null;
   public static Connection connectdb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
              String url="jdbc:mysql://127.0.0.1/mydb";
            Connection conn = DriverManager.getConnection(url, "root","");
            return conn;
        }
        catch(Exception ey)
        {
            JOptionPane.showMessageDialog(null, ey);
            return null;
        }
    }
}
