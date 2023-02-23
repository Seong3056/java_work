package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int x = sc.nextInt();
		System.out.print("정수2: ");
		int y = sc.nextInt();
		int tmp = 0;
		int total = 0;
		
//case 1
		int i = x;
		if(x>y) {
			tmp = x;
			x = y;
			y = tmp; }		
		while(i <= y)
			total += i++;
		
		System.out.printf("%d부터 %d까지 총합은 %d\n",x,y,total);
		sc.close();
//case 2		
		total = 0;
		i = (x>y ? y : x);		
		while((x>y ? x>=i : i<=y)) {
			if(x>y) total += i++;
			else 	total += i++;
		}
		System.out.printf("%d부터 %d까지 총합은 %d",x,y,total);
//case 3
		total = 0;
		int start = (x<y?x:y);
		int end = (x>y?x:y);
		while(start <= end)
			total += start++;
		System.out.printf("%d부터 %d까지 총합은 %d",x,y,total);
	}

}

//# while의 조건식안은 고정조건식이기 때문에 유동적인 식을 세울수 없다.
//1. 두 수의 값을 비교하여 작은값을 x에 넣는다.
//2. 두 수의 값을 비교하고 작은값을 부등호 왼쪽에 오게한다.  (x>y ? x>y : x<y)
//2-?. 삼항 조건식을 이용하려면 while문 안에서 사용해야한다.
//3+@. 두 수의 값을 비교하여 작은값, 큰값을 start / end에 값을 저장하여 while문 조건식에 넣는다.
