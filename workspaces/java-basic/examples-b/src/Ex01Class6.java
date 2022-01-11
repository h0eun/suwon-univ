
public class Ex01Class6 {

	public static void main(String[] args) {
		
		Item.setShared("This is shared member");
		
		Item item1 = new Item();
		item1.setNo(1); // == item1.no = 1
		item1.setName("Test Item 1"); // == item1.name = "Test Item 2"
		//Item.shared = "Shared Member"; //static 멤버는 클래스로 접근
		Item.setShared("Shared Member"); //static 멤버는 클래스로 접근
		
		//                              item1.no       item1.name
		System.out.printf("[%d][%s]\n", item1.getNo(), item1.getName());
		
		Item item2 = new Item();
		
		System.out.printf("[%d][%s]\n", item2.getNo(), item2.getName());
		//System.out.println(item2.shared);
		System.out.println(Item.getShared());
		
		double d = Math.random(); // Math클래스의 static 메서드 사용
		
	}
}

class Item {
	
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	
	static {
		System.out.println("static 초기화 블럭");
	}
	
	public static String getShared() {// 공유 메서드
		// no = 10; //static 메서드에서 인스턴스형 멤버 사용 금지
		return shared;
	}
	public static void setShared(String shared) { // 공유 메서드
		Item.shared = shared;
	}
	private static String shared; // 공유 멤버 : 한 번만 만들고 모든 인스턴스가 공유
	
	private int no;
	private String name;
	
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
}



