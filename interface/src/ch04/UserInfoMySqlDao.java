package ch04;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MySql : �����ϱ�" + userInfo.getUserName());
		System.out.println("MySql : �����ϱ�" + userInfo.getUserId());
		System.out.println("MySql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MySql : �����ϱ�" + userInfo.getUserName());
		System.out.println("MySql : �����ϱ�" + userInfo.getUserId());
		System.out.println("MySql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("MySql : �����ϱ�" + userInfo.getUserName());
		System.out.println("MySql : �����ϱ�" + userInfo.getUserId());
		System.out.println("MySql : �����ϱ�" + userInfo.getPassword());
	}

}
