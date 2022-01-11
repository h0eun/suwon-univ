
public class Ex02Inheritance {

	public static void main(String[] args) {
		
		//1. 상속확인 : 상속된 멤버 사용
		TheDerived d1 = new TheDerived();
		d1.m1(); // 상속 받은 메서드 사용
		d1.m2(); // 직접 정의한 메서드 사용
		
		System.out.println("2. ===========================");
		
		//2. 상속관계에 있는 클래스 사이의 형변환
		TheBase b2 = new TheDerived(); // 부모타입참조변수 -> 자식타입인스턴스
		// b2.m2(); // 자식 멤버를 사용할 수 없습니다.
		// TheDerived d2 = (TheDerived)new TheBase(); // 자식타입참조변수 -> 부모타입인스턴스
		// TheDerived dd2 = (TheDerived)b2;
		if (b2 instanceof TheDerived) { //b2를 TheDerived로 형변환 가능한지 확인 
			System.out.println("형변환 가능");
			TheDerived d2_2 = (TheDerived)b2;
		}
		
		System.out.println("3. ===========================");
		//3. 메서드 재정의
		TheBase b3 = new TheBase();
		b3.m1(); // base.m1 호출
		TheDerived d3 = new TheDerived();
		d3.m1(); // derived.m1 호출
		
		//4. 
		// 참조 타입과 인스턴스 타입이 다를 때 재정의 메서드 호출 결과?
		TheBase b4 = new TheDerived();
		b4.m1();//TheDerived.m1 ( 인스턴스 타입의 메서드 호출 )
	}
}
class TheBase {
	private String data1;
	public String data2;
	
	public TheBase() {
		System.out.println("TheBase.constructor");
	}
	
	public void m1() {
		System.out.println("TheBase.m1");
	}
}
// TheBase 상속 -> TheBase의 멤버가 TheDerived에 포함
class TheDerived extends TheBase {

	private String data3;
	
	//메서드 재정의 : 부모 클래스의 메서드와 형태는 같고 내용은 다르게
	@Override
	public void m1() {
		System.out.println("TheDerived.m1");
	}
	
	public void m2() {
		// data1 = "Modified String"; // 부모 클래스의 private 멤버 사용 X
		System.out.println("data2 = " + super.data2);
		System.out.println("TheDerived.m2");
	}
	
}






