package basic.loop;

public class WhileEx2 {
public static void main(String[] args) {
	
	int a = 48;
	while (a<=150) {
		
		if (a%8==0)
			System.out.printf("%d ",a);
		
		a++;
	}
	System.out.println();
	
	int b = 1;
	while(b<=100) {
		if(b%4==0 && b%8!=0)
			System.out.printf("%d ",b);
		b++;
	}
	System.out.println();
	
	int c = 1;
	int i = 0;
	while(c <= 30000) {
		if(c % 258==0)	i++;
		c++;
	}
	System.out.printf("1~30000에서 258의 배수의 개수: %d",i);
	System.out.println();
	
	int d = 1;
	int j = 0;
	while (d <= 1000) {
		if(1000 % d == 0) j++;
		d++;
	}
	System.out.printf("1000의 약수의 개수: %d",j);
	System.out.println();
}
}
