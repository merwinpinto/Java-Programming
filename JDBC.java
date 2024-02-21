import java.sql.*;

public class JDBC 
{
	
	public static void main(String args[])
	{
		int i,column_data;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","Merwin3965@#");
		
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from fruits");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			column_data = rsmd.getColumnCount();
			while(rs.next()) 
			{
				for(i = 1 ;i<= column_data;i++)
				{
					System.out.print(rs.getString(i)+i +"");
				}
				System.out.println();
			}
			
			Statement st = con.createStatement();
			
			//st.executeUpdate("insert into fruits(fruit_name,fruit_price) values('Strawberry',2000)");
			st.executeUpdate("select * from fruits");
			con.close();
		}
		
		catch(Exception exception)
		{
			System.out.println(exception);
		}
	}

}