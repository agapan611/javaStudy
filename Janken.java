package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class Janken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		
		System.out.println("じゃんけん");
		System.out.println("1.グー　2.チョキ　3.パー");
		int kati = 0;
		int make = 0;
		
		while(kati<3 && make<3) {
				int x = s.nextInt();
				int y = r.nextInt(1+3);
				if(x==1) {
					if(y==1) {
						System.out.println("グー");
						System.out.println("あいこ");
					}else if(y==2) {
						System.out.println("チョキ");
						System.out.println("勝ち");
						kati = kati + 1;
					}else {
						System.out.println("パー");
						System.out.println("負け");
						make = make + 1;
					}
				}else if(x==2) {
					if(y==1) {
						System.out.println("グー");
						System.out.println("負け");
						make = make + 1;
					}else if(y==2) {
						System.out.println("チョキ");
						System.out.println("あいこ");
					}else {
						System.out.println("パー");
						System.out.println("勝ち");
						kati = kati + 1;
					}
				}else {
					if(y==1) {
						System.out.println("グー");
						System.out.println("勝ち");
						kati = kati + 1;
					}else if(y==2) {
						System.out.println("チョキ");
						System.out.println("負け");
						make = make + 1;
					}else {
						System.out.println("パー");
						System.out.println("あいこ");
						
					}
				}
			}
		
		System.out.println(kati + "勝" + make + "敗");
		if(kati == 3) {
				int omikuji = r.nextInt(5);
				switch(omikuji) {
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
		
		
		
		
		
		

	}

}
