package javaStudy;

public class Kukuhairetsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=0;a<9;a++) {
			System.out.println(kuku(3)[a]);
		}
		
	}
	
	
	public static int[] kuku(int x){
		
		int[] y = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<9;i++) {
			y[i] = (i + 1) * x;
		}
		
		return y;
		
	}
	

}
