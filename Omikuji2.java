package javaStudy;
import java.util.Random;

public class Omikuji2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random r = new Random();
		String[] omikuji = {"大吉","中吉","小吉","吉","凶"};
		System.out.print(omikuji[r.nextInt(5)]);
		

	}

}
