
public class Ex01Class2 {

	public static void main(String[] args) {
		
		int x; // 값을 저장하는 변수
		Person2 person; // 주소(참조)를 저장하는 참조변수
		person = new Person2(); // 값을 저장하는 인스턴스
		
		x = 10;
		person.name = "John Doe";
		
		int y = x;
		Person2 person2 = person;
		
		y = 20;
		person2.name = "Jane Doe";
		
		System.out.println("x = " + x);
		System.out.println("name = " + person.name);
		
	}
}

//클래스 만들기 -> 자료형 만들기 (설계도)
class Person2 {
	//변수 : 특성 or 속성
	String name;
	String email;
	String phone;
	
	//메서드 : 기능
	String info() {
		return "[" + name + "]" + "[" + email + "]" + "[" + phone + "]";
	}
	
}
















