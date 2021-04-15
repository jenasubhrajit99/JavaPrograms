import java.sql.*;  
public class PreparedStatement_Ex {  
public static void main(String args[]){  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jeet");  
/*
 * PreparedStatement st =
 * con.prepareStatement("create table emp(id number(10), name varchar2(20))");
 * int i=st.executeUpdate();
 */ 
  
/*
 * PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");
 * stmt.setInt(1,101);//1 specifies the first parameter in the query
 * stmt.setString(2,"Ratan"); int i=stmt.executeUpdate();System.out.println(i+" records inserted");
 */
  
/*
 * PreparedStatement st = con.prepareStatement("select * from emp"); ResultSet
 * rs = st.executeQuery(); while(rs.next()) {
 * System.out.println(rs.getInt(1)+" "+rs.getString(2)); }
 */

PreparedStatement st=con.prepareStatement("drop table emp");
int i=st.executeUpdate();
System.out.println("Table droped succesfully");
  
  con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  