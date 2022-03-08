package DataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import DataBase.*;
import javax.swing.JOptionPane;



public class Helper {
	private static DBConnection conn=new DBConnection();
	
	Helper()
	{}
	public static void showMsg(String str)
	{
		String msg;
		switch(str)
		{
		case "fill":
			msg="Lütfen tüm alanlarý doldurunuz";
			break;
			default:
				msg=str;
		
		
		
		
	
		}
	JOptionPane.showMessageDialog(null, msg,"Mesaj",JOptionPane.INFORMATION_MESSAGE);
			
		
	}
	
	
	public static ResultSet dbsorgu(String str,int i)
	{
		
		ResultSet rs=null;
		Statement s;
		try {
			Connection c=conn.connDB();
			s = c.createStatement();
			if(i==0) {
				 rs=s.executeQuery(str);
				return rs;
			}
			if(i==1)
			{
				 rs=s.executeQuery(str);
				return rs;
			}
			
			if(i==2)
			{
				 rs=s.executeQuery(str);
					return rs;
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return rs;
	
		
		
		
		
		
	
		
	}
	

}