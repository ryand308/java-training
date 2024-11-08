import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/web"; // localhost/(Schemas name)
		String user = "root";
		String pass = "12345678";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			Connection conn = DriverManager.getConnection(url, user, pass);			
			// 2. Create a statement
			Statement stmt = conn.createStatement();			
			// 3. Execute SQL query
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee_name");			
			// 4. Process the result set
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}