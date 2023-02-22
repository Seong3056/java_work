package basic.If;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력: ");
		int x = sc.nextInt();
		
		
		
		if		(x == 0)		
			System.out.println("0입니다.");
		else if (x % 7 == 0) 	
			System.out.println("7의 배수입니다.");
		else
			System.out.println("7의 배수가 아닙니다.");
		
		sc.close();	
		

	}

}
