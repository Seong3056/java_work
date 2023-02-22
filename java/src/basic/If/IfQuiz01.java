package basic.If;

import java.util.Scanner;

public class IfQuiz01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("당신의 키: ");
	Double h = sc.nextDouble();
	
	System.out.print("당신의 나이: ");
	int age = sc.nextInt();
	
	System.out.printf("당신의 키: %.1fcm\n",h);
	System.out.printf("당신의 나이: %d세\n",age);
	System.out.println("---------------");
		if(h>=140 & age >= 8) 
			System.out.println("놀이기구 탑승가능"); 
		else 
			System.out.println("놀이기구 탑승불가능");
	
	System.out.println("오늘하루 즐거운 시간 되세요!");	
	
	sc.close();
}
}
