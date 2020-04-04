/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String original = ""; // Object of string
        String reverse="";//Object of string
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome");
        //Original string 
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        //Check if its a palindrome or not using equals
        if (original.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string isn't a palindrome.");
        }
    }
}
