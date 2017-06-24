package com.sqa.sj;

import java.util.*;

import com.sqa.sj.helpers.*;

public class JavaFunApp {

	static int num;

	private static String appName = "Java Fundamentals";

	private static String name;

	public static int compareValueTo10() {
		System.out.print("Please enter a number ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		if (num > 10) {
			System.out.println("Number is greater than 10");
		} else {
			System.out.println("Number is less or equal to 10");
		}
		return num;
	}

	public static void main(String[] args) {
		name = AppBasics.greetUserAndGetName(appName);
		compareValueTo10();
		evalMonth();
		evalGradeLetter();
		AppBasics.farewellUser(name);
	}

	private static void evalGradeLetter() {
		System.out.println("Please enter your grade: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num >= 0 && num < 50) {
			System.out.println("You got F.");
		} else if (num >= 50 && num < 60) {
			System.out.println("You got D.");
		} else if (num >= 60 && num < 70) {
			System.out.println("You got C.");
		} else if (num >= 70 && num < 80) {
			System.out.println("You got B.");
		} else if (num >= 80 && num <= 100) {
			System.out.println("You got A.");
		}
	}

	private static void evalMonth() {
		System.out.print("Please enter a number between 1 and 12: ");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		switch (num) {
		case 1:
			System.out.println("The name of month number 1 is January");
			break;
		case 2:
			System.out.println("The name of month number 2 is February");
			break;
		case 3:
			System.out.println("The name of month number 3 is March");
			break;
		case 4:
			System.out.println("The name of month number 4 is April");
			break;
		case 5:
			System.out.println("The name of month number 5 is May");
			break;
		case 6:
			System.out.println("The name of month number 6 is June");
			break;
		case 7:
			System.out.println("The name of month number 7 is July");
			break;
		case 8:
			System.out.println("The name of month number 8 is August");
			break;
		case 9:
			System.out.println("The name of month number 9 is September");
			break;
		case 10:
			System.out.println("The name of month number 10 is October");
			break;
		case 11:
			System.out.println("The name of month number 11 is November");
			break;
		case 12:
			System.out.println("The name of month number 12 is December");
			break;
		default:
			System.out.println("Your number should be between 1 and 12");
		}
	}
}
