package ch03;

public class GenericPrinter<T> {

	// T(type)��� ��ü ���ڸ� ���, E - element, K - key, V - value (��� �ƹ� ���ڳ� ��� ����)	
	// �ڷ��� �Ű����� (type parameter)
	// �� Ŭ������ ����ϴ� �������� ���� ����� �ڷ����� �����մϴ�

	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {	// T �ڷ����� ��ȯ�ϴ� ���׸� �޼���
		return this.material;
	}
	
	public String toString() {
		return material.toString();
	}
	
}
