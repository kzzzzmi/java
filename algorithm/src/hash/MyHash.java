package hash;

public class MyHash {
	
	public Slot[] hashTable;
	
	public MyHash(int size) {
		hashTable = new Slot[size];
	}
	
	public class Slot {
		String value;
		String key;
		Slot next;
		public Slot(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public int hashFunc(String key) {
		return(int)(key.charAt(0)) % this.hashTable.length;
	}
	
	public boolean saveData(String key, String value) {
		int address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			Slot findSlot = this.hashTable[address];
			Slot prevSlot = this.hashTable[address];
			while(findSlot != null) {
				if(findSlot.key == key) {
					findSlot.value = value;
					return true;
				} else {
					prevSlot = findSlot;
					findSlot = findSlot.next;
				}
			}
			prevSlot.next = new Slot(key, value);
		} else {
			this.hashTable[address] = new Slot(key, value);		
		}	
		return true;
	}
	
	public String getData(String key) {
		int address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			Slot findSlot = this.hashTable[address];
			while(findSlot != null) {
				if(findSlot.key == key) {
					return findSlot.value;
				} 
				findSlot = findSlot.next;
			}
		}
		return null;
	}
	
}
