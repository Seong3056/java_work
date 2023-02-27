package basic.loop;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		
		int i ;
		
		for(i=1;i<=200;i++) {
			if(i % 6 == 0 && i % 12 != 0)
				System.out.printf("%d ",i);
		}
		System.out.println();
		int n =0 ;
		for(i=1;i<=60000;i++) 
			if(i % 177 == 0) n++;
		System.out.println(n);

		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int a = sc.nextInt();
		int x = 1;
		sc.close();
		for(i=1 ; i<=a ; i++) 
			x *= i;
		
		
		
		System.out.println(x);
		
		
		
		
		
	}

}
