package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpMainTest1 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/10");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET"); // POST(���� ��ȭ)
			connection.setRequestProperty("Content-type", "application/json");
			connection.connect();
			
			int statusCode = connection.getResponseCode();
			System.out.println("statusCode : " + statusCode);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			if(statusCode == 200) {
				while((line = br.readLine()) != null) {
					sb.append(line);
				}
			} else {
				System.out.println("������ ������ �� �����ϴ�");
			}
			
			
			String str = sb.toString();
			System.out.println(str);
			System.out.println("--------------------------------");
//			System.out.println(str.substring(4, 10));
//			System.out.println(str.substring(13, 14));
//			
//			Todo todo = new Todo();
//			todo.id =Integer.parseInt(str.substring(13, 14));
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		}

	}

}
