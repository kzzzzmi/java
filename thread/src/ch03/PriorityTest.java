package ch03;

// Thread.Min_Priority(1) ~ Thread.Max_Priority(10)
// 디폴트 우선순위 : 5
// 우선순위가 높은 Thread가 cpu의 배분을 받을 확율이 높ㄷ다
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
//			// Thread의 우선순위를 지정하는 방법
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
