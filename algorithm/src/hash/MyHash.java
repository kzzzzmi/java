package hash;

public class MyHash {
	
	public Slot[] hashTable;
	
	public MyHash(int size) {
		hashTable = new Slot[size];
	}
	
	public class Slot {
		String value;
		public Slot(String value) {
			this.value = value;
		}
	}
	
	public int hashFunc(String key) {
		return(int)(key.charAt(0)) % this.hashTable.length;
	}
	
	public boolean saveData(String key, String value) {
		int address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			this.hashTable[address].value = value;
			return true;
		} 
		this.hashTable[address] = new Slot(value);
		return true;
	}
	
	public String getData(String key) {
		int address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			return this.hashTable[address].value;
		}
		return null;
	}
	
}
