
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
public class getrollno 
{
    clscon obj=new clscon();
    public int rllnumber()
    {
        int z=0;
        String data="";
        String name="";
        String srollno="";
        
     String qry="select * from tbstudentlogin where ssts='1'";
        ResultSet rs=obj.connection2(qry);
        try {
            while(rs.next())
            {
                data=rs.getString(3);
                System.out.println(data);
            }
            qry="";
            qry="select * from tbstudentadmission where email='"+data+"'";
            ResultSet rs1=obj.connection2(qry);
            
            while(rs1.next())
            {
                srollno=rs1.getString(2);
               
            }
          
            
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
     
   return Integer.parseInt(srollno);  
    }
    public String name()
    {
        String name="";
        String qry="select * from tbstudentlogin where ssts='1'";
        ResultSet rs=obj.connection2(qry);
        try 
        {
            while(rs.next())
            {
                name=rs.getString(2);
                System.out.println(name);
            }
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        return  name;
    }
    public String cls()
    {
        String rn="";
        String email="";
        String cls="";
        String sem="";
        String qry="select * from tbstudentlogin where ssts='1'";
        ResultSet rs=obj.connection2(qry);
        try 
        {
            while(rs.next())
            {
                email=rs.getString(3);
            }
            qry="";
            qry="select * from tbstudentadmission where email='"+email+"'";
            ResultSet rs1=obj.connection2(qry);
            
            while(rs1.next())
            {
              rn=rs1.getString(2);
                System.out.println(rn);
            }
            qry="";
            qry="select * from studentfee where rollno='"+rn+"'";
            ResultSet rs2=obj.connection2(qry);
            while(rs2.next())
            {
              cls=rs2.getString(3);
            }
        } 
        catch (Exception e)
        {
            
            System.out.println(e.getMessage());
        }
        return cls;
    }

    
   
    public static void main(String[] args) 
    {
        getrollno r=new getrollno();
        r.rllnumber();
       r.name();
       r.cls();
        
    }

   
    
}

    
   
  
       
      
    

   
    

