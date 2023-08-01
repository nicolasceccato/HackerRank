/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Input Format

The first line contains an integer, , denoting the number of test cases.
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.
Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            try {
                Long numberToBeVerified = scanner.nextLong();
                if (numberToBeVerified >= Byte.MIN_VALUE && numberToBeVerified <= Byte.MAX_VALUE) {
                    System.out.println(numberToBeVerified + " can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (numberToBeVerified >= Short.MIN_VALUE && numberToBeVerified <= Short.MAX_VALUE) {
                    System.out.println(numberToBeVerified + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (numberToBeVerified >= Integer.MIN_VALUE && numberToBeVerified <= Integer.MAX_VALUE) {
                    System.out.println(numberToBeVerified + " can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (numberToBeVerified >= Long.MIN_VALUE && numberToBeVerified <= Long.MAX_VALUE) {
                    System.out.println(numberToBeVerified + " can be fitted in:");
                    System.out.println("* long");
                } else {
                    System.out.println(numberToBeVerified + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
