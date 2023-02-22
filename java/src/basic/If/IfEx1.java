package basic.If;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력: ");
		int point = sc.nextInt();
		System.out.println("내 점수는 "+ point + "점");
		
		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격입니다.");		}
		
		else {
			System.out.println("70점 미만입니다.");
			System.out.println("불합격입니다.");	}
		
		System.out.println("수고링");
		sc.close();
	}

}
