package ba.coder.kr.vehicle;

import java.util.ArrayList;

public class Vehicle {
	private ArrayList<Door> doors;
	private ArrayList<Wheel> wheels;
	private Body body;
	
	/**
	 * 움직이는 동작 구현
	 * @param isFront : 앞으로 가는지 / 뒤로 가는지
	 * @param speed : 얼마만큼의 속도로 이동하는지
	 */
	public void move(boolean isFront, int speed) {}
	/**
	 * 시동을 거는 동작 구현
	 * @param gasoline : 연료 남아있는 양
	 */
	public void engineOn(double gasoline) {}
}
