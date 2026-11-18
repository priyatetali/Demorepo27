package flmSelenium;

import java.util.Scanner;

public class ScannerDemoSumCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		
		int num3 = num1 + num2;
		
		System.out.println("Enter your name");
		String name = sc2.nextLine();
		
		System.out.println( "Number is " + num3 + " Name is " + name);
		
		sc1.close();
		sc2.close();
	}

}
