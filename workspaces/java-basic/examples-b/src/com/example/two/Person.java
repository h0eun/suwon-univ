// 이 파일의 모든 클래스는 com.example.two 패키지에 포함됩니다.
package com.example.two;

public class Person {
	
	int no; //접근지정자를 명시하지 않으면 같은 패키지에서 사용 가능
	private String name;
	private String email;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

class Test {
	
	void m() {
		Person person = new Person();
		person.no = 10;			// default 멤버는 같은 패키지에저 접근 가능
		// person.name = "장동건";	// private 멤버는 같은 패키지라도 접근 불가능
	}
}
