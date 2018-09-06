package ba.coder.kr;

public class MyCalcInfo {
	private int input1;
	private int input2;
	private String operator;
	private double result;
	
	@Override
	public String toString() {
		
		return "input1 = "+ input1
				+"/ input2 = " + input2
				+"/ operator = " + operator
				+"/ result = " + result;
	}
	public int getInput1() {
		return input1;
	}
	public void setInput1(int input1) {
		this.input1 = input1;
	}
	public int getInput2() {
		return input2;
	}
	public void setInput2(int input2) {
		this.input2 = input2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public double add() {
		result = (double) input1 + input2;
		return this.result;
	}
}
