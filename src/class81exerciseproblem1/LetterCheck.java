package class81exerciseproblem1;

import java.util.Scanner;

/**
 * Program: Class Exercise 8 Problem 1 (Partial solution)
 * Determine whether a given character is a vowel or a consonant
 * Date: October 29, 2018
 * Author: Muhammad Shafique
 */
public class LetterCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables and Scanner object
        int flag = 1; // A flag -- 1 to continue or 0 to stop
        char c; // input chracter from user
        String st = ""; // input from keyboard
        Scanner s = new Scanner(System.in);
        
        // Loop until user decides to stop
        do {
            // Get input from user
            System.out.println("Please enter a letter:");
            st = s.next();
            c = st.charAt(0);
            
            // Find whether input character is vowel or consonant
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                System.out.printf("The input character %c is vowel.", c);                 
                
                if (Character.isDigit(c)) 
                   System.out.printf ("Entered character is not a letter ");
            else
                System.out.printf("The input character %c is consonant.", c);
            //Ask user to type 1 to continue or 0 to stop
            System.out.println("\nPlease enter 1 to continue or 0 to stop!");
            flag = s.nextInt();
        }
        while (flag != 0);
        
        // Terminate the program
        System.out.println("Thank you for using the program.");
    }
}
