package ba.coder.kr.algorithm;

public class Collatz {

	public int solution(int num) {
		int answer = 0;
		if(num >= 80000) {
			System.out.println("80000 미만의 수를 입력 해 주세요.");
			return answer;
		}
		while(num != 1) {
			if(num%2==0) {
				num /= 2;
			}else {
				num = num*3 +1;
			}
			if(answer++ >= 500) {
				answer = -1;
				break;
			}
			System.out.println(num +"/" + answer);
		}
		return answer;
	}
}
