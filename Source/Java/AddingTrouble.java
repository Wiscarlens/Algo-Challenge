package Source.Java;

import java.util.Scanner;

public class AddingTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int result = scanner.nextInt();

        boolean isCorrect = firstDigit + secondDigit == result;

        if(isCorrect) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }

    }
}
