import java.sql.*;

public class G18_scoreboard {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		try(
				Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/select_test"
					, "root" , "0000");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select s.* , id"
					+ " from name n , score s"
					+ " where n.name = s.score"))
			{
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t"
						+ rs.getString(2) + "\t"
						+ rs.getString(3) + "\t"
						+ rs.getString(4));
				}
			}
	}

}
