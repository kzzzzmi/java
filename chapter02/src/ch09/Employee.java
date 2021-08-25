package ch09;

public class Employee {
	
	private static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee(String employeeName) {
		this.employeeId = ++serialNum;
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public static int getSerialNum() {
		// ���� : static �޼��� �ȿ����� ��� ������ ����� �� ����
		// why : ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� static�̱� �����̴�
		// department = "ȫ����";
		return serialNum;
	}
	
}
