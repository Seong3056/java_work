package basic.loop;

public class LoopNestingQuiz02 {

	public static void main(String[] args) {
		
		int i,j;
		
		/*for(i=2;i<=9;i++) {
			System.out.printf("%d단 ",i);
			for(j=1;j<=9;j++)
				System.out.printf(" %d x %d = %d ",i,i,j,i*j);
			System.out.println();
		}*/
		
		/*for(i=1;i<=9;i++) {
			
			for(j=2;j<=9;j++) {
				
				System.out.printf(" %d x %d = %d\t",j,i,i*j);
				}
		System.out.println();
		}
	}
	*/
		for(i=0;i<=9;i++) {
				
			for(j=2;j<=9;j++) {
				if(i==0)System.out.printf("%d단 \t\t",j);
				else System.out.printf("%d x %d = %d\t",j,i,i*j);
				
			
			}
			System.out.println();
						
		}
	}

}
