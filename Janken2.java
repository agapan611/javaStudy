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
			
			System.out.print(z[y]);
			
			
			}
		}
	
	System.out.println(kati + "勝" + make + "敗");

	}

}
