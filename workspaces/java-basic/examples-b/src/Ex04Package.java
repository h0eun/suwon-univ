import java.util.Scanner;

import com.example.two.Person; // 이제 Person은 com.example.two.Person입니다.

public class Ex04Package {
	public static void main(String[] args) {
	
		//클래스 이름은 원칙적으로 package-name.class-name으로 사용
		com.example.two.Person person = new com.example.two.Person();
		//person.no = 10; //오류 : 다른 패키지의 디폴트 접근성 멤버 사용 X
		
		Person person2 = new Person();
		person2.setName("John Doe");
		person2.setEmail("johndoe@example.com");
		person2.setPhone("010-6952-3698");
		
		System.out.println(person2.getEmail());
		
		//////////////////////////////////
		
		//java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		
		// public이 아닌 클래스는 다른 패키지에서 사용할 수 없습니다.
		// com.example.two.Test test = new com.example.two.Test();
	}
	
}












