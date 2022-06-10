package com.hanul.phone;
import java.util.Scanner;

public class OnePhone {
	
	protected String phonename;
	protected String color;
	protected String model;
	protected String state;

	
	public OnePhone(String phonename, String color, String model, String state) {
		this.phonename = phonename;
		this.color = color;
		this.model = model;
		this.state = state;
		
	}
	
	
	//실행
	public void phonePlay() {
		Scanner scanner= new Scanner(System.in);
			printInfo();
			powerOnOff();
			int menu = Integer.parseInt(scanner.nextLine());
			if(menu == 1) {
				powerOn(scanner);
			}else if(menu == 2) {
				powerOff(scanner);
			}else if(menu == 3) {
				
			}		
			
		
		
		
		
		
	}//phonePlay()
	
	
	//전원 키고 끄기
	public void powerOnOff() {
		System.out.println("전원을 켜시겠습니까?");
		System.out.println("1.네\t2.아니요");
	}//powerOnOff
	
	
	
	
	
	//메뉴바출력
	public void menuBar() {
		System.out.println("==================================================================");
		System.out.println("1.전화받기\t2.전화끊기\t3.음성메세지 수신&송신\t9.뒤로가기");
		System.out.println("==================================================================");
	}//menuBar
	
	
	
	
	//폰 상태정보
	public void printInfo() {
		System.out.println(phonename +"(색상 :" + color + ", 모델명 : " + model + ", 상태 : " + state + ")가 지급 되었습니다");
	}//printInfo
	
	
	
	
	//전원이 켜졌을 때 
	public void powerOn(Scanner scanner) {
		
		System.out.println("전원이 켜져있는 상태입니다.");
		menuBar();
		
		int menubar = Integer.parseInt(scanner.nextLine());
		if(menubar == 1) {
			callOn(scanner);
		}else if(menubar == 2) {
			System.out.println("통화중이 아닙니다.");
			powerOn(scanner);
		}else if(menubar == 3) {
			System.out.println("통화중인 상태가 아닙니다. 음성 전송 & 수신이 불가 합니다.");
			powerOn(scanner);
		}else if(menubar == 9) {
			phonePlay();
		}else {
			System.out.println("다시 입력하세요");
		}//if
		
	}//powerOn
	
	
	
	//전원이 꺼졌을 때
	public void powerOff(Scanner scanner) {
		System.out.println("전원이 꺼져있는 상태입니다");
		menuBar();
		int menubar = Integer.parseInt(scanner.nextLine());
		if(menubar == 1) {
			System.out.println("전원이 꺼져있어 전화 받기가 불가 합니다.");
			phonePlay();
		}else if(menubar == 2) {
			System.out.println("전원이 꺼져있어 전화 끊기가 불가 합니다.");
			phonePlay();
		}else if(menubar == 3) {
			System.out.println("전원이 껴져있어 음성 전송 & 수신이 불가합니다");
			phonePlay();
		}else if(menubar == 9) {
			phonePlay();
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}//powerOff()
		
	
	
	public void callOn(Scanner scanner) {
		System.out.println("전화가 와서 전화를 받았습니다.");
			menuBar();
			int choi = Integer.parseInt(scanner.nextLine());
			if (choi == 1) {
				System.out.println("통화중입니다");
				callOn(scanner);
			} else if (choi == 2) {
				System.out.println("전화를 끊습니다");
				powerOn(scanner);
			} else if (choi == 3) {
				System.out.println("1.전송\t2.수신");
				int send = Integer.parseInt(scanner.nextLine());
				if(send == 1) {
					System.out.println("전송할 음성을 입력하세요");
					callSend(scanner);		
					callOn(scanner);
				}else if(send == 2) {
					System.out.println("상대방 대화를 입력하세요");
					callRecevie(scanner);
					callOn(scanner);
				}else {
					System.out.println("잘못 입력 하였습니다");
				}
					
			}else if(choi == 9) {
				powerOn(scanner);
			} else {
				System.out.println("다시입력하세요");	
			}//if
			
	}//callOn
	
	public void callSend(Scanner scanner) {
		String callsend = scanner.nextLine();
		System.out.println("나 : " + callsend);
	}//callSend
 
	public void callRecevie(Scanner scanner) {
		String callRecevie = scanner.nextLine();
		System.out.println("상대방 : " + callRecevie);
	}
	
}//class
