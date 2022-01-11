
public class Ex03Polymorphism {

	public static void main(String[] args) {
		// 다형성 : 같은 코드로 (같은 참조로) 상황에 따라 ( 참조하는 인스턴스에 따라 ) 다른 동작이 실행되는 것
		//1. 다형성 사례 1
		TheLine line = new TheLine();
		doDraw(line);
		
		TheRect rect = new TheRect();
		doDraw(rect);
		
		TheOval oval = new TheOval();
		doDraw(oval);
		
		System.out.println("******************************");
		//2. 다형성 사례 2
		// Line 3개, Rect 3개, Oval 3개를 만들고 draw 호출
		// TheLine[] lines = new TheLine[3];
		TheShape[] shapes = new TheShape[10];
		for (int i = 0; i < shapes.length; i++) {
			switch (i % 3) {
			case 0: shapes[i] = new TheLine(); break;
			case 1: shapes[i] = new TheRect(); break;
			case 2: shapes[i] = new TheOval(); break;
			}
		}
		for (int i = 0; i < shapes.length; i++) {
			doDraw(shapes[i]);
		}
		
	}
	
	static void doDraw(TheShape shape) {
		shape.draw();// 인스턴스타입을 따라서 메서드 호출
	}
	
//	static void doDraw(TheLine line) {
//		line.draw();
//	}
//	static void doDraw(TheRect rect) {
//		rect.draw();
//	}
//	static void doDraw(TheOval oval) {
//		oval.draw();
//	}
}

class TheShape {
	public void draw() {
		System.out.println("Draw Shape");
	}
}
class TheLine extends TheShape {
	@Override
	public void draw() {
		System.out.println("Draw Line");
	}
}
class TheOval extends TheShape {
	@Override
	public void draw() {
		System.out.println("Draw Oval");
	}
}
class TheRect extends TheShape {
	@Override
	public void draw() {
		System.out.println("Draw Rect");
	}
}

