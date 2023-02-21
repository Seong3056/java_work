package trash;
import java.util.Random;


public class aa {

	public static void main(String[] args) {		
		Random random = new Random(); // 랜덤 객체 생성
		int ran,ran1;
		int[] comp = new int[4];
		int i;
		int l=1;
		int s,b,o;
		loop: 
		while(l==1) {
			l=0;
			random.setSeed(System.currentTimeMillis());
			ran = random.nextInt(999);
			ran1 = ran;
		
			System.out.println("생성된 난수"+ran);
			for(i=3;i>0;i--) {
				comp[i] = ran % 10;
				ran/=10;
				System.out.println(i+"번째 숫자:"+comp[i]);
			
			}
			for(i=0;i<3;i++) {
				if(comp[i] == comp[(i+1)%3]) {
					System.out.println("중복된 숫자"+comp[i]+ ", "+ comp[(i+1)%3]);
					l=1;
					}
				
			}
			System.out.println("중복되지않은 난수"+ran1);
			
		}
		
		s = 0;
		for(i=3;i>0;i--) {
			comp[i] = ran1 % 10;
			ran1/=10;
			System.out.println(i+"번째 숫자:"+comp[i]);
			}
		/*for(i=0;i<3;i++) {
				System.out.println(comp[i]+","+(i+1));
			if(comp[i] == i+1) {
				s++;
				}*/
		}
				
				
				
				
	}
		


