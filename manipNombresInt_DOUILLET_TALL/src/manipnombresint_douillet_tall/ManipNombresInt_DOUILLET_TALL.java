package manipnombresint_douillet_tall;
import java.util.Scanner;
/**
 *
 * @author douil
 */
public class ManipNombresInt_DOUILLET_TALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int entier1;
      int entier2; 
      entier1=sc.nextInt();
      entier2=sc.nextInt();
      System.out.println(entier1 + " et " +entier2);
      int somme = entier1 + entier2 ; 
      System.out.println("La somme est "+ somme);
      int diff = entier1 - entier2 ; 
      System.out.println("La différence est "+ diff);
      int produit = entier1 * entier2 ; 
      System.out.println("Le produit est "+ produit);
      int div = entier1/entier2;
      System.out.println("La division euclidienne est "+ div);
      int reste = entier1%entier2;
      System.out.println("Le reste de la division est "+ reste);
      //C bon
    }
    
}
