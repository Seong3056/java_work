package basic.array;

import java.util.Arrays;

public class Array2D_Quiz {

	public static void main(String[] args) {
		
		int[][] score = {
				{79,80,99}, //A학생
				{95,85,89}, //B학생
				{90,65,56}, //C학생
				{69,78,77},	//D학생
				//3과목
		};
		
		String[] stuName = {"A학생","B학생","C학생","D학생"};
		String[] subName = {"국어","영어","수학"};
		
		double[] stuAvg = new double[4];
		double[] subAvg = new double[3];
		
		int i,j;
		double avg;
		
		for(i=0;i<4;i++) {
			avg =0;
			for(j=0;j<3;j++) {
				avg += score[i][j];
			}
			stuAvg[i] = avg / 3;
			System.out.printf("%s의 평균점수: %.1f  ",stuName[i],stuAvg[i]);
		}
		System.out.println();
		/*
		 int idx = 0;
		 for(int[] stu: score){
		 	int total = 0;
		 	for(int s:stu){
		 	 total += s;
		 	}
		 	double avg = (double)total / subName.length ;
		 	System.out.printf("%s의 평균점수: %.1f\n",stuName[idx],avg);
		 	idx++;
		 }
		 */
		
		for(i=0;i<3;i++) {
			avg = 0;
			for(j=0;j<4;j++) {
				avg += score[j][i];
			}
			subAvg[i] = avg / 4;
			System.out.printf("%s의 평균점수: %.1f  ",subName[i],subAvg[i]);
		}
		System.out.println();
		
		avg = 0;
		for(double n:stuAvg)
			avg += n;
		avg /= 4;
		System.out.printf("반 평균점수: %.1f",avg);
	}//main

}
