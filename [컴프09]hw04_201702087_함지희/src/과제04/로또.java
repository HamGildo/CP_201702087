package 과제04;

import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
		
		Random rand = new Random(System.currentTimeMillis());
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int a ;
		
		for(int i = 1 ; i <= 6 ; i++) {
			a = rand.nextInt(45)+1;
			if(a == num1 || a == num2 || a == num3 || a == num4 || a == num5 || a == num6 ) {
				i--;
				continue;
							}
			else {
				switch(i) {
				case 1 : 
					num1 = a ;
					break;
				case 2 :
					num2 = a ;
					break;
				case 3 :
					num3 = a ;
					break;
				case 4 :
					num4 = a ;
					break;
				case 5 :
					num5 = a ;
					break;
				case 6 :
					num6 = a ;
					break;
					
				}
			}
			
		}
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 );

	}

}
