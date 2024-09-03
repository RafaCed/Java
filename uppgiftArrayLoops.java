
/**
 Mål: Lär dig hur du deklarerar, initierar och utför grundläggande funktioner men en Array i Java.

Skapa en Array med värden 10, 20, 30, 40, o 50.

    Till först vill ni skriva ut hela arrayn så den printar ut alla siffror.
    Till följande skriv ut de första och sista siffran i arrayen.
    Sedan skriv en loop för att beräkna och skriva ut summan av alla siffrorna i arrayen och dela den på 2 och skriv ut den igen på en ny rad.
    BONUS – Skriv en Loop för att hitta och skriva ut det största siffran i arrayen.

 */
public class uppgiftArrayLoops {

   
    public static void main(String args[]) {
       
        int[] Numbers = {10, 20, 30, 40, 50};
              for(int i = 0; i < Numbers.length; i++){
            System.out.println(Numbers[i]);
              }
        System.out.println(Numbers[0]);//First Number ([0])
        System.out.println(Numbers[4]);//Last Number ([4])
    }
}
