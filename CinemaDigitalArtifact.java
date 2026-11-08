//import packages
import java.util.Scanner; /* import scanner to read user input */

public class CinemaDigitalArtifact {
    //create object scanner to be read by all methods in the class
    static Scanner scanner = new Scanner(System.in); /* scanner must be static to be accessed by all methods */

    //main method to run the cinema digital artifact program
    public static void main(String[] args) {
        //call the cinemaMenu method to display the menu and handle user input
        cinemaMenu();
    }

    //method to display the cinema menu
    public static void cinemaMenu() {
        int choice = 0; /* variable to store user's menu choice */
        boolean runningMenu = true; /* boolean variable to control the menu loop */
        while (runningMenu) { /* loop to keep the menu running until the user chooses to exit */
            //menu options
            System.out.println("Welcome to the Cinema Digital Artifact!");
            System.out.println("Let's get started... \nPlease select an option from the menu below:");
            System.out.println("1. View available movies");
            System.out.println("2. Book a ticket");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            choice = scanner.nextInt();

            //validation check to ensure the user selects a valid option between 1 and 4
            if (choice < 1 || choice > 4) {
                System.out.println(choice + " is an invalid choice. Please select a valid option (1-4).");
                continue; /* sends program back to the top of the loop */
            }
            else{
                runningMenu = false; /* loop ends if user selects a valid option */
            }

            //switch statement to handle the user's menu choice
            switch (choice) {
                case 1:
                    viewAvailableMovies(); /* calls method to view available movies */
                    break;
                case 2:
                    bookTicket(); /* calls method to book a ticket */
                    break;
                case 3:
                    cancelBooking(); /* calls method to cancel a booking */
                    break;
                case 4:
                    System.out.println("Thank you for using the Cinema Digital Artifact. Goodbye!");
                    runningMenu = false; /* loop ends */
                    break;
            }
        }
    }

    //method to view available movies
    public static void viewAvailableMovies() {
        System.out.println("You have selected to view available movies. \nWould you like to continue? (yes/no)"); /* gives user option to go back to menu or continue */
    }

    //method to book a ticket
    public static void bookTicket() {
        System.out.println("You have selected to book a ticket. \nWould you like to continue? (yes/no)"); /* gives user option to go back to menu or continue */
    }

    //method to cancel a booking
    public static void cancelBooking() {
        System.out.println("You have selected to cancel a booking. \nWould you like to continue? (yes/no)"); /* gives user option to go back to menu or continue */
    }
}
