package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Delete_Quiz {
	public static void main(String[] args) {
		
		
		
		boolean flag=true;
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
		String[] tmp = new String[kakao.length-1];
		System.out.println("현재 저장된 친구들: "+Arrays.toString(kakao));
		
		System.out.print("삭제를 원하는 친구를 입력: ");
		String name = sc.next();
		sc.close();
		for(i =0;i<kakao.length;i++) {			
			if(name.equals(kakao[i])) {
			flag= true;
			for(j=i;j<kakao.length-1;j++){
				kakao[j]=kakao[j+1];
			}
			break;
			}
			
		}
		if(!flag) System.out.println("해당이름은 없는 이름입니다.");
		else {
			for(i=0;i<tmp.length;i++) {
				tmp[i]=kakao[i];
			}
		kakao = tmp;
		tmp=null;
		System.out.println(Arrays.toString(kakao));
		}
		
		
	/*	int i,j;
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
		String[] tmp = new String[kakao.length-1];
		System.out.println("현재 저장된 친구들: "+Arrays.toString(kakao));
		
		System.out.print("삭제 희망하는 이름을 입력: ");
		String name = sc.next();
		sc.close();
		for(i =0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) break;
			}
		
		if(i==kakao.length) System.out.println("해당이름은 없는 이름입니다.");
		else {
		for(j=i;j<kakao.length-1;j++) {
			kakao[j]=kakao[j+1];
		}
		System.out.println(Arrays.toString(kakao));
		for(i=0;i<kakao.length-1;i++) {
			tmp[i]=kakao[i];
		}
		kakao = tmp;
		tmp = null;
		System.out.println(Arrays.toString(kakao));
		}
		
		*/
		
	}

}
