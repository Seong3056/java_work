package trash;
import java.util.Scanner;

public class aa {
	public static int rand() {

		int i,j;
		int [] comp = new int[3];
		int n =0;
		int r,r1;
		outer: while(true) {
			r = (int)((Math.random()*998)+1);
			r1 = r;
			//System.out.println(r);
			for(i=2;i>=0;i--) {
				comp[i] = r1%10;
				r1 /= 10;
			}
			//System.out.println(Arrays.toString(comp));
			for(i=0;i<3;i++) {
				for(j=i+1;j<3;j++)
					if(comp[i] == comp[j])						
						continue outer;
			}
			return r;
		}

	}
	static int[] digit(int a) {
		int[] tmp = new int[3] ;

		for(int i=2;i>=0;i--) {
			tmp[i] = a%10;
			a /= 10;
		}



		return tmp;
	}
	static int strike(int r) {
		int s=0;
		int[] comp = new int[3];
		
		for(int i=2;i>=0;i--) {
			comp[i] = r%10;
			r /= 10;
		}
		for(int i =0;i<3;i++) {
			if(comp[i]==i) { 
				s++;
				//System.out.printf("i%d s%d\n",i,s);
				}
			
		
	}
		return s;
	}
	static int ball(int r) {
		int b=0;
		int i,j;
		int[] comp = new int[3];
		
		for(i=2;i>=0;i--) {
			comp[i] = r%10;
			r /= 10;
		}
		for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {			
			if(comp[i]==j) {
				b++;
				//System.out.printf("i%d j%d b%d\n",i,j,b);
				}
			
		}//for_j
		}
		return b;
	}
	static void sbo(int x) {
		
		boolean Oflag=false;
		
		int s = strike(x);
		int b = ball(x) - s;
		if(s==0&&b==0) Oflag = true;
		if(Oflag) System.out.println("Out");
		else System.out.printf("S%d B%d\n",s,b);
		
	};
	



	public static void main(String[] args) {		

		int i=0,j;
		Scanner sc = new Scanner(System.in);
		
		int r = rand();
		
		System.out.println(r);
		
		while(i<10) {

			System.out.print("맞춰볼 숫자를 입력: ");
			int x = sc.nextInt();
			System.out.println(r+"r");
			sbo(x);
			i++;
		}//while
		sc.close();
	}//main




}//class



