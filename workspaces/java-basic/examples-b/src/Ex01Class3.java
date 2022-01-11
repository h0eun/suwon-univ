
public class Ex01Class3 {

	public static void main(String[] args) {
		
		// Point p; // 참조변수 만들기
		// p = new Point(); // 인스턴스 만들기 + 주소를 참조변수에 저장
		
		//참조변수 만들기 + 인스턴스 만들기 + 주소를 참조변수에 저장
		Point p = new Point(); 
		
		p.x = 10;
		p.y = 20;
		
		String info = p.info();
		System.out.println(info);
		
		///////////////////////////////////
		
		Calc calc = new Calc();
		for (int i = 0; i < calc.data.length; i++) {
			calc.data[i] = (int)(Math.random() * 900) + 100;
		}
		
		int result = calc.sum();		
		System.out.println("SUM : " + result);
	}
}
class Calc {	
	//int[] data;
	int[] data = new int[10];
	//데이터 저장 반복문
	int sum() {
		int result = 0;
		for (int i = 0; i < data.length; i++) {
			result += data[i]; // result = result + data[i]
		}
		return result;
	}	
}

class Point {
	int x;
	int y;
	
	String info() {
		//return "[X : " + x + "][Y : " + y + "]";
		return String.format("[X : %d][Y : %d]", x, y);
		//String.format -> System.out.printf과 동일하지만 출력 X
	}
}








