import java.sql.*;

public class DBMS {
 
    public static void main(String[] args) {
       
         try{
        
       Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded.");
       Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","OUTLN","Nadim221");
       System.out.println("Connection established.");
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select *from project_00");
       while(rs.next())
       {
    	   //System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
       }
       st.close();
       conn.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
      
}
    }
    
}
