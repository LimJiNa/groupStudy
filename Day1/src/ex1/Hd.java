package ex1;

public class Hd {
	public static void main(String[] args) {
//		int int = 100;  // 변수명 int가 예약어이다.
		int no1 = 100;
		
//		float if = 10.0;  // 변수명 if가 예약어이고, float형은 값 뒤에 f를 붙여야한다.
		float no2 = 10.0f;
		
//		long char = "Hellow";  // 변수명 char가 예약어이고, 값 "Hellow"의 자료형은 String이다.
		String no3 = "Hellow";
		
//		char no4 = 92233458846482;  // 값의 크기로 보아 long형인데 자료형이 char로 되어있고, long형은 값 뒤에 L을 붙여야한다.
		long no4 = 92233458846482L;
		
//		double float = "Java";  // 변수명 float가 예약어이고, 값 "Java"의 자료형은 String이다.
		String no5 = "Java";
		
//		float no6 = 100;  // 자동형변환이 이루어짐으로 문제없는 코드이나, 가독성을 위해 명확하게 값을 표기해준다.
		float no6 = 100.0f;
		
//		boolean no7 = (3 < 2 ? 1 : 2);  // boolean형의 값은 true와 false 둘 중 하나이어야 한다.
		boolean no7 = (3 < 2 ? true : false);
		
//		short no8 = 2112323245;  // 값의 크기로 보아 int형인데 자료형이 short로 되어있다.
		int no8 = 2112323245;
		
		System.out.println("1번: " + no1);
		System.out.println("2번: " + no2);
		System.out.println("3번: " + no3);
		System.out.println("4번: " + no4);
		System.out.println("5번: " + no5);
		System.out.println("6번: " + no6);
		System.out.println("7번: " + no7);
		System.out.println("8번: " + no8);
	}
}
