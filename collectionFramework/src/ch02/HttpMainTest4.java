package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest4 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments/100");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET"); // POST(���� ��ȭ)
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
				System.out.println("������ ������ �� �����ϴ�");
			}
			
			String str = sb.toString();
			Gson gson = new Gson();
			Comments comment = gson.fromJson(str, Comments.class);
			
			System.out.println("----------------------------------");
			System.out.println(comment.postId);
			System.out.println(comment.id);
			System.out.println(comment.name);
			System.out.println(comment.email);
			System.out.println(comment.body);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}

	}

}
