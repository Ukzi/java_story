package test.ch06;

public class Earth {
	//상수(변수명은 대문자로 쓴다.스네이크 타입으로 쓴다)
	//final: 절대 변경 x, static: 전역 변수(어디서든 사용가능)
	static final double EARTH_RADIUS = 6400; // 지구둘레
	static final double EARTH_RADIUS_AREA;
	
	//static 블럭: static 필드를 초기화 해줄 때 사용
	static {
		EARTH_RADIUS_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
