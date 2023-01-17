package countrydb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadingTableCountry {
static void ReadRows() throws IOException, InterruptedException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=MavenTwo;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Scanner sa = new Scanner(System.in);

		System.out.println("Enter id that you want to show ?");
		 int insert = sa.nextInt();

		int count = 0;
		String sql = "SELECT * FROM country Where id="+insert;

		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				String startOfWeek  = result.getString("startOfWeek");
				String fifa  = result.getString("fifa");
				String independent = result.getString("independent");
				String cca2 = result.getString("cca2");
				String cca3 = result.getString("cca3");
				String cioc = result.getString("cioc");
				String ccn3 = result.getString("ccn3");
				

				System.out.println(id + " " +startOfWeek+ "  " + fifa + " " + independent + " " + cca2+""+cca3+""+cioc+""+ccn3);
				count++;

			}
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

}


