import java.sql.*;
public class OracleConnection_Ex 
{
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jeet");
		if(con!=null)
		{
			System.out.println("Connected With ORACLE Succsesfull");
		}
	}
}
