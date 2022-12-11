package com.KoreaIT.java.AM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		
		//스캐너 타입의 sc라는 변수를 만들고 스캐너객체를 만들어서 연결한다
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			//무한루프
			System.out.println("명령어) ");
			String cmd = sc.nextLine();
			System.out.println("입력된명령어 > " + cmd );
			
			//이 안에 있는 명령어가 계속 실행된다
			
			if(cmd.equals("exit")) {
				//조건문 cmd라는변수의 값이 exit라는 문자와 같다면
				break;
				//탈출해라 break를 하지 않으면 무한반복문으로 실행된다
			}
		}
		
		
		
		sc.close(); //스캐너기능을 하용하면 반드시 이 실행문을 추가햐야한다

		System.out.println("==프로그램 종료==");
	
	
	
	}

}
