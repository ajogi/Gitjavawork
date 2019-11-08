package Arith;

public class Zerofilling {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int x=8;
		System.out.println("x="+x);
		x=x>>>2;
//x=5;
		System.out.println("After shifting 2 bit right and filling zeros,x="+x);
	}
}
