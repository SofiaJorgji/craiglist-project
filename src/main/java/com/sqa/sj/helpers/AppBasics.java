package com.sqa.sj.helpers;

import java.util.*;

import com.sqa.sj.helpers.exceptions.*;

public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Method to farewell user from the application.
	 */
	public static void farewellUser(String name) {
		System.out.println("Thanks for using this app.\nHave a great day " + name + "!");
	}

	/**
	 * Method which greets user and gets their name.
	 *
	 * @return The user's name.
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + " Application.");
		System.out.print("Could I get your name please: ");
		return scanner.nextLine();
	}

	public static boolean requestBoolean(String question) {
		boolean isInvalid = true;
		boolean response = false;
		String input = "";
		while (isInvalid) {
			System.out.print(question + " (Yes/No): ");
			input = scanner.nextLine();
			try {
				if (input.equalsIgnoreCase("yes")) {
					isInvalid = false;
					response = true;
				} else if (input.equalsIgnoreCase("no")) {
					isInvalid = false;
					response = false;
				} else {
					throw new InvalidBooleanResponse();
				}
			} catch (InvalidBooleanResponse e) {
				System.out.println("You have an incorrect response (Yes/No) [" + input + "]");
			}
		}
		return response;
	}

	public static int requestByte(String question) {
		byte value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Byte.parseByte(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	public static char requestChar(String question) {
		boolean isInvalid = true;
		String input = "";
		while (isInvalid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				if (input.length() > 1) {
					throw new InvalidCharResponseLength();
				}
				isInvalid = false;
			} catch (InvalidCharResponseLength e) {
				System.out.println("You have entered too many characters [" + input + "]");
			}
		}
		return input.charAt(0);
	}

	public static char requestChar(String question, String charErrorResponse, char... possibleChars) {
		boolean isInvalid = true;
		String input = "";
		boolean validChar = false;
		while (isInvalid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				if (input.length() != 1) {
					throw new InvalidCharResponseLength();
				}
				for (char c : possibleChars) {
					if (Character.toUpperCase(c) == input.toUpperCase().charAt(0)) {
						validChar = true;
					}
				}
				if (!validChar) {
					throw new CharNotValidException();
				}
				isInvalid = false;
			} catch (InvalidCharResponseLength e) {
				System.out.println("You must enter only one character [" + input + "]");
			} catch (CharNotValidException e) {
				System.out.println(charErrorResponse + " [" + input + "]");
			}
		}
		return input.charAt(0);
	}

	public static double requestDouble(String question) {
		double value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Double.parseDouble(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct decimal formatted number [" + input + "]");
			}
		}
		return value;
	}

	public static float requestFloat(String question) {
		float value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Float.parseFloat(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct decimal formatted number [" + input + "]");
			}
		}
		return value;
	}

	public static int requestInt(String question) {
		return requestIntWithinRange(question, 0, 0, "");
	}

	public static int requestIntWithinRange(String question, int min, int max, String rangeErrorResponse) {
		int value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Integer.parseInt(input.trim());
				if (min != 0 && max != 0) {
					if (value < min) {
						throw new UnderMinException();
					}
					if (value > max) {
						throw new OverMaxException();
					}
				}
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have entered an incorrect formatted number [" + input + "]");
			} catch (OutOfRangeException e) {
				System.out.println(rangeErrorResponse + " [" + input + "]");
			}
		}
		return value;
	}

	public static long requestLong(String question) {
		long value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Long.parseLong(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	public static short requestShort(String question) {
		short value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scanner.nextLine();
			try {
				value = Short.parseShort(input.trim());
				isInvalid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		return input.trim();
	}
}
