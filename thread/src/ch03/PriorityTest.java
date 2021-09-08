package ch03;

// Thread.Min_Priority(1) ~ Thread.Max_Priority(10)
// ����Ʈ �켱���� : 5
// �켱������ ���� Thread�� cpu�� ����� ���� Ȯ���� ������
// setPriority(), getPriority();

class PriorityThread extends Thread {
	@Override
	public void run() {
		int sum = 0;
		Thread t = Thread.currentThread();
		System.out.println(t + "start");
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		System.out.println(t.getPriority() + " : end");
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		int i;
//		for(i = Thread.MIN_PRIORITY; i<= Thread.MAX_PRIORITY; i++) {
//			PriorityThread pt = new PriorityThread();
//			// Thread�� �켱������ �����ϴ� ���
//			pt.setPriority(i);
//			pt.start();
//		}
		PriorityThread pt1 = new PriorityThread();
		pt1.setPriority(1);		
		PriorityThread pt2 = new PriorityThread();
		pt2.setPriority(5);
		PriorityThread pt3 = new PriorityThread();
		pt3.setPriority(10);
		
		pt1.start();
		pt2.start();
		pt3.start();		
	}

}
