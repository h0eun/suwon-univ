
public class Ex07LottoApp {

	static java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {		
		System.out.println("로또 당첨 예상 번호 뽑기를 시작합니다.");
		System.out.println();
		
		outer : while (true) {	
			String selection = showMenu();
			System.out.println();
			
			switch (selection) {
			case "1": break;
			case "9": 
				System.out.println("행운을 빕니다.");
				System.out.println("프로그램을 종료합니다.");
				break outer;
			}
			
			System.out.println();			
		}		
		scanner.close();
	}
	
	public static String showMenu() {
		System.out.println("************************************");
		System.out.println("* 1. 당첨 예상 번호 뽑기");
		System.out.println("* 9. 종료");
		System.out.println("************************************");
		System.out.print("작업 번호를 입력하세요 : ");
		String selection = scanner.nextLine();
		return selection;
	}

}
