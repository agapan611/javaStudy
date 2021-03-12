package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int x = s.nextInt();
		int y = r.nextInt(3);
		
		
		if(x==y) {
			System.out.println("あたり");
		}else {
			System.out.println("はずれ");
		}
//		System.out.println(■□);
		

	}

}
