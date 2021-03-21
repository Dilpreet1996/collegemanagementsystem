
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
public class subadminid 
{
    clscon obj=new clscon();
    public String getid()
    {
       
        
        
        String eid="";
        String qry="select * from subadmins where status ='1'";
        ResultSet rs=obj.connection2(qry);
        try {
            while(rs.next())
            {
                eid=rs.getString(3);
                System.out.println(eid);
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return eid;
      
    }
    public static void main(String[] args) 
    {
        
       subadminid object=new subadminid();
       object.getid();
        
    }
    
}
