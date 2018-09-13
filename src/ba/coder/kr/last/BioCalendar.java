package ba.coder.kr.last;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	
	public static void main(String[] args) {
		int index=PHYSICAL;                  // 상수값을 변수에 대입
		int days= myDays("1986-04-10");
		
		System.out.println("days : "+days);
		
		double phyval = Math.sin( 2 * days * Math.PI / index );
		
		System.out.printf("나의 신체지수 %.2f입니다.\n",phyval * 100);
	}
	
	private static final String DATE_FORMAT = "yyyy-MM-dd";
	
	public static int myDays(String birth) {
//		System.out.println(current.toString());
		LocalDate birthDate = LocalDate.parse(birth, DateTimeFormatter.ofPattern(DATE_FORMAT));
		
		ZonedDateTime current = ZonedDateTime.now(ZoneId.of(TIME_ZONE));
		ZonedDateTime birthTime = ZonedDateTime.of(birthDate.getYear(), birthDate.getMonthValue(), birthDate.getDayOfMonth(), 0,0,0,0,  ZoneId.of(TIME_ZONE));
		
		Duration timeElapsed = Duration.between(birthTime, current);
		return (int) timeElapsed.toDays();
	}
}
