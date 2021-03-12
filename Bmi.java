package javaStudy;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bmi(1.75,70));
	}
		
		
		static String bmi(double height,double weight) {
			double x = weight / (height * height);
			if(x < 18.5) {
				return "低体重";
			}else if(x < 25) {
				return "標準";
			}else {
				return "肥満";
			}
		}


}
