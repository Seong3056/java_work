package quiz;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();

		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.close();
				
		System.out.printf("\n이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("출생년도: %d\n", 2023 - age);		
		
	}

}







