package javaStudy;

public class Kuku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 1;
		int y = 1;
		
		
		while(x<10) {
			while(y<10) {
				System.out.print(x * y);
				y = y + 1;
			}
			System.out.println(" ");
			y = 1;
			x = x + 1;
		}
		
		

	}

}
