package ba.coder.kr.algorithm;

public class MaxMin {
	public String solution(String s) {
		String answer = "";
		
		String[] sarray = s.split(" ");
		int[] array = new int[sarray.length];
		
		int i = 0;
		for(String num : sarray) {
			array[i++] = Integer.parseInt(num);
		}
		
		int max = array[0];
		int min = array[0];
		
		for(int num : array) {
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		StringBuilder sb = new StringBuilder();
		answer = sb.append(min).append(" ").append(max).toString();
		return answer;
	}
}
