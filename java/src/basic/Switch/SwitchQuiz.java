package basic.Switch;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int result = 0;
		System.out.print("첫번째 정수를 입력:");
		int a = sc.nextInt();
		
		System.out.print("연산을 입력 [+ - * /]: ");
		String o = sc.next();
		
		System.out.print("두번째 정수를 입력:");
		int b = sc.nextInt();
		
		switch (o) {
		
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/":
			if(b==0){ System.out.println("연산할수 없는 입력값입니다."); flag = true; break;}
				  result = a / b; break;			
		default:
			System.out.println("잘못된 기호를 입력"); flag = true;
			break;
			
		}
		sc.close();
		if(!flag)
			System.out.printf("%d %s %d = %d",a,o,b,result);
		
		

	}

}
