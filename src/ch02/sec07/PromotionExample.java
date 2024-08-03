package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입변환 (값의 허용범위가 작은 타입이 값의 허용범위보다 큰 타입에 대입될때)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100L;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	}

}
