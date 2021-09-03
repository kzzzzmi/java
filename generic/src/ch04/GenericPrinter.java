package ch04;

public class GenericPrinter<T extends Material> { // Material을 상속받은 클래스만 받겠다

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
