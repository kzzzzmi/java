package algorithmSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		int up = Integer.parseInt(line[0]);
		int down = Integer.parseInt(line[1]);
		int total = Integer.parseInt(line[2]);
		
		int day = (total - down) / (up - down);
		
		if((total - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}
