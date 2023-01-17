package countrydb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class NewApi {

	public static void main(String[] args) throws IOException, InterruptedException {

//		String flag = "🇬🇩";
//		byte[] byteArr = flag.getBytes("UTF-8");
//		System.out.println("UTF-8 decoded: " + new String(byteArr, "UTF-8"));
//		System.out.println("Default decoded: " + new String(byteArr));

		String url = "jdbc:sqlserver://localhost:1433;databaseName=MavenTwo;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://restcountries.com/v3.1/all")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String uglyJsonString = response.body();
//		System.out.println(uglyJsonString);
//		System.out.println(uglyJsonString);
		Gson gson = new Gson();
		LanguagesMain[] listDataApi = gson.fromJson(uglyJsonString, LanguagesMain[].class);
		System.out.println(listDataApi.toString());
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		JsonParser jp = new JsonParser();
//		JsonElement je = jp.parse(uglyJsonString);
//		String prettyJsonString = gson.toJson(je);
//		System.out.println(prettyJsonString);
//		LanguagesMain[] M = gson.fromJson(prettyJsonString, LanguagesMain[].class);
		for (LanguagesMain x : listDataApi) {

			String status = x.getStatus();
			String region = x.getRegion();
			
			byte[] byteArr = x.getFlag().getBytes("UTF-8");
			String flag = new String(byteArr, "UTF-8");
			
			String startOfWeek = x.getStartOfWeek();
			String fifa = x.getFifa();
			String independent = x.isIndependent();
			String cca2 = x.getCca2();
			String cca3 = x.getCca3();
			String cioc = x.getCioc();
			String ccn3 = x.getCcn3();
			String SQLqueryForInserting = "insert into country(status,region, startOfWeek ,fifa, independent,cca2,cca3,cioc ,ccn3)"
					+ " values('" + status + "' ,'" + region + "', '" + startOfWeek + "','" + fifa + "' ,' "
					+ independent + "','" + cca2 + "','" + cca3 + "','" + cioc + "','" + ccn3 + "')";

			System.out.println(SQLqueryForInserting);
			Connection con = null;

			try {
				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				DriverManager.registerDriver(driver);
				con = DriverManager.getConnection(url, user, pass);
				Statement st = con.createStatement();

				// Executing query
				int m = st.executeUpdate(SQLqueryForInserting);
				if (m >= 0)
					System.out.println("inserted successfully : " + SQLqueryForInserting);
				else
					System.out.println("insertion failed");
				// Closing the connections
				con.close();
			} catch (Exception ex) {
				// Display message when exceptions occurs
				System.err.println(ex);

			}

		}
	}
}
