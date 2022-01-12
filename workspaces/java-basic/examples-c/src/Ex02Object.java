
public class Ex02Object {
	
	public static void main(String[] args) {
		
		//1. 
		MyObject obj = new MyObject();
		System.out.println(obj.toString());		
		Object obj2 = obj; //상속을 받았기 때문에 형변환 가능
		
		//2. 
		MyObject obj2_1 = new MyObject();
		obj2_1.no = 1;
		obj2_1.name = "John Doe";
		MyObject obj2_2 = new MyObject();
		obj2_2.no = 1;
		obj2_2.name = "John Doe";
		
		if (obj2_1 == obj2_2) { // 비교연산자는 항상 참조를 비교
			System.out.println("참조가 같습니다.");
		} else {
			System.out.println("참조가 다릅니다.");
		}
		// Object.equals : 재정의 방식에 따라 값 또는 참조 비교
		if (obj2_1.equals(obj2_2)) { 
			System.out.println("값이 같습니다.");
		} else {
			System.out.println("값이 다릅니다.");
		}		
		//3.
		MyObject obj3 = new MyObject();
		System.out.println(obj3.hashCode());
	}	
}

class MyObject /* extends Object */ {
	
	int no;
	String name;	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof MyObject == false) { //형식이 다르다면 비교 불가
			return false;
		}
		
		MyObject other = (MyObject)obj;
		
		if (this.no == other.no &&
			this.name.equals(other.name)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return no; // 고유 값을 반환하도록 정의
	}
	
	//Object.toString : 객체의 정보를 문자열로 반환하는 메서드
	@Override
	public String toString() {
		return String.format("[%d][%s]", no, name);
	}
	
}












