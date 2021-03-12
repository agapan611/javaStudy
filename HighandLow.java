package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class HighandLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int x1 = r.nextInt(10)+1;
		int x2 = r.nextInt(10)+1;
		int y;
		
		System.out.println("ハイアンドローゲーム");
		System.out.println("11未満なら1　11以上なら2");
		int z = s.nextInt();
		int total = x1 + x2;
		
		if(total < 11 && z == 1 || total >= 11 && z == 2) {
			System.out.println("あたり");
		}else {
			System.out.println("はずれ");
		}
		
		System.out.println(total);
		
		
		

	}

}
