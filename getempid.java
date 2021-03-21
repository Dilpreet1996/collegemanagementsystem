
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilpreet
 */
public class getempid 
{
    clscon obj=new clscon();
    public int geteid()
    {
        int z=0;
        String email="";
        
        String eid="";
        
     String qry="select * from tbstafflogin where status='1'";
        ResultSet rs=obj.connection2(qry);
        try {
            while(rs.next())
            {
                email=rs.getString(3);
               
            }
            qry="";
            qry="select * from tbstaff where email='"+email+"'";
            ResultSet rs1=obj.connection2(qry);
            
            while(rs1.next())
            {
                eid=rs1.getString(14);
                System.out.println(eid);
               
            }
          
            
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
     
   return Integer.parseInt(eid);  
    }
    public static void main(String[] args) 
    {
        
        getempid obj=new getempid();
        obj.geteid();
        
    }
    
}
