package ch04;

import java.util.Scanner;

public class UserInfoClient {

	// DB Type 설정
//	public static String DBTYPE = "MYSQL";
//	public static String DBTYPE = "ORACLE";
	public static String DBTYPE = "MSSQL";
	
	// start of main
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 userInfo 정보를 받습니다
		UserInfo userInfo = new UserInfo();
		System.out.print("사용자 이름 입력 : ");
		userInfo.setUserName(sc.next());
		System.out.print("사용자 아이디 입력 : ");
		userInfo.setUserId(sc.next());
		System.out.print("사용자 비밀번호 입력 : ");
		userInfo.setPassword(sc.next());
		
		UserInfoDao userInfoDao = null;		// block의 유효범위

		if(DBTYPE.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else if(DBTYPE.equals("ORACLE")){
			userInfoDao = new UserInfoOracleDao();
		} else {
			userInfoDao = new UserInfoMsSqlDao();
		}
		
		// 1. 회원가입
		userInfoDao.insertUserInfo(userInfo);
		// 2. 회원정보 수정
		userInfoDao.updateUserInfo(userInfo);
		// 3. 회원탈퇴
		userInfoDao.deleteUserInfo(userInfo);
		
	}
	// enn of main
	
}
