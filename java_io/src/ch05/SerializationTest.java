package ch05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	String name;
	String job;

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + ", " + job;
	}

}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personLee = new Person("�̼���", "��ǥ�̻�");
		Person personKim = new Person("������", "���̻�");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(personLee);
			oos.writeObject(personKim);

		} catch (IOException e) {
			System.out.println(e);
		}

		/////////////////////////////////////////////

		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream oos = new ObjectInputStream(fis)) {

			Person p1 = (Person) oos.readObject();
			Person p2 = (Person) oos.readObject();

			System.out.println(p1);
			System.out.println(p2);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�۾��� �Ϸ��߽��ϴ�");

	}

}
