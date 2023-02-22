package basic.If;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		int x1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int x2 = sc.nextInt();
		
		if 		(x1 > x2) 	System.out.printf("%d이 큰수입니다.",x1);
		else if (x2 > x1)	System.out.printf("%d이 큰수입니다.",x2);
		else				System.out.print("같은 수 입니다.");
		
		sc.close();
		
	}

}
