package ch13;

public class GateWay {
	
	private static int zealotCount;

	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "게이트웨이";
	}
	
	// 메서드 리턴 타입으로 객체를 생성
	// 질럿을 생산하기
	public Unit createUnit(int target) {
		// 매개변수 1. 질럿
		// 매개변수 2. 드라군
		// 매개변수 3. 다크템플러
		zealotCount++;
		System.out.println("질럿" + zealotCount + "을 생산합니다");
		if(target == 1) {
			return new Zealot("질럿" + zealotCount);
		} else if(target == 2) {
			return new Dragon("드라곤" + zealotCount);
		} else {
			return new DarkTempler("다크 템플러");
		}
		
	}
	
}
