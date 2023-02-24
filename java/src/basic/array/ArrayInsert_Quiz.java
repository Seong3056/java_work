package basic.array;

import java.util.Scanner;

public class ArrayInsert_Quiz {

	public static void main(String[] args) {

		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

         추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.

        */
		String[] foods = new String[50];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<foods.length;i++) {		//for문의 시작     {  
			                             		//0부터 'foods'의 배열길이(50)까지 반복
			System.out.print("먹고싶은 음식=> ");
			String f = sc.next();					//입력받은 값을 'f'에 저장
			
			if(f.equals("배불러")) {						//입력받은 'f'값이 "배불러"일때
				System.out.println("입력을 종료합니다~");
				break;									//for문을 종료
			}
			foods[i] = f;							//입력받은 값이 "배불러"가 아닌 모든 단어를 'foods'배열에 저장
		}										//for문의 끝        }
		System.out.printf("입력된 음식은: "); 
		for(String f:foods) {			//'foods'배열에 저장된 단어를 출력해주는 for문
			if(f==null) break;   			//만약 'foods'에 저장된 값이 null일 경우 for문 탈출
			System.out.print(f+" ");		//null이 아닌 다른 값은 모두 반복출력
		}
		sc.close();
		
		

	}

}
