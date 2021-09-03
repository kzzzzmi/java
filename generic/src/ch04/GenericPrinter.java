package ch04;

public class GenericPrinter<T extends Material> { // Material�� ��ӹ��� Ŭ������ �ްڴ�

	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return this.material;
	}
	
	@Override
		public String toString() {
			return material.toString();
		}

}
