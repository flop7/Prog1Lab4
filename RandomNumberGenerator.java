/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergenerator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class RandomNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        //Creating a random object

        int trial = 0;

        //Loop for the 10 guesses/trials    
        for (int i = 0; trial < 10; trial++) {
            //Enter a number
            System.out.println("Please guess the random number");
            int c = keyboard.nextInt();

            //generating a random number
            Random rand = new Random();

            int x = rand.nextInt(100);
            System.out.println("Random number is " + x);

            //If number is guessed correctly print a congratulations statement
            if (c == x) {

                System.out.println("Congratulations,you guessed right!");

            } //if not guessed correctly cant try again for a total amount of 10 times
            else {
                System.out.println("Wrong,try again");
            }
            //After 10 trials, the loop is over
            if (trial == 10) {
                System.out.println("Unlucky, better luck next time");
            }
            {

            }

        }

    }

}
