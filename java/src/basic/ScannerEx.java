package basic;

import java.util.Scanner;
//1. Scanner api 로딩 (제공되는 Scanner 정보를 현재 클래스로 불러오기)


public class ScannerEx {
	
	public static void main(String[] args) {
		
		//2. 스캐너 객체를 생성
		Scanner sc = new Scanner(System.in);
		
		/*
		  3. Scanner의 함수들을 이용하여 데아터를입력받을 수 있다.
		  - next(): 공백이 없는 문자열을 입력받는다.
		  - nextLine(): 공백을 포함한 문자를 입력받는다.
		  - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받는다.
		  ex)
		    nextInt(): 정수 데이터를 입력받는다.
		    nextDouble(): 실수 데이터를 입력받는다.
		 */
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		System.out.printf("이름은 %s, 나이는 %d",name,age);
		
		//4. Scanner 객체를 반납
		//객체를 반납 -> Scanner를 메모리에서 해제
		sc.close();
		
		
		
	}

}
