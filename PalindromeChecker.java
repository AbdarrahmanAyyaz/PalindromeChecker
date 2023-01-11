/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: PalindromeChecker.java
 * Author: Abdarrahman Ayyaz
 * **********************************************
 */

package assignment03PartB;

import java.util.Scanner;


public class PalindromeChecker {

    private static boolean isPalindrome(String string)
    {
        OurStack stack = new OurStack();
        int count = 0;
        String input = "";
        for(char i: string.toLowerCase().toCharArray())
        {
            if(i >= 'a' && i <= 'z')
            {
                stack.push(i);
                count++;
                input += i;

            }
        }
        String var = "";
        for(int i = 0; i < count; i++ )
        {
            var += stack.pop();
        }
        if(input.equals(var))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

   
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.print("[>>] Enter a string (or a ! to exit): ");
        String string = input.nextLine();

        while (!string.equals("!")) {
            if (isPalindrome(string)) {
                System.out.println(" [+] Yes. \"" + string + "\" IS a palindrome!");
            } else {
                System.out.println(" [-] No. \"" + string + "\" is NOT a palindrome!");
            }
            System.out.print("[>>] Enter a string: ");
            string = input.nextLine();
        }

        System.out.println("[<<] Thank you!");
     
    }
}
