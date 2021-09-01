package ch04;

import java.util.Scanner;

public class UserInfoClient {

	// DB Type ����
//	public static String DBTYPE = "MYSQL";
//	public static String DBTYPE = "ORACLE";
	public static String DBTYPE = "MSSQL";
	
	// start of main
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ����ڿ��� userInfo ������ �޽��ϴ�
		UserInfo userInfo = new UserInfo();
		System.out.print("����� �̸� �Է� : ");
		userInfo.setUserName(sc.next());
		System.out.print("����� ���̵� �Է� : ");
		userInfo.setUserId(sc.next());
		System.out.print("����� ��й�ȣ �Է� : ");
		userInfo.setPassword(sc.next());
		
		UserInfoDao userInfoDao = null;		// block�� ��ȿ����

		if(DBTYPE.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else if(DBTYPE.equals("ORACLE")){
			userInfoDao = new UserInfoOracleDao();
		} else {
			userInfoDao = new UserInfoMsSqlDao();
		}
		
		// 1. ȸ������
		userInfoDao.insertUserInfo(userInfo);
		// 2. ȸ������ ����
		userInfoDao.updateUserInfo(userInfo);
		// 3. ȸ��Ż��
		userInfoDao.deleteUserInfo(userInfo);
		
	}
	// enn of main
	
}
