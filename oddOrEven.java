

/**
 *
 * @author ceder
 */
public class oddOrEven {
/*Skapa ett Java-program var ni Deklarera en Int variabel var programmet
kommer sedan att avgöra om talet är udda eller jämnt med if-else. 
Programmet ska skriva ut om siffran är udda eller jämn
*/
    //uppgift 4
    public static void main(String args[]) {
        //example 1
        int number1 = 174;
    
    if (number1 % 2 == 0) {
      System.out.println(number1 + " is even.");
    } else {
      System.out.println(number1 + " is odd.");
        }
    
    //example 2
    int number2 = 1283;
    
    if (number2 % 2 == 0) {
      System.out.println(number2 + " is even.");
    } else {
      System.out.println(number2 + " is odd.");
    
    }
    }
}
