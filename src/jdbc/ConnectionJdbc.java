package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionJdbc {
	public static void insertValues(String name, double maths, double english, double science, double social) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bin", "root",
					"password");
			PreparedStatement stmt = con.prepareStatement("insert into studentinfo values(?,?,?,?,?)");
			stmt.setString(1, name);
			stmt.setInt(2, (int)maths);
			stmt.setInt(3,(int) english);
			stmt.setInt(4,(int) science);
			stmt.setInt(5,(int) social);
			int a=stmt.executeUpdate(); 
			stmt=con.prepareStatement("select * from studentinfo");  
			ResultSet rs = stmt.executeQuery();
		    while (rs.next())  
		                {
            System.out.println(rs.getString(1) + "  " + rs.getInt(2) + " " + rs.getInt(3) + " " + rs.getInt(4)+ " " + rs.getInt(5));
				        }
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
