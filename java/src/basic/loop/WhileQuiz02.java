wwwpackage basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int x = sc.nextInt();
		System.out.println("입력받은수 :"+x);
		System.out.print("약수 ");
		int i = 1;
		int t = 0;
		
		while(i <= x) {
			if(x%i==0) {
				t += i;
				System.out.printf("%d ",i);
			}
			i++;
		}
		sc.close();
		System.out.println();
		System.out.printf("총합은 %d 입니다.",t);
	}
}
