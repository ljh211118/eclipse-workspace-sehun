package mymy;

import java.util.Scanner;

public class BasicTest {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*100);
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요!");
		int input = scan.nextInt();
		System.out.println(input);
		
		/*
		 * 
		 */
		
		while(input<0 || input>100) {
			System.out.println("다시 입력하세요");
			input = scan.nextInt();
		}
	}

}