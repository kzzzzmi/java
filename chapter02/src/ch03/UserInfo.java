package ch03;

public class UserInfo {

	String userId;
	String userPwd;
	String userName;
	String userAddress;
	String phoneNumber;
	int age;

	// ������ �����ε�
	// �Ű������� ������ ��ȯ���� �޸��Ͽ� ���� �̸��� ���� ����� �����ϴ� �޼��带 ����� ���
	
	
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
