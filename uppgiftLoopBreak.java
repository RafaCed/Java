
/*
Skriv en for-Loop som skriver ut siffrorna från 1 till 30.
Ändra Loopen så att den slutar skriva när siffran 11 nås. Använd break satsen för att sluta loopen när detta villkor är uppfyllt.
När Loopen är slut, skriv ut ett meddelande som säger "Loop terminated early due to break statement.
*/
public class uppgiftLoopBreak {

    
    public static void main(String args[]) {
        
        for (int i = 1; i <= 30; i++) {

            System.out.println(i);
            if (i == 11) {
                break;

    }
  }
        System.out.println("Loop terminated early due to break statement");

    }

}
        
  

