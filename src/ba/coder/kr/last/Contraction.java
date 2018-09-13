package ba.coder.kr.last;

public class Contraction {
	
	// 만약 inputNumber 가 123 으로 들어온다면
	public static int sumEach(int inputNumber){
		int tot=0;		// 합을 저장할 변수
		
		while(inputNumber!=0){
			tot+=inputNumber%10; // 3 -> 2-> 1
			inputNumber/=10;     // 123-> 12-> 1->0
		}
		
		return tot;
	}
	
	public static void main(String[] args) {
		int number=1234567;
		
		int value=sumEach(number);
		
		System.out.printf("%d에 대한 각자리의 수 합: %d" ,number ,value);
	}
}
