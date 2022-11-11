import java.sql.*;

public class Connectivity3
{
	public static void main(String[] args)
	{
		ResultSet rs;
                
               	try
                {
		        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("jdbc:odbc:dataSource");
			Statement st=c.createStatement();
st.executeUpdate("update Stud set Name='Tanweer' where Name='AAtif'");
System.out.println("updated");

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
 