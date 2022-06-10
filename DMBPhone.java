package com.hanul.phone;

import java.util.Scanner;

public class DMBPhone extends OnePhone{
	private String channel = "정보없음";
	
	public DMBPhone(String phonename, String color, String model, String state) {
		super(phonename,color, model, state);
		
	}//DMBPhone

	@Override
	public void menuBar() {
		System.out.println("==========================================================================");
		System.out.println("1.전화받기\t2.전화끊기\t3.음성메세지 수신&송신\t4.DMB\t9.뒤로가기");
		System.out.println("==========================================================================");
	}//menuBar

	@Override
	public void printInfo() {
		System.out.println(phonename +"(색상 :" + color + ", 모델명 : " + model + ", 상태 : " + state + "채널정보 : " + channel +")가 지급 되었습니다");
	}//printInfo

	@Override
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
		}else if(menubar == 4) {
			System.out.println("DMB방송을 켭니다 : 현재 채널 : " + channel);
			DMB(scanner);
		}else if(menubar == 9) {
			phonePlay();
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}//powerOn

	@Override
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
		}else if(menubar == 4) {
			System.out.println("전원이 꺼져있어 DMB방송을 켤수가 없습니다.");
		}else if(menubar == 9) {
			phonePlay();
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}//powerOff
	
	@Override
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
		}else if(choi == 4) {
			System.out.println("통화중에는 DMB를 볼수 없습니다");
			callOn(scanner);
		}else if(choi == 9) {
			powerOn(scanner);
		} else {
			System.out.println("다시입력하세요");	
		}//if
	}

	public void DMB(Scanner scanner) {
		System.out.println("1.채널변경\t2.DMB종료");
		int DMBcho = Integer.parseInt(scanner.nextLine());
		if(DMBcho == 1) {
			System.out.println("변경할 채널을 입력하세요");
			int DMBcha = Integer.parseInt(scanner.nextLine());
			System.out.println("DMB방송의 채널을 변경 합니다 : " + DMBcha + "번으로 변경");
			DMB(scanner);
		}else if(DMBcho == 2) {
			System.out.println("DMB를 종료합니다");
			powerOn(scanner);
		}else {
			
		}//if
	}//DMB

}//class
