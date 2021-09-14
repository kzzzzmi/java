package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputPhoneNumber {

	private ArrayList<String> userName = new ArrayList<>();
	private ArrayList<String> phoneNumber = new ArrayList<>();
	
	public ArrayList<String> getUserName() {
		return userName;
	}
	public ArrayList<String> getPhoneNumber() {
		return phoneNumber;
	}
	
	public void savePhoneNumber() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		String number = "";
		
		do {
			System.out.println("�����Ϸ��� -1�� �Է��ϼ���");
			System.out.println("*** �̸��� �Է��ϼ��� ***\n");
			name = br.readLine();	
			if(!name.equals("-1")) {
				System.out.println("**** ��ȭ��ȣ�� �Է��ϼ��� ***\n");
				number = br.readLine();				
				userName.add(name);
				phoneNumber.add(number);
			}
		} while(!name.equals("-1"));
	}
	
	public void showInfo() {
		System.out.println("----------------------------------------");
		for(int i=0; i<userName.size(); i++) {
			System.out.print("[" + userName.get(i) + "] : \t");
			System.out.println(phoneNumber.get(i));			
		}
		System.out.println("----------------------------------------");
	}
	
	public static void main(String[] args) throws IOException {
		InputPhoneNumber inputPhoneNumber = new InputPhoneNumber();
		inputPhoneNumber.savePhoneNumber();
		inputPhoneNumber.showInfo();
	}
		
}
