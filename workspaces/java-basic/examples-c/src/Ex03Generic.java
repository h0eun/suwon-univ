import java.util.ArrayList;

public class Ex03Generic {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();	// Object 형식으로 데이터 관리
		al1.add("hello");
		al1.add(10);
		
		int a = (int)al1.get(1); // 데이터를 읽을 때 형변환 필요
		
		ArrayList<String> al2 = new ArrayList<>();	// 지정된 형식으로 데이터 관리 ( 여기서는 String )
		al2.add("hello");
		//al2.add(10);
		String s = al2.get(0);
		
		ArrayList<Integer> al3 = new ArrayList<>();// 지정된 형식으로 데이터 관리 ( 여기서는 Integer )
		//al3.add("hello");
		al3.add(10);
		int i = al3.get(0);

	}

}
