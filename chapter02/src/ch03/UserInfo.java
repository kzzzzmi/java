package ch03;

public class UserInfo {

	String userId;
	String userPwd;
	String userName;
	String userAddress;
	String phoneNumber;
	int age;

	// 생성자 오버로딩
	// 매개변수의 갯수나 반환형을 달리하여 같은 이름의 같은 기능을 수행하는 메서드를 만드는 기법
	
	
	public UserInfo() {
	}

	public UserInfo(String userId) {
		this.userId = userId;
	}

	public UserInfo(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}

	public UserInfo(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	public UserInfo(String userId, String userPwd, String userName, String userAddress) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAddress = userAddress;
	}

	public UserInfo(String userId, String userPwd, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}

	public UserInfo(String userId, String userPwd, String userName, String userAddress, String phoneNumber, int age) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

}
