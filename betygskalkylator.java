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

       
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

       
        int grade;
        if (score >= 90 && score <= 100) {
            grade = 5; 
        } else if (score >= 80 && score <= 89) {
            grade = 4; 
        } else if (score >= 70 && score <= 79) {
            grade = 3;
        } else {
            grade = 2; 
        }

       
        System.out.println("Your numeric grade is: " + grade);
        
        scanner.close();
    }
}
