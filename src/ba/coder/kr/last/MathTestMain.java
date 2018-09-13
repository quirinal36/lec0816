package ba.coder.kr.last;

public class MathTestMain {

	public static void main(String[] args) {
		//constant
		System.out.println("파이\t: Math.PI\t\t:"+Math.PI);
		//method
		System.out.println("절대값\t: Math.abs(-5)\t\t:"+Math.abs(-5));
		System.out.println("올림\t: Math.ceil(4.34)\t:"+Math.ceil(4.34));
		System.out.println("반올림\t: Math.round(4.34)\t:"+Math.round(4.5));
		System.out.println("버림\t: Math.floor(4.34)\t:"+Math.floor(4.34));
		System.out.println("반올림\t: Math.rint(4.34)\t:"+Math.rint(4.51));
		System.out.println("최대값\t: Math.max(45,78)\t:"+Math.max(45,78));
		System.out.println("최소값\t: Math.min(45,78)\t:"+Math.min(45,78));
		System.out.println("2의 4제곱\t: Math.pow(2,4)\t\t:"+Math.pow(2,4));
		
		System.out.println("---------- 삼각함수 -----------");
		System.out.print("Math.sin( Math.toRadians(90) )\t:");
		System.out.println(Math.sin(Math.toRadians(90)));
		
		System.out.print("Math.cos( Math.toRadians(180) )\t:");
		System.out.println(Math.cos(Math.toRadians(180)));
		
		//random
		System.out.println("----------랜덤 숫자----------");
		double dRan=Math.random();//0<==dRan<1 실수
		int    iRan=(int)(Math.random()*100);//0~100 사이의 정수
		System.out.println("Math.random()\t\t\t:"+dRan);
		System.out.println("(int)(Math.random()*100)\t:"+iRan);
	}
}
