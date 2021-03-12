package javaStudy;

import java.util.Scanner;

public class Zukei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int b = 1;
		int w = 4;
		
		while(b<10) {
			for(int i=0;i<w;i++) {
				System.out.print("□");
			}
			for(int i=0;i<b;i++) {
				System.out.print("■");
			}
			for(int i=0;i<w;i++) {
				System.out.print("□");
			}
			System.out.println(" ");
			w = w - 1;
			b = b + 2;
		}
		
		w = w + 1;
		b = b - 2;

		
		while(b>1) {
			w = w + 1;
			b = b - 2;
			for(int i=0;i<w;i++) {
				System.out.print("□");
			}
			for(int i=0;i<b;i++) {
				System.out.print("■");
			}
			for(int i=0;i<w;i++) {
				System.out.print("□");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		

	}

}
