import java.sql.*;
class Connectivity1
{
	public static void main(String[] args)
	{
		ResultSet rs;
               	try
                {
		        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("jdbc:odbc:dataSource");
			Statement st=c.createStatement();
			rs=st.executeQuery("select * from Stud");
			while(rs.next())
			{
				System.out.println(rs.getString("Name"));
			}

		}
		catch(Exception e)
		{
                System.out.println(e);
		}
	}
}
 