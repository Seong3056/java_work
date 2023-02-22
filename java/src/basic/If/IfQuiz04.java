package basic.If;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
		int [] x = new int[3];
		int i;
		int max = 0, mid=0, min=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			System.out.printf("%d번째 정수: ",i+1);
			x[i] = sc.nextInt(); }
		
		
		if	
		(x[0]>x[1] && x[0]>x[2]) 
			{	max = x[0];
			if(x[1]>x[2]) 
			{				
				mid = x[1];	min = x[2];		}
			else {
				mid = x[2];	min = x[1];		}		
			}
		
		else if
		(x[1]>x[2] && x[1]>x[0])
			{	max = x[1];
			if(x[2]>x[0]) {		
				mid = x[2];	min = x[0];		}
			else {
				mid = x[0];	min = x[2];		}
			}
		
		else 
			{	max = x[2];
			if(x[1]>x[0]) {				
				mid = x[1];	min = x[0];		}
			else {
				mid = x[0];	min = x[1];		}
			}
		System.out.printf("최댓값: %d\n중간값: %d\n최솟값: %d",max,mid,min);
	
		sc.close();
	
	
	}
	
}
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

