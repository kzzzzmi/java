package algorithmSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<test; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int k = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			System.out.println(k);
			System.out.println(n);
		}
		
	}
}
