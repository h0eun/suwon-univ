
public class Ex07AbstractClass {
	
	public static void main(String[] args) {
		
		//1. 추상 클래스의 인스턴스 만들 수 없음
		//TheAbstract obj = new TheAbstract(); //오류
		
		//2. 추상 클래스 사용 ( 다형성 전제 )
		TheAbstract obj2 = new TheSpecified();
		
	}	
}

//추상클래스 : 인스턴스를 만들 수 없는 클래스
abstract class TheAbstract {
	
	//추상 클래스는 비추상멤버를 포함할 수 있습니다.
	int x;
	int y;
	
	//추상 메서드 : 본문( { ... } )이 없는 메서드
	abstract void m();
}

//추상 클래스는 상속을 통해서 사용
//추상 클래스를 상속하는 클래스는 반드시 추상메서드를 재정의 하거나
class TheSpecified extends TheAbstract {

	@Override
	void m() {		
	}
	
}

//추상 클래스를 상속하는 클래스는 다른 추상클래스로 정의
abstract class TheAbstract2 extends TheAbstract {

	
}













