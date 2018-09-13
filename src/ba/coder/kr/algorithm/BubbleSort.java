package ba.coder.kr.algorithm;

public class BubbleSort {
	public void bubbleSort(int[] input) {
		int i=0;
		int temp;
		
		for(i=input.length; i>0; i--) {
			for (int j=0; j<i-1; j++) {
				if(input[j] > input[j+1]) {
					temp = input[j]; 
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
			printArray(input);
		}
	}
	public void printArray(int [] input) {
		int i;
		for(i=0; i<input.length; i++) {
			System.out.print(input[i] );
			if(i < input.length-1)System.out.print(",\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] data = { 56, 43, 11, 23, 87, 6, 2 };
		BubbleSort sort = new BubbleSort();

		System.out.println("======정렬 전===============");
		sort.printArray(data);
		
		System.out.println("======Bubble Sort Start=========");
		sort.bubbleSort(data);
		
		System.out.println("======Bubble Sort Result=========");
		sort.printArray(data);
	}

}
