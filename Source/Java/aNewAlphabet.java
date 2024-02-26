package Source.Java;

import java.util.HashMap;
import java.util.Scanner;

/*
    * Problem: https://open.kattis.com/problems/anewalphabet
*/

public class aNewAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        HashMap<String, String> newAlphabet = getNewAlphabet();

        while (input.length() > 0) {
            String firstLetter = input.substring(0, 1);
            if (newAlphabet.containsKey(firstLetter)) {
                System.out.print(newAlphabet.get(firstLetter));
            } else {
                System.out.print(firstLetter);
            }
            input = input.substring(1);
        }
    }

    private static HashMap<String, String> getNewAlphabet() {
        HashMap<String, String> newAlphabet = new HashMap<>();

        newAlphabet.put("a", "@");
        newAlphabet.put("b", "8");
        newAlphabet.put("c", "(");
        newAlphabet.put("d", "|)");
        newAlphabet.put("e", "3");
        newAlphabet.put("f", "#");
        newAlphabet.put("g", "6");
        newAlphabet.put("h", "[-]");
        newAlphabet.put("i", "|");
        newAlphabet.put("j", "_|");
        newAlphabet.put("k", "|<");
        newAlphabet.put("l", "1");
        newAlphabet.put("m", "[]\\/[]");
        newAlphabet.put("n", "[]\\[]");
        newAlphabet.put("o", "0");
        newAlphabet.put("p", "|D");
        newAlphabet.put("q", "(,)");
        newAlphabet.put("r", "|Z");
        newAlphabet.put("s", "$");
        newAlphabet.put("t", "']['");
        newAlphabet.put("u", "|_|");
        newAlphabet.put("v", "\\/");
        newAlphabet.put("w", "\\/\\/");
        newAlphabet.put("x", "}{");
        newAlphabet.put("y", "`/");
        newAlphabet.put("z", "2");

        return newAlphabet;
    }
}
