package guessmynumber_douillet_tall;

import java.util.Random;
import java.util.Scanner;


public class GuessMyNumber_DOUILLET_TALL {

    
    public static void main(String[] args) {
        int difficulte;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le numéro de la difficulté choisi : Facile(1),Normal(2),Difficile(3)");
        difficulte=sc.nextInt() ;
        Random generateurAleat = new Random();
        
        
        if (difficulte==1){
            
            n = generateurAleat.nextInt(100);
            System.out.println("Entre un nombre entre 0 et 100");
        } 
        if (difficulte==2){
            
            n = generateurAleat.nextInt(200);
            System.out.println("Entre un nombre entre 0 et 200");
        }    
        if (difficulte==3){
            
            n = generateurAleat.nextInt(300);
            System.out.println("Entre un nombre entre 0 et 300");
        } 
        else {
            n = generateurAleat.nextInt(100);
        }   
        
        
        
        
        int nombre;
        nombre = sc.nextInt();
        int essais= 1;
        if (nombre == n) {
            System.out.println("Vous avez trouvez le bon numéro");
        }

        
        
        
        if (nombre != n) {
            while (nombre != n) {
                
                if (difficulte==3){
                    if (essais>10){
                        System.out.println("Vous avez perdu, trop d'essais...");
                        break;
                    }
                }
                if (difficulte==2){
                    if (essais>20){
                        System.out.println("Vous avez perdu, trop d'essais...");
                        break;
                    }
                }
                
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