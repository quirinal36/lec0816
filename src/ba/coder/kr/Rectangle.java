package ba.coder.kr;

public class Rectangle {
	private int width;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width > 0) {
			this.width = width;
		}else {
			System.out.println("0 보다 큰 수를 입력 해 주세요.");
		}
	}

	public int calc() {
		int result = this.width * this.width;
		return result;
	}
}
