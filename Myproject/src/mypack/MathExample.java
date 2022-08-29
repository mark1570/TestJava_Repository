package mypack;

import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: "); 
		int a =sc.nextInt();
	
		System.out.println(Math.cos(a));
	}

}
