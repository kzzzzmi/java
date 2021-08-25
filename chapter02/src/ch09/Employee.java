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
		// 주의 : static 메서드 안에서는 멤버 변수를 사용할 수 없다
		// why : 객체가 만들어지기 전에 접근해서 사용할 수 있는 static이기 때문이다
		// department = "홍보팀";
		return serialNum;
	}
	
}
