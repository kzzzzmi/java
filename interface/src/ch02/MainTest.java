package ch02;

public class MainTest {

	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		
		television.turnOn();
		television.turnOff();
		System.out.println("----------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("----------------");
		toyRobot.turnOn();
		toyRobot.turnOff();
		
		// 다형성 - 배(선박, 신체, 과일)
		// 배열 만들어서 크기는 3 인스턴스 변수를 넣기
		RemoteController[] remote = new RemoteController[3];
		remote[0] = television;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		
		// 확장 for문 이용 turnON() 호출
		for(RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		
		// 확장 for문 이용 turnOff() 호출
		for(RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		
		// 일반 for문 이용 클래스 타입이 ToyRobot이면 name을 화면에 출력
		for(int i=0; i<remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println(((ToyRobot)remote[i]).name);
			}
		}
		
		// 요구사항 추가! 인터페이스 추가
		// 냉장고에 문이 열렸으면 멜로디 소리를 나게 하기
		// 장난감 로봇에 건전지가 거의 없으면 멜로디 소리를 나게 하기
		((Refrigerator)remote[1]).notification();
		
		// 인터페이스 장점
		// 표준화가 가능하다
		// 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다
		// 클래스간에 결합도를 낮춰서 유연한 코드를 설계할 수 있다
		
		// 정리
		// 객체지향 패러다임 핵심
		// 객체와 객체간에 상호 협력해서 코드를 설계해 나간다( 버스, 지하철, 학생, 스타크래프트 )
		// 객체와 객체간의 관계를 정의해서 코드를 설계해 나간다 ( 상속, 포함관계, 추상클래스, 인터페이스)
		// 다형성 (클래스를 다양한 형태로 바라본다)!!!!
		
	
	}

}
