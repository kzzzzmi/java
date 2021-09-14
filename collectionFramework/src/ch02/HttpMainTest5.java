package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest5 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users/10");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET"); // POST(보안 강화)
			connection.setRequestProperty("Content-type", "application/json");
			connection.connect();

			int statusCode = connection.getResponseCode();
			System.out.println("statusCode : " + statusCode);

			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			StringBuffer sb = new StringBuffer();
			String line = null;

			if (statusCode == 200) {
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
			} else {
				System.out.println("서버에 연결할 수 없습니다");
			}
			
			String str = sb.toString();
			Gson gson = new Gson();
			User user = gson.fromJson(str, User.class);
			
			System.out.println("----------------------------------");
			System.out.println(user.id);
			System.out.println(user.name);
			System.out.println(user.username);
			System.out.println(user.email);
			System.out.println(user.address.street);
			System.out.println(user.address.suite);
			System.out.println(user.address.city);
			System.out.println(user.address.zipcode);
			System.out.println(user.address.geo.lat);
			System.out.println(user.address.geo.lng);
			System.out.println(user.phone);
			System.out.println(user.website);
			System.out.println(user.company.name);
			System.out.println(user.company.catchPhrase);
			System.out.println(user.company.bs);
			

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}

	}

}
