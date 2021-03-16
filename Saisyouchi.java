package javaStudy;

public class Saisyouchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nambers = {45,21,32};
		System.out.println(saisyouchi(nambers));

	}
	
	public static int saisyouchi(int[] nambers){
		int min = nambers[0];
		for(int namber:nambers) {
			if(min>namber) {
				min = namber;
			}
		}
		return min;
	}

}
