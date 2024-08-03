package ch02.sec01;

public class VariableIntitializationExample {

	public static void main(String[] args) {
		//변수 value 선언
		int value;
		
		//연산 결과를 변수 result의 초기값으로 대입(초기화되지 않은 변수를 연산식에 사용할 경우 컴파일 에러
		int result = value + 10;
		
		System.out.println(result);

	}

}
