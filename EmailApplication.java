/**
 * gives methods to run the email application and methods to assist them.
 *
 * @version (Version 1)
 * @author (Logan Yeubanks)
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;


public class EmailApplication {
    private ArrayList<Email> emailList;
    private final String[] stringArray = {"A", "B", "C", "D", "E", "F", "G", "H","I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "v", "W", "X", "Y", "Z"};

    public EmailApplication() {
        emailList = new ArrayList<>();
    }


    public void runEmailApplication() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will allow you to generate a new email, or show information on an existing email.");

        boolean running = true;
        while (running) {


            int initialMenu = printInitialMenu(userInput);

            //switch case that performs logic based on initialMenu (answer of initial menu)
            switch (initialMenu) {
                //case in which user wants to generate a new email.
                case 1:
                    System.out.println("Ur gay");
                    createNewEmail(userInput);
                break;

                //case in which user wants to show info about a existing email or change a element of a email.
                case 2:
                    System.out.println("FUCK YEA BRA");
                break;

                default:
                    System.out.println("Something went wrong, please try again.");
            }

            //asks user if they would like to run the program again or quit it.
            int askAgain = useAppAgain(userInput);
            if(askAgain == 1) {
                System.out.println("Okay taking you back to the main menu. ");
            }
            else {
                running = false;
            }


            //Quits the program
        }
    }


    /**
     * Prints the initial menu of the program and returns the option the user wants for the path of the program.
     *
     * @param userInput
     * @return 1 or 2
     */
    public int printInitialMenu(Scanner userInput) {
        boolean validResponse = false;

        while(!validResponse) {
            try {
                System.out.println("Press 1 to generate a new email ");
                System.out.println("Press 2 to show info on a existing email or change elements of the email ");

                int menuAnswer = userInput.nextInt();
                if(menuAnswer == 1 || menuAnswer == 2) {
                    return menuAnswer;
                }
                else {
                    System.out.println("The only valid choices are 1 or 2, please try again. ");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("The only valid choices are 1 or 2, please try again. ");
                userInput.next();
            }

        }
        return 0;
    }

    /**
     * Asks the user if they would like to execute the program again. Returns 1 or 2 with 1 being used to continue using the program and 2 being used to set running to false.
     *
     * @param userInput
     * @return 1 or 2
     */
    public int useAppAgain(Scanner userInput) {
         boolean validResponse = false;
         while(!validResponse) {
             try {
                 System.out.println("Press 1 to use the application again, otherwise press 2 to quit. ");

                 int againAnswer = userInput.nextInt();
                 if (againAnswer == 1 || againAnswer == 2) {
                     return againAnswer;
                 }
                 else {
                     System.out.println("The only valid choices are 1 or 2, please try again. ");
                 }
             }
             catch (InputMismatchException e) {
                 System.out.println("The only valid choices are 1 or 2, please try again. ");
                 userInput.next();
             }
         }
         return 0;
    }

    /**
     * method that generates a random password of the string type.
     *
     * @param stringArray
     * @return password
     */
    public String randomPassword(String[] stringArray) {
        final int GENERATED_PASSWORD_LENGTH = 8;
        Random rand = new Random();
        String password = ("");
        for(int i = 0; i < GENERATED_PASSWORD_LENGTH; i++) {
            password += stringArray[rand.nextInt(26)];
        }
        return password;
    }

    /**
     * code that is run in case 1 of runEmailApplication. Gets all information from user and creates new email based on their input.
     *
     * @param userInput
     */
    public void createNewEmail(Scanner userInput) {
        System.out.println("What is your first name? ");
        String firstNameAnswer = userInput.next();

        System.out.println("What is your last name? ");
        String lastNameAnswer = userInput.next();

        System.out.println("What department do you belong to? ");
        String departmentAnswer = userInput.next();

        boolean lookingForValidAnswer = true;
        int mailBoxCapacityAnswer = 0;
        while(lookingForValidAnswer) {
            try {
                System.out.println("What would you like your mailbox capacity to be? ");
                mailBoxCapacityAnswer = userInput.nextInt();
                lookingForValidAnswer = false;
            }
            catch (InputMismatchException e) {
                System.out.println("You must enter a number. Please try again.");
                userInput.nextLine();
            }

        }

        System.out.println("What would you like your alternate email to be? ");
        String alternateEmailAnswer = userInput.next();

        String generatedPassword = randomPassword(stringArray);

        String newCreatedEmailAddress = firstNameAnswer + "." + lastNameAnswer + "@" + departmentAnswer +".com";

        System.out.println("Your new email is " + newCreatedEmailAddress);
        System.out.println("Your randomly generated password is " + generatedPassword);


        Email newCreatedEmail = new Email(firstNameAnswer, lastNameAnswer, departmentAnswer, mailBoxCapacityAnswer, alternateEmailAnswer, generatedPassword, newCreatedEmailAddress);
        emailList.add(newCreatedEmail);
    }
//a || b == !(!a && !b)
//a && b = !(!a || !b)

}

