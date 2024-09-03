import java.util.Scanner;

public class betygskalkylator {
/*Mål: Målet med denna uppgift är att öva på att använda if-else-påståenden
genom att utveckla en enkel betygskalkylator som kategoriserar en elevs prestation
baserat på deras poäng.

Skapa ett Java-program var ni Deklarera en Int variabel som är en elevs poäng
och bestämm deras betyg baserat på följande kriterier:

    Grade 5: 90 - 100
    Grade 4: 80 - 89
    Grade 3: 70 - 79
    Grade 2: 60 - 69
    Grade 1: 25 - 59
    Grade 0: 0 – 25

Programmet ska sedan skriva ut vitsordet och ett kort meddelande.
*/
    //uppgift 5
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the score
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Determine the numeric grade based on the score
        int grade;
        if (score >= 90 && score <= 100) {
            grade = 5; // Grade A corresponds to 5
        } else if (score >= 80 && score <= 89) {
            grade = 4; // Grade B corresponds to 4
        } else if (score >= 70 && score <= 79) {
            grade = 3; // Grade C corresponds to 3
        } else {
            grade = 2; // Grade D or below corresponds to 2
        }

        // Output the result
        System.out.println("Your numeric grade is: " + grade);
        
        scanner.close();
    }
}