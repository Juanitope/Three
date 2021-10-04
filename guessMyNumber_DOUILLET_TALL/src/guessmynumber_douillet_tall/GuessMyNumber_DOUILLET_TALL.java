package guessmynumber_douillet_tall;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author douil
 */
public class GuessMyNumber_DOUILLET_TALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choissisez uen difficulté : Facile,Normal,Difficile");
        String difficulte=sc.next();
        
        
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        //System.out.println(n);
        
        
        int nombre;
        System.out.println("Entre un nombre entre 0 et 100");
        nombre = sc.nextInt();
        int essais= 1;
        if (nombre == n) {
            System.out.println("Vous avez trouvez le bon numéro");
        }

        if (nombre != n) {
            while (nombre != n) {
                
                if (nombre > n) {
                    System.out.println("Plus petit");
                    nombre = sc.nextInt();
                    essais= essais +1;
                }
                if (nombre < n) {
                    System.out.println("Plus grand");
                    nombre = sc.nextInt();
                    essais= essais +1;
                }
                if (nombre == n) {
                    System.out.println("Vous avez trouvez le bon numéro");
                }
            }
        }
        System.out.println("Vous avez mis "+essais+" essais");
    }
}