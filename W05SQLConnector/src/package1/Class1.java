package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class1 {
	public static final String HOST = "localhost";
	public static final String PORT = "3306";
	public static final String DRIVER = "jdbc:mysql://";
	public static final String DB = "sales";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	
	public static Connection getDBConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(DRIVER + HOST+":"+ DB, USER, PASSWORD);
        return conn;
        
    }
    public static void closeDBConnection(Connection conn) throws SQLException {
        conn.close();
    }
 
}
 
 