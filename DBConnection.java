package DataBase;
import java.sql.*;
public class DBConnection {

	
	
	Connection c=null;
	public DBConnection(){
	
	}
	public  Connection connDB()
	{
		try {
			this.c=DriverManager.getConnection("jdbc:mariadb://localhost:1907/proje?user=root&password=1907");
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	
	
}
