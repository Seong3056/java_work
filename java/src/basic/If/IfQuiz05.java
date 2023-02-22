package basic.If;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		double avrg;
		String grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int p1 = sc.nextInt();
		System.out.print("영어점수: ");
		int p2 = sc.nextInt();
		System.out.print("수학점수: ");
		int p3 = sc.nextInt();
		
		avrg = (p1 + p2 + p3) / 3.0;
				
		if (avrg >= 90 && avrg <=100) {
			 if (avrg >= 95) grade = "A+";
			else			 grade = "A";}
		else if (avrg >= 80) grade = "B";
		else if (avrg >= 70) grade = "C";
		else if (avrg >= 60) grade = "D";
		else 				 grade = "F";
		System.out.printf("평균 점수: %.1f\n",avrg);
		System.out.printf("당신의 학점은 %s 입니다.",grade);
		sc.close();
	}

}
