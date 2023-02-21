package quiz;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 몇도?: ");
		double c = sc.nextDouble();
		
		double f = c * 1.8 + 32.0;
		
		System.out.printf(" %.1f℃는 %.1f℉이다.\n",c,f);
		
		sc.close();
		
	}

}
