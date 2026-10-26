import java.util.Scanner;

/**
 * Calculates the length of a board needed to make 1 board foot.
 * @author  Sarah Ouamou
 * @version 1.0
 * @since   2026-10-26
 */
public final class BoardFoot {

    /** value given to us by teacher 144 inches cubes i wish i knew wth this meant */
    private static final double BOARD_FOOT_VOLUME = 144.0;

    /**
     * Private constructor to prevent instantiation of utility class, 
     * no i dont know what this means either but it was in the example code so i put it here
     */
    private BoardFoot() {
    }

    /**
     * Calculates the required length for 
     * 1 board foot based on the given width and height.
     *
     * @param width  the width in inches
     * @param height the height in inches
     * @return the required length in inches
     */
    public static double calculateBoardFoot(final double width, 
            final double height) {
        /* Calculate the required length for 1 board foot */
        return BOARD_FOOT_VOLUME / (width * height);
    }

    /**
     * Main entry point for user interaction and output.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // try catch block to handle invalid input when parsing double values
        try {
            /* Get user input for width and height */
            System.out.print("Enter your Width: ");
            final double width = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter your Height: ");
            final double height = Double.parseDouble(scanner.nextLine());

            if (width <= 0 || height <= 0) {
                /* If width or height is not positive, display an error message */
                System.out.println("Enter a positive number for width and height!");
            } else {
                final double length = calculateBoardFoot(width, height);
                // Display the calculated length formatted to two decimal places
                System.out.printf("The length should be %.2f inches "
                    + "to make 1 board foot.%n", length);
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid number
            System.out.println("Error: Invalid input. "
                    + "Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
