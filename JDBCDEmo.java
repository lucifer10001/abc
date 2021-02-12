package day9_thread;
import java.sql.*;
public class JDBCDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Connection
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345");
			//Statement
			Statement mystate=conn.createStatement();
			//query
			ResultSet res=mystate.executeQuery("select * from Employee");
			// process result
			while(res.next()) {
			System.out.println(res.getInt("Id")+", "+res.getString("Name")+", "+res.getDouble("Salary"));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
