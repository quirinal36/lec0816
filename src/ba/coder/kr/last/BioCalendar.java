package ba.coder.kr.last;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

/**
 * https://ko.wikipedia.org/wiki/바이오리듬
 * 
 * 바이오리듬을 계산하기 위해서는 생년월일로부터 알고자 하는 날까지 총 살아온 날을 세어야만 한다. 
 * 이 생존일수를 days 라고 할 때 각각의 주기 그래프는 사인그래프로 그릴 수 있다.
 * 신체 : sin(2 * PI * days / 23 )
 * 
 * @author Lee
 *
 */
public class BioCalendar {
	public final static String TIME_ZONE = "Asia/Seoul";
	
	private static final String DATE_FORMAT = "yyyy-MM-dd";
	
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	
	public static void main(String[] args) {
		int index=PHYSICAL;                  // 상수값을 변수에 대입
		
		int days= myDays("1986-04-10");
		
		System.out.println("days : "+days);
		
		double phyval = Math.sin( 2 * days * Math.PI / index );
		
		System.out.printf("나의 신체지수 %.2f입니다.\n",phyval * 100);
	}
	
	/**
	 * 
	 * @param birth
	 * @return
	 */
	public static int myDays(String birth) {
		birth = JOptionPane.showInputDialog("생년월일을 yyyy-MM-dd 형태로 입력: ");
		LocalDate birthDate = LocalDate.parse(birth, DateTimeFormatter.ofPattern(DATE_FORMAT));
		
		// 현재 시간 (milli second 까지)
		ZonedDateTime current = ZonedDateTime.now(ZoneId.of(TIME_ZONE));
		// 내가 태어난 시간 ( 00 시 00 분 00 초)를 기준
		ZonedDateTime birthTime = ZonedDateTime.of(birthDate.getYear(), birthDate.getMonthValue(), birthDate.getDayOfMonth(), 0,0,0,0,  ZoneId.of(TIME_ZONE));
		
		// 시간 차이 계산
		Duration timeElapsed = Duration.between(birthTime, current);
		
		// 일 , 시간, 분 을 구할 수 있음.
		return (int) timeElapsed.toDays();
//		return (int) timeElapsed.toHours();
//		return (int) timeElapsed.toMinutes();
	}
}
