/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jaydee;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rica
 */
public class My_CNX {
    
    private static String servername = "jdbc:mysql://127.0.0.1/users_db";
    private static String username = "root";
    private static String password = "";

    public static Connection getConnection() {
        Connection cnx = null;
        
        MysqlDataSource dataSource = new MysqlDataSource();
        
          dataSource.setURL(servername);
          dataSource.setUser(username);
          dataSource.setPassword(password);

        try {
            cnx = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
}
