package Source.Java;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Problem: https://open.kattis.com/problems/ants
 */

public class Ants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        while(cases --> 0){
            int poleLength = scanner.nextInt(); // in cm
            int totalAnts = scanner.nextInt();

            ArrayList<Integer> antPosition = new ArrayList<>();

            for(int i = 0; i < totalAnts; i++){
                antPosition.add(scanner.nextInt());
            }

            int earlyTime = Math.min(antPosition.get(0), poleLength - antPosition.get(0));
            int latestTime = Math.max(antPosition.get(0), poleLength - antPosition.get(0));

            for(int i : antPosition) {
                earlyTime = Math.max(earlyTime, Math.min(i, poleLength - i));
                latestTime = Math.max(latestTime, Math.max(i, poleLength - i));
            }

            System.out.println(earlyTime + " " + latestTime);
        }

    }
}

