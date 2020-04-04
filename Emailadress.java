/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailadress;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Emailadress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an email with the @ in it: ");
        String str = scan.next();
        int pos = str.indexOf('@');
        // while str 
        str = scan.next();
        pos = str.indexOf('@');
        {
            if (str) {
                System.out.println("Correct email'  W);
            
            
            else{
                            System.out.println("Incorrect email")
                        }

            }
        
    
}
