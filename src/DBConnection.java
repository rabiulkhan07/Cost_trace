/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costtrace;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author md.rabiulkhan
 */
public class DBConnection {
    
    Connection conn = null;
    
    public static java.sql.Connection connectDb() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dailyCost", "root", "password");
            System.out.print("Connected\n");
            return conn;
        } catch (Exception e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return null;
        }

    }
    
}
