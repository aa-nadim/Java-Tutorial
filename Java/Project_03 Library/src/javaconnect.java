
import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb (){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","OUTLN","Nadim221");
            return conn;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog (null,e);
            return null;
        }
    }
}
