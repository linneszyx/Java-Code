import java.sql.*;

public class Connectivity2
{
	public static void main(String[] args)
	{
		ResultSet rs;
                
               	try
                {
		        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("jdbc:odbc:dataSource");
			Statement st=c.createStatement();
st.executeUpdate("delete from Stud where Name='Tanweer'");
System.out.println("Deleted");

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
 