package com.hanul.phone;

import java.util.Scanner;

public class SmartPhone extends DMBPhone{
	private String channel = "정보없음";
	public SmartPhone(String phonename, String color, String model, String state) {
		super(phonename, color, model, state);
	}//SmartPhone
	
	@Override
	public void menuBar() {
		System.out.println("=============================================================");
		System.out.println("1.전화받기\t2.전화끊기\t3.음성메세지 수신&송신\t4.DMB\n5.Internet\t6.Webtoon\t9.뒤로가기");
		System.out.println("=============================================================");
	}

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
		}else if(menubar == 5) {
			System.out.println("인터넷을 켭니다");
			internet(scanner);
		}else if(menubar == 6) {
			System.out.println("인터넷을 켜야 웹툰을 킬 수 있습니다");
			powerOn(scanner);
		}else if(menubar == 9) {
			phonePlay();
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}

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
			phonePlay();
		}else if(menubar == 5) {
			System.out.println("전원이 꺼져있어 인터넷을 켤수가 없습니다.");
			phonePlay();
		}else if(menubar == 6) {
			System.out.println("전언이 꺼져있어 웹툰을 켤수 없습니다.");
			phonePlay();
		}else if(menubar == 9) {
			phonePlay();
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}

	@Override
	public void callOn(Scanner scanner) {
		System.out.println("통화중입니다");
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
		}else if(choi == 5) {
			System.out.println("인터넷을 켭니다.");
			callOn(scanner);
		}else if(choi == 6) {
			System.out.println("웹툰을 켭니다.");
			callOn(scanner);
		}else if(choi == 9) {
			powerOn(scanner);
		} else {
			System.out.println("다시입력하세요");	
		}//if
	}//callOn
	
	public void internet(Scanner scanner) {
		System.out.println("인터넷이 켜졌습니다");
		menuBar();
		int Incho = Integer.parseInt(scanner.nextLine());
		
		if(Incho == 1) {
			callOn(scanner);
		}else if(Incho == 2) {
			System.out.println("통화중이 아닙니다.");
			powerOn(scanner);
		}else if(Incho == 3) {
			System.out.println("통화중인 상태가 아닙니다. 음성 전송 & 수신이 불가 합니다.");
			powerOn(scanner);
		}else if(Incho == 4) {
			System.out.println("DMB방송을 켭니다 : 현재 채널 : " + channel);
			DMB(scanner);
		}else if(Incho == 5) {
			System.out.println("인터넷이 켜져 있습니다.");
			internet(scanner);
		}else if(Incho == 6) {
			System.out.println("웹툰을 켭니다");
			powerOn(scanner);
		}else if(Incho == 9) {
			System.out.println("인터넷을 끕니다");
			powerOn(scanner);
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}
	
	
}//class
