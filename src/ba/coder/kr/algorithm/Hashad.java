package ba.coder.kr.algorithm;

public class Hashad {

	public boolean solution(final int x) {
		int var = x;
		boolean answer = true;
		int [] array = {10000, 1000, 100, 10, 1};
		int sum = 0;
		if(x > 10000) {
			System.out.println("잘못된 입력입니다. 10000 이하의 수를 입력하세요");
		} else {
			for(int i=0; i<array.length; i++) {
				sum += var/array[i];
				var = x%array[i];
			}
		}
		System.out.println("x: " + x +"/ sum: " + sum);
		answer = x%sum == 0;
		return answer;
	}
}
