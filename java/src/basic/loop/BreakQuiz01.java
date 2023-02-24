package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		 
		int x1 = 0;
		int y1 = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("(0을 입력하면 문제풀이가 종료됩니다.)");
		while(true) {
			int x = (int)(Math.random()*100)+1;
			int y = (int)(Math.random()*100)+1;
			int o = (int)(Math.random()*2);
			count++;
			
			int result = (o==0?(x+y):(x-y));
			
			System.out.printf("%d %s %d = ?\t", x, (o==0?"+":"-"), y);
			if(count % 5 == 0) System.out.print("(0을 입력하면 문제풀이가 종료됩니다.)");
			System.out.print("\n> ");			
			int answer = sc.nextInt();
			
			if(result == answer) 	x1++;
			else if (answer != 0) 	y1++;			
			else break;			
		}
		System.out.printf("정답: %d개 오답: %d개",x1,y1);
		sc.close();
	}

}
