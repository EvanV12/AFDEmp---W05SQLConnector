package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class MainClass {
	public static final String HOST = "localhost";
	public static final String PORT = "3306";
	public static final String DRIVER = "jdbc:mysql://";
	public static final String DB = "sales";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	
	
	//public MainClass() { }

	public static void main(Connection con, String dbName)
		    throws SQLException {

		    java.sql.Statement stmt = null;
		    String query =
		        "select COF_NAME, SUP_ID, PRICE, " +
		        "SALES, TOTAL " +
		        "from " + dbName + ".COFFEES";

		    try {
		        stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		            String coffeeName = rs.getString("COF_NAME");
		            int supplierID = rs.getInt("SUP_ID");
		            float price = rs.getFloat("PRICE");
		            int sales = rs.getInt("SALES");
		            int total = rs.getInt("TOTAL");
		            System.out.println(coffeeName + "\t" + supplierID +
		                               "\t" + price + "\t" + sales +
		                               "\t" + total);
		        }
		    } catch (SQLException e ) {
		     //   JDBCTutorialUtilities.printSQLException(e);
		    } finally {
		        if (stmt != null) { stmt.close(); }
		    }
		}
}