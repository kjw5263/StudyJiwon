//문제2
/*배열의 인덱스가 범위를 벗어날 떄 발생하는..
 * ArrayIndexOutOfBoundsException을 처리하는 프로그램을 작성하라.
 */

public class Test2 {
	public static void main(String[] args) {
		//정수형(4) intArray 배열 만들기 크기 5
		int[] intArray = new int[5];
		
		//0번째 인덱스 0으로 초기화
		intArray[0] = 0;
		
		
		for(int i=0; i<5; i++) {
			intArray[i+1] = i+1 + intArray[i]; 
			System.out.println("intArray[" + i + "]=" + intArray[i]);
		} 
		
		try {
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다");
		}
//출력결과
//		intArray[0]=0
//		intArray[1]=1
//		intArray[2]=3
//		intArray[3]=6
//		배열의 인덱스가 범위를 벗어 났습니다.
		
		
	}

}