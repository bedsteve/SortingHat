import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String final_anwser = "";
        String name = "";
        System.out.println("Welcome to Hogwart! Let the Sorting Hat choose your house.");
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Answer the following question 'yes' or 'no':");
        String answer = "";
        System.out.println("Do you value bravery and chivalry?");
        answer = scan.nextLine().toLowerCase();
        if (answer.equals("yes")){
            final_anwser = "Gryffindor";

        } else {
            System.out.println("Do you value hard work, dedication, and loyalty?");
            answer = scan.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                final_anwser = "Hufflepuff";

            } else {
                System.out.println("Do you value intelligence, creativity, and learning?");
                answer = scan.nextLine().toLowerCase();
                if (answer.equals("yes")) {

                    final_anwser = "Ravenclaw";

                } else {

                    final_anwser = "Slytherin";
                }

            }
        }
        System.out.println("Dear " + name);
        System.out.println("You belong to " + final_anwser + "!");

    }
}