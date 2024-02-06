import java.util.Scanner;

public class InputMethod {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream (usually the keyboard)
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the user's name
        String name;

        // Prompt the user to enter their name
        System.out.print("Enter Your Name: ");

        // Read the input from the user and store it in the 'name' variable
        name = input.nextLine();

        // Display a welcome message along with the user's name
        System.out.println("Welcome Mr. " + name);
    }
}
