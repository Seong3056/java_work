package trash;

import java.util.Arrays;

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


	

	public static void main(String[] args) {		
		System.out.println("-");
		int r = rand();
		System.out.println(r);
		}
				
				
				
				
	}
		


