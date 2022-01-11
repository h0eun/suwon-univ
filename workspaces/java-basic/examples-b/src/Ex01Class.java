
public class Ex01Class {

	public static void main(String[] args) {
		
		//1. 클래스의 인스턴스 만들기
		int x;// 자료형 변수이름;		
		Person person; // 클래스자료형 변수이름 (참조 변수 만들기)
		person = new Person(); // 인스턴스 만들기 + 인스턴스의 주소를 참조변수에 저장

		//2. 인스턴스 사용하기 (인스턴스의 멤버 사용하기)
		person.name = "John Doe";
		person.email = "johndoe@example.com";
		person.phone = "010-9512-7532";
		
		String info = person.info();
		System.out.println(info);
		
		
	}
}

//클래스 만들기 -> 자료형 만들기 (설계도)
class Person {
	//변수 : 특성 or 속성
	String name;
	String email;
	String phone;
	
	//메서드 : 기능
	String info() {
		// return "[" + name + "][" + email + "][" + phone + "]";
		return String.format("[%s][%s][%s]", name, email, phone);
	}
	
}
















