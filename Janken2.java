package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class Janken2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		
		System.out.println("じゃんけん");
		System.out.println("1.グー　2.チョキ　3.パー");
		int kati = 0;
		int make = 0;
		String[] z = {"グー","チョキ","パー"};
		
		while(kati<3 && make<3) {
			int x = s.nextInt();
			int y = r.nextInt(3);
			System.out.println(z[y]);
			
			if(y + 1 == x) {
				System.out.println("あいこ");
			}else if(y + 1  == 1 && x == 3 || y + 1  == 2 && x == 1 || y + 1  == 3 && x == 2) {
				System.out.println("勝ち");
				kati +=1;
			}else {
				System.out.println("負け");
				make +=1;
			}
			
			}
		System.out.println(kati + "勝" + make + "敗");
		if(kati == 3) {
			String[] omikuji = {"大吉","中吉","小吉","吉","凶"};
			System.out.print(omikuji[r.nextInt(5)]);
		}
		}
	
	

}
