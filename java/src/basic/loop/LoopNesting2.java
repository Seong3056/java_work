package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
        */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int a = sc.nextInt();
		int n=0; 		//약수의 갯수
		int m=0; 	//소수의 갯수
		System.out.print("소수:");
		int i,j;
		
		/*for(j=2;j<=a;j++) {
			n=0;
			for(i=1;i<=j;i++)
				if(j%i==0) n++;
			
			if(n<=2) {
				System.out.print(" "+j);
				m++;	
			}
		}
		System.out.println();
		System.out.printf("소수의 개수 %d개",m);
		}*/
		for(j=2; j<=a;j++) {
			for(i=2; j%i!=0; i++) {
				//j%i 했을때 0이아니라면 i++ 실행
				//System.out.printf("n%d i%d\n",n,i);
			}
			if(i==j) {
				System.out.printf("%d ",j);
				m++;
			}
		}
		System.out.println();
		System.out.printf("소수의 갯수는 %d",m);
	}

}

