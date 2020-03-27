/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukk_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ReAlfz
 */
public class Config {
    
    private static Connection connected;
    public static Connection config() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/spp";
            String u = "root";
            String p = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connected = (Connection) DriverManager.getConnection(url,u,p);
        
        } catch(Exception e){
            System.out.println("koneksi gagal"+ e.getMessage());
        }
        
        return connected;
    }
}