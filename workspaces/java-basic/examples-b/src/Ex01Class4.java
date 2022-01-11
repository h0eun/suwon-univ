
public class Ex01Class4 {

	public static void main(String[] args) {
		
		Point2 point = new Point2();
		
		// point.x = -10; //오류 : private 멤버 사용 X
		point.setX(-10);
	
	}
}

class Point2 {
	//클래스의 멤버변수는 외부의 접근으로부터 보호 
	private int x; //private : 클래스 외부에서 접근할 수 없음
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (x >= 0) {
			this.x = x; //this : 클래스의 멤버를 지시하기 위해 사용
		}
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public String info() { //public 모든 곳에서 접근 가능		
		return String.format("[X : %d][Y : %d]", x, y);
	}
}








