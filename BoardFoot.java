import java.util.Scanner;

/**
 * This program calculates the length of a board in inches required to make
 * one board foot given the width and height in inches.
 *
 * @author Sarah Ouamou
 * @version 1.0
 * @since 2026-10-22
 */
public final class BoardFoot {

    /**
     * Private constructor to satisfy checkstyle utility class rule.
     */
    private BoardFoot() {
        // Prevent instantiation
    }

    /**
     * Function to calculate length given width and height.
     *
     * @param width  the width in inches
     * @param height the height in inches
     * @return required length in inches
     */
    public static double calculateBoardFoot(final double width,
                                            final double height) {
        // The formula for calculating the length of a board in inches
        return 144.0 / (width * height);
    }

    /**
     * Main entry point of the program.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the width
        System.out.print("Enter width: ");
        // Read the width input from the user
        String wInput = scanner.nextLine();
        // Prompt the user to enter the height
        System.out.print("Enter height: ");
        // Read the height input from the user
        String hInput = scanner.nextLine();
        // Use a try-catch block to handle potential input errors

        try {
            // Parse the input strings to double values
            double width = Double.parseDouble(wInput);
            // Parse the input strings to double values
            double height = Double.parseDouble(hInput);

            if (width <= 0 || height <= 0) {
                // If width/height is <= 0, print error message
                System.out.println(
                    "Error: Dimensions must be greater than zero."
                );
            } else {
                // Calculate required length using calculateBoardFoot function
                double length = calculateBoardFoot(width, height);
                // Print the required length to the console
                System.out.println(
                    "The required length is " + length + " inches."
                );
            }
        } catch (NumberFormatException e) {
            // If the input cannot be parsed to a double, print error message
            System.out.println("Error: Please enter valid numbers.");
        }
        // Close the scanner
        scanner.close();
    }
}
