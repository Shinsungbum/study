import java.util.Scanner;

import com.hanul.phone.DMBPhone;
import com.hanul.phone.OnePhone;
import com.hanul.phone.SmartPhone;

public class SuperPhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 폰을 선택하세요!");
		System.out.println("============================================");
		System.out.println("1.1세대Phone\t2.DMBPhone\t3.SmartPhone");
		System.out.println("============================================");
		
		int cho = Integer.parseInt(scanner.nextLine());
		OnePhone onephone =null;
		if(cho == 1) {
			onephone = new OnePhone("1세대 폰", "검정", "이니셜-1", "종료");
			onephone.phonePlay();
			
		}else if(cho == 2) {
			onephone = new DMBPhone("2세대 폰","검정", "이니셜-2", "종료");
			onephone.phonePlay();
			
		}else if(cho == 3) {
			onephone = new SmartPhone("3세대 폰","검정", "이니셜-3", "종료");			
			onephone.phonePlay();
			
		}else {
			System.out.println("다시 선택해 주세요");
		}
		
	}//main()
	
	
}//class
