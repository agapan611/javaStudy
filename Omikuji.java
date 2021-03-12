package javaStudy;

import java.util.Random;

public class Omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int y = 1;
		int count = 0;
		
		while(y!=0) {
			y = r.nextInt(5);
			count = count+1;
			switch(y) {
			case 0:
				System.out.println("大吉");
				break;
			case 1:
				System.out.println("中吉");
				break;
			case 2:
				System.out.println("小吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			case 4:
				System.out.println("凶");
				break;
			}
		}
		System.out.println(count+"回引きました");
		
		
		
		
		

	}

}
