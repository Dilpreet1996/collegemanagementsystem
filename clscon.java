
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilpreet
 */
public class clscon 
{
 ResultSet rs;
    public void connection(String sql)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database");
             System.out.println("Creating Connection");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
             System.out.println("Connection created");
             System.out.println("Creating Statement");
             Statement stmt=con.createStatement();
             System.out.println("Statement Created");
             stmt.execute(sql);
             System.out.println("Data Successfully Registered");
             con.close();
             
             
            
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
    public ResultSet connection2(String qry1)
    {
        try {
           Class.forName("com.mysql.jdbc.Driver");
        
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
            
            Statement stmt=con.createStatement();
            System.out.println("Statement Created");
            rs=stmt.executeQuery(qry1);
           
                
             
             
            //con.close();
            
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return rs;  
    }
}
