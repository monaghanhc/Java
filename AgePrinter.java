import java.util.Scanner;

// Write down your code below to get user's age from the keyboard
// and print it (with approproate message) on the screen
public class AgePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter age: ");

      String age = scnr.nextLine();  // Read user input
      System.out.println("Your age is: " + age);  // Output user input

   }
}
