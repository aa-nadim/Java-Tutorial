/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracledatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abdul Awal Nadim
 */
public class project {
    public static void main(String[] args) {
    try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","OUTLN","Nadim221");
			Statement st=con.createStatement();
			String sql="select * from Student";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {

				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				con.close();
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
    }
}