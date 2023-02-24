package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {
		
		/*
		# UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        */

		int r = (int) (Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		int count = 6;
		int c = 0;
		System.out.println("1부터 100까지 중 어느숫자일까요? 기회7번");
		
		while(true) {
			System.out.print("> ");
			int x = sc.nextInt();
			if(x>100||x<1) {
				System.out.println("범위내 숫자를 입력!!");
				continue;
			}
			if     	(x==r)	break;			
			else if	(x>r)	System.out.print("Down  ");
			else 			System.out.print("Up    ");
			
			if(count>0)
			System.out.printf("기회 %d번 남았습니다.",count);
			System.out.println();
			count --;	c++;
		}
		if(c<=7) System.out.printf("%d/7 맞추셨습니다!",c);
		else 	 System.out.printf("%d번째 맞추셨습니다!",c);
	}

}
