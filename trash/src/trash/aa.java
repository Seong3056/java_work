package trash;
import java.util.Random;


public class aa {
	
	public static int rand() {
		int r = (int)((Math.random()*999)+1);
		int i,j;
		int [] comp = new int[3];
		boolean flag = true;
		
		while(flag) {
			flag = false;
			for(i=0;i<3;i++) {
				for(j=i+1;j<3;j++)
					if(comp[i] == comp[j])	flag = true;
				}
		}
		return r;
	};
	public static void main(String[] args) {		
		
		int r = rand();
		System.out.println(r);
		}
				
				
				
				
	}
		


