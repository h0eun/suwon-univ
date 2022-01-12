
public class Ex02ObjectArray {
	
	public static void main(String[] args) {
		
		//클래스의 배열은 객체 참조의 배열
		TheTest[] tests = new TheTest[10];
		
		for (int i = 0; i < tests.length; i++) {
			
			tests[i] = new TheTest();
			
			tests[i].x = (int)(Math.random() * 100);
			tests[i].y = (int)(Math.random() * 100);
		}
		
		System.out.println(tests[5].x + " / " + tests[5].y);
		System.out.println("End of program");
		
	}	
}

class TheTest {
	int x;
	int y;
}












