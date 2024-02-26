package Source.Java;// Author: Wiscarlens Lucius
// Date: 9/4/2022
// Project:  Reversed Binary Number

import java.util.Scanner;

/*
 * Problem: https://open.kattis.com/problems/reversebinary

 * Your task will be to write a program for reversing numbers in binary.
 * For instance, the binary representation of 13 is 1101, and reversing
 * it gives 1011, which corresponds to number 11.
 *
 * */


public class reversedBinaryNumb {
    public static void main(String[] args) {

        // Variable declaration
        int number;
        byte counter = 0;
        int[] binary = new int [100];
        int reverseBinary;
        String temp = "";

        Scanner scanner = new Scanner (System.in);

        // Request input from the user
        number = scanner.nextInt();

        // Convert input into reserve binary value
        while (number != 0)
        {
            binary[counter] = number % 2;
            number = (number / 2);
            counter++;
        }

        // Convert the array of integer to a string
        for (int i = 0; i < counter; i++)
        {
            temp += Integer.toString(binary[i]);
        }


        // Convert the string to an integer
        // Convert the new binary integer to decimal
        reverseBinary = Integer.parseInt(temp, 2);

        // Output final value
        System.out.println(reverseBinary);

    }
}


