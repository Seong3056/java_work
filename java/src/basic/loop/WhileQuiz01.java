package basic.loop;

import java.util.Scanner;


public class WhileQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단의 수: ");
		int x = sc.nextInt();
		int i = 1;
		
		while(i <= 9) {
			System.out.printf("%d x %d = %d\n",x,i,(x*i));
			i++;
		}
		sc.close();
	}

}
