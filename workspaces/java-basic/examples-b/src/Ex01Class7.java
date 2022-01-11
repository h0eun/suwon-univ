
public class Ex01Class7 {

	public static void main(String[] args) {
		
		final int k = 10;
		//k = 20; //오류 : final 변수의 값 변경 X
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
	}
}

class Constants {
	
	//final : 변경할 수 없음
	
	int x;
	final int y; // y는 값을 변경할 수 없는 변수
	final int y2 = 10; // 필드 초기화 하면 생성자에서는 초기화 할 수 없습니다.
	static final int Z = 10; //static final 은 반드시 초기화 필요
	
	public Constants() { //생성자 메서드
		x = 10;
		y = 10; // 생성자 메서드에서 final 변수의 값 변경 O
		// y2 = 10;
		// Z = 10; // 생성자 메서드에서 static final 변수의 값 변경 X
	}
	
	public void method() {
		x = 20;
		//y = 20; // final 변수의 값 변경 X
		//Z = 20; // static final 변수의 값 변경 X
	}
	
}






