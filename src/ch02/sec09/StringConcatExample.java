package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {

		// 결합 연산
		String result1 = "10" + (2 + 8);
		System.out.println("result1: " + result1);

		String result2 = 10 + "2" + 8;
		System.out.println("result2: " + result2);

		// 숫자 연산
		int result3 = 8 + 10 + 2;
		System.out.println("result3: " + result3);

		// 문자열 -> int(기본타입)
		int result4 = Integer.parseInt(result1);
		System.out.println(result4 + 10);

		// 기본타입 -> 문자열
		String result7 = String.valueOf(result4);
		System.out.println(result7);
		System.out.println(result7.getClass().getSimpleName()); // java의 타입 보기 방

	}

}
