package ch13;

public class GateWay {
	
	private static int zealotCount;

	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "����Ʈ����";
	}
	
	// �޼��� ���� Ÿ������ ��ü�� ����
	// ������ �����ϱ�
	public Unit createUnit(int target) {
		// �Ű����� 1. ����
		// �Ű����� 2. ���
		// �Ű����� 3. ��ũ���÷�
		zealotCount++;
		System.out.println("����" + zealotCount + "�� �����մϴ�");
		if(target == 1) {
			return new Zealot("����" + zealotCount);
		} else if(target == 2) {
			return new Dragon("����" + zealotCount);
		} else {
			return new DarkTempler("��ũ ���÷�");
		}
		
	}
	
}
