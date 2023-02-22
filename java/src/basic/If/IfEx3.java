package basic.If;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		/*
		 # if의 중첩문
		 - else if문의 첫번째 조건식이 false일 경우 분기를 나눴다면
		   if의 중첩문은 첫번째 조건식이 true인 경우 분기를 나누는 방식이다.
		   
		 # 변수의 유효 범위
		 - 변수는 선언된 블록내에서만 유효한다.
		   선언된 블록을 벗어나면 메모리에서 자동으로 소멸한다.
		 - 변수를 선언할 때 사용 범위를 잘 파악해서 전체적으로 
		   사용할 변수라면 미리 선언해 두고,
		   지역적으로 사용할 변수는 그 블록 범위 내에서만 
		   사용하고 소멸시키는게 좋다.
		 */
		
		Scanner sc = new Scanner(System.in);
			System.out.print("키를 입력: ");
			int h = sc.nextInt();
		
		if(h >= 140) {
			System.out.print("나이를 입력: ");
			int age = sc.nextInt();
			
			if(age >= 8) 
				System.out.println("놀이기구 탑승 가능"); 
			else if (age >= 6) 
				System.out.println("보호자 동반 시 놀이기구 탑승 가능");
			else
				System.out.println("놀이기구 탑승 불가능");
		}
		else 	System.out.println("140cm 미만은 이용할 수 없습니다.");
		sc.close();
	}

}
