package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		x++;
		++x;
		// 단독으로 쓰일때는 x = x + 1;
		System.out.println("x : " + x); // 12
		
		y--;
		--y;
		//단독으로 쓰일때는 y = y - 1;
		System.out.println("y : " + y); // 8
		
		z = x++; 
		System.out.println("z : " + z); // 12
		System.out.println("x : " + x); // 13
		
		z = ++x; 
		System.out.println("z : " + z); // 14
		System.out.println("x : " + x); // 14
		
		z = ++x + y++; // 14 + 9
		System.out.println("z="+z); // 23
		System.out.println("x="+x); // 15
		System.out.println("y="+y); // 9
	}

}
