package ch04;

public class UserInfoMsSqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MsSql : �����ϱ�" + userInfo.getUserName());
		System.out.println("MsSql : �����ϱ�" + userInfo.getUserId());
		System.out.println("MsSql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MsSql : �����ϱ�" + userInfo.getUserName());
		System.out.println("MsSql : �����ϱ�" + userInfo.getUserId());
		System.out.println("MsSql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("MsSql : �����ϱ�" + userInfo.getUserName());
		System.out.println("MsSql : �����ϱ�" + userInfo.getUserId());
		System.out.println("MsSql : �����ϱ�" + userInfo.getPassword());
	}

}
