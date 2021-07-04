package Practical2;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) throws InterruptedException {

		int max = 999;
		int min = 100;
		Random rn = new Random();

		for (int i = 0; i <= 500; i++) {
			int answer = rn.nextInt(max - min + 1) + min;
			System.out.println(answer);
		}

		int numbers[] = { rn.nextInt(max - min + 1) + min };
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
				System.out.println("Largest number is : " + largest);
				System.out.println("Smallest number is : " + smallest);
			}

			// System.out.println("Largest number is : " + largest);
			// System.out.println("Smallest number is : " + smallest);

			System.out.println("Give me nth smallest number you want to print");
			Scanner userInput = new Scanner(System.in);
			String nthNumber = userInput.nextLine();
			nthNumber.charAt(smallest);
			Thread.sleep(2000);
		}
	}
}
