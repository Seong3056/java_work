package basic.loop;

import java.util.Scanner;

public class WhileEx3 {
	public static void main(String[] args) {
		
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		   인지 판별
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int n = sc.nextInt();
		int i = 1;
		int c =0;
		
		while (i <= n) {
			if(n%i == 0) c++;
			i++;
		}
		if(c <= 2)	System.out.printf("%d 는 소수 입니다.",n);
		else		System.out.printf("%d 는 소수가 아닙니다.",n);
		System.out.println("--------------------------");
		
		int j = 2;
		while(n % j != 0) {
			j++;
		}
		System.out.println(n == j ? "소수입니다.":"소수가아닙니다.");
		sc.close();
	}
}
