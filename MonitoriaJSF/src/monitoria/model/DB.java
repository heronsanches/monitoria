package monitoria.model;
import java.sql.Connection;
import java.sql.DriverManager;


public class DB {

	private static Connection connection;

	// configuration of the database driver
	private static boolean db = false;
	private static String user = "postgres";
	private static String password = "";
	private static final String JDBC_DRIVER = "org.postgresql.Driver";
	private static final String DB_NAME = "monitoria";
	private static String url = "jdbc:postgresql://:5432/"+DB_NAME;
	
	
	private DB(){ }

	
	private static void makeConnection() {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName(JDBC_DRIVER);

			connection = DriverManager.getConnection(url, user, password);
			db = true;

		} catch (Exception e) {
			System.out.println(e);
		}

	}


	public static Connection getConnectionDB() throws Exception {

		if (!db)			
			makeConnection();

		return connection;
	}

}
