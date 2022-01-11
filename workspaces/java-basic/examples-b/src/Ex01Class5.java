
public class Ex01Class5 {

	public static void main(String[] args) {
	
		int x = 10; // 초기화
		int[] ar = { 1, 2, 3 }; // 초기화
		
		Point3 p = new Point3(); // 인스턴스 만들기 --> 자동으로 생성자 메서드 호출
		System.out.println(p.info());
		
		Point3 p2 = new Point3(100, 200);//전달인자 있는 생성자로 인스턴스 만들기
		System.out.println(p2.info());
		
		/////////////////////////////////////////////////
		
		Product product = new Product();
		product.setNo(10); //product.no = 10;
		System.out.println("No : " + product.getNo()); //product.no
		
		Product product2 = new Product(10, "Cake", 32000);
		System.out.println( product2.info() );		
		
		System.out.println("End of Program");
	}
}

class Product {

	private int no;
	private String name;
	private double price;
	
	// 전달인자 없는 생성자 메서드 (기본 생성자 메서드)
	public Product() {
		this(1, "No Name", -1000);
		System.out.println("default");
	}
	public Product(int no, String name, double price) {
		// this(); // 같은 클래스의 전달인자 없는 생성자 메서드 호출
		this.no = no;
		this.name = name;
		this.price = price;
		System.out.println("custom");
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String info() {
		return String.format("[NO : %d][NAME : %s][PRICE : %f]", no, name, price);
	}
	
}

class Point3 {
	private int x;
	private int y;
	
	//생성자 메서드 -> 인스턴스가 생성될 때 (new 할 때) 자동으로 호출
	public Point3() {
		System.out.println("전달인자 없는 생성자 메서드");
	}	
	
	public Point3(int x, int y) {
		System.out.println("전달인자 있는 생성자 메서드");
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
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








