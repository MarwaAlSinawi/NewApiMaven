package countrydb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class NewApi {

	public static void main(String[] args) throws IOException, InterruptedException {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=MavenTwo;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://restcountries.com/v3.1/all")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String uglyJsonString = response.body();
//			System.out.println(uglyJsonString);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(uglyJsonString);
		String prettyJsonString = gson.toJson(je);
		System.out.println(prettyJsonString);

	}

}
