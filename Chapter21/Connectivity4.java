import java.sql.*;

class Connectivity4
{
	public static void main(String[] args)
	{
		ResultSet rs;
                
               	try
                {
		        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("jdbc:odbc:dataSource");
			Statement st=c.createStatement();
st.executeUpdate("insert into Stud values('alam','52')");
System.out.println("inserted");

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
 