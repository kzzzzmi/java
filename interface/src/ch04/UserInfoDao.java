package ch04;

// �ְ� ���� �����ڰ� �������̽��� �����ؼ�
// Ŭ���̾�Ʈ�� �ڵ��� �ñ�
// DB�� ���� �ڵ��� �ñ�
// �������̽� (�Ծ�, ���)�� ����� ���� �ʴ´ٸ� 
// ���� �������� �۾��� ���� ������ ��ٷ��� ��
// �� ���߽ð� ���� --> ���� ��� ����
public interface UserInfoDao {

	// Ŭ���̾�Ʈ �����ڴ� �Ű������� UserInfo ��ü�� �Ѱ��ָ� �ȴ�
	// DB �����ڴ� UserInfo ��ü�� �޾Ƽ� �ڵ��� �ϸ� �ȴ�
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
