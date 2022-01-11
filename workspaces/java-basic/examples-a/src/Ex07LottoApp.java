
public class Ex07LottoApp {

	static java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {		
		System.out.println("로또 당첨 예상 번호 뽑기를 시작합니다.");
		System.out.println();
				
		outer : while (true) {	
			String selection = showMenu();
			System.out.println();
		
			int[] numbers = null;
			switch (selection) {
			case "1": 
				do {
					numbers = selectBasicNumbers();
				} while (/* 평균 검사 */ !checkMean(numbers) ); // !true -> false, !false -> true
				// 출력
				showNumbers(numbers);
				break;
			case "9": 
				System.out.println("*** 행운을 빕니다.");
				System.out.println("*** 프로그램을 종료합니다.");
				break outer;
			default : 
				System.out.println("*** 지원하지 않는 명령입니다.");
			}
			
			System.out.println();			
		}		
		scanner.close();
	}

	private static boolean checkMean(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		int mean = sum / numbers.length;
//		if (mean >= 20 && mean <= 26) {
//			return true;
//		} else {
//			return false;
//		}
		return ( mean >= 20 && mean <= 26 );
	}

	private static void showNumbers(int[] numbers) {
		System.out.print("SELECTED NUMBERS : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("[%2d]", numbers[i]);
		}
		System.out.println();
	}

	private static int[] selectBasicNumbers() {
		int[] numbers;
		// 기본 규칙이 적용된 번호 뽑기
		numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 45) + 1; // 1 ~ 46 (46은 포함하지 않음)
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--; // i = -1;
				}
			}
		}
		return numbers;
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
