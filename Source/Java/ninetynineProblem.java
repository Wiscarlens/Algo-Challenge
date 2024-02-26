package Source.Java;

import java.util.Scanner;

/*
	* Problem: https://open.kattis.com/problems/ninetynine
*/

public class ninetynineProblem {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		int n = scnr.nextInt();
		
		int left = n, right = n;
		while ((left % 100) != 99 && (right % 100) != 99) {
			if (left > 1) left--;
			right++;
		}

		if ((left % 100) == 99 && (right % 100) == 99) {
			System.out.println(right);
		}
		
		else if ((left % 100) == 99) {
			System.out.println(left);
		}
		else {
			System.out.println(right);
		}

	}

}
