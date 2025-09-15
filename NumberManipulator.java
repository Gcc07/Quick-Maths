import java.util.Scanner;

public class NumberManipulator {
    public static Scanner input = new Scanner(System.in);
    public static double getDoubleInput(String prompt) {
            System.out.print(prompt);
            return input.nextDouble();
        }
    
    public static void main(String[] args) {
        
        
        
        // Prompt the user to enter a decimal number
        double user_input = getDoubleInput("Input decimal number: ");
        // Store the input in a variable

        // Print the smallest integer greater than or equal to the number
        System.out.println("The smallest integer greater than or equal to the number "+ user_input + " is " + (int)Math.ceil(user_input));  // Used math.ceil to get the ceiling integer.      
        // Print the largest integer less than or equal to the number
        System.out.println("largest integer less than or equal to the number "+ user_input + " is " + (int)Math.floor(user_input)); // Used math.floor to get the bottom integer.
        // Print the integer that is closest to the number (ties go to even)
        System.out.println("The integer that is closest to the number (ties go to even) " + user_input + " is "+ (int)Math.rint(user_input)); // Used Rint because it satasfies the required logic
        // Print the integer closest to the number (standard rounding)
        System.out.println("The integer closest to the number "+ user_input + " is "+ (int)Math.round(user_input)); // Used round because it provides basic rounding
        // BONUS:
        // Cast the number to an int and print the character it represents
        System.out.println("Character: "+ (int)user_input + " is "+ (char)(int)user_input); // Casting the user input int to Char
        // Add 1 to that number and print the next character'
        int next_character = (int)(user_input + 1); // The proceeding ASCII character from the one the user inputted
        System.out.println("Character (+ 1): " + next_character + " is " + (char)(int)next_character);

        // Format a summary table using formatted output
        //
    }
}
