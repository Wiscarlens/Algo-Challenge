// Author: Wiscarlens Lucius
// Date: 9/4/2022
// Project:  Reversed Binary Number

import java.util.Scanner;

public class reversedBinaryNumb {
    public static void main(String[] args) {

        // Variable declaration
        int number;
        Byte counter = 0;
        int binary[] = new int [100];
        int reverseBinary = 0;
        String temp = "";

        Scanner scnr = new Scanner (System.in);

        // Request input from the user
        number = scnr.nextInt();

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

/*
 * Your task will be to write a program for reversing numbers in binary.
 * For instance, the binary representation of 13 is 1101, and reversing
 * it gives 1011, which corresponds to number 11.
 *
 * */
