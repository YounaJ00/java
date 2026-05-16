package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour * 60) + minute;
		String total = ("총 " + totalMinute + "분");
		System.out.println(total);
		System.out.println(total.getClass().getSimpleName()); // java의 타입 보기 방

		char d = 'A';
		System.out.println(d);
		System.out.println(total.getClass().getSimpleName());
		System.out.println(d + 0);

		long var2 = 100; // 자동형변환 (int -> long)
		int var3 = (int) var2; // 강제 형 변환

		int x = 15;
		int y = 4;
		int z = x / 4;
		int o = x % 4;
		System.out.println(z);
		System.out.println(o);

	}

}
