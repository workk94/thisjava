package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("90점 이상");
			System.out.println("A등급");
		}
		// 블록 생략하면 한 줄 밑 라인만 if문에 해당됨 
		if(score < 90)
			System.out.println("90보다 작음");
			System.out.println("B등급");

	}

}
