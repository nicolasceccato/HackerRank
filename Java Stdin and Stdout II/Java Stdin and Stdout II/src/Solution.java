import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        Integer inteiro = scanner.nextInt();
        Double decimal = scanner.nextDouble();
        scanner.nextLine();
        String frase = scanner.nextLine();

        System.out.println("String: " + frase);
        System.out.println("Double: " + decimal);
        System.out.println("Int: " + inteiro);

    }
}