package ba.coder.kr.last;

import java.util.ArrayList;
import java.util.Collections;

public class Lotto6Num {
	private ArrayList<Integer> lotteries;
	private int base;		//45
	private int ballNum;	//6

	// 생성자 1
	public Lotto6Num(int base, int ballNum) {
		this.ballNum=ballNum;
		this.base=base;
		//배열 생성
		lotteries = new ArrayList<>();
	}
	
	// 생성자 2
	public Lotto6Num() {
		this(45,6);
	}

	// 출력
	public void print(){
		for (int i = 0; i < lotteries.size(); i++) {
			System.out.printf("%d",lotteries.get(i));	// ln 이 붙지 않음
			
			// 숫자 사이의 쉼표를 풀력
			if(i!=lotteries.size()-1){
				System.out.printf(",\t",lotteries.get(i));
			}
		}
		
		System.out.println();
	}
	
	// 랜덤 숫자 가져오기
	private int rand(){
		return (int)(Math.random() * base) + 1;
	}
	
	// 랜덤 6개의 숫자 만들기
	public void make(){
		// 6개의 숫자가 완성 될 동안 반복문을 돌림
		while(lotteries.size() != ballNum){
			int temp=rand(); // 1 ~ 45 사이의 숫자
			
			if(!lotteries.contains(temp)){ // 중복된 숫자가 들어가지 않도록
				lotteries.add(temp);
			}
		}
		Collections.sort(lotteries);	//오름차순 정렬
	}
}
