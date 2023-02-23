package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		int r = (int) ((Math.random()*18)+2);
		
		for(int i =1;i<=19;i++)
			System.out.printf("%d x %d = %d\n",r,i,r*i);

	}

}
