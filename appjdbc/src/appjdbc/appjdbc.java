package appjdbc;

import java.sql.*;


public class appjdbc {
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","VeditaM@04");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
            while(rs.next())
		    //System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"   "+rs.getString(5));
            System.out.println(rs.getString(2)+"   ");
		    con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

