
package oracledatabase;
import java.sql.*; 

public class MysqlCon {
    public static void main(String args[]){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","OUTLN","Nadim221");
            
                //here sonoo is database name, root is username and password
                Statement stmt=con.createStatement();
                String sql="select * from emp";
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
                con.close();
            }  
        
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
