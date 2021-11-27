/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_superpuissance_douillet_tall;
import java.util.Scanner;
/**
 *
 * @author douil
 */
public class TP3_SuperPuissance_DOUILLET_TALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("YOU ARE PLAYING SUPERPUISSANCE 4");

        System.out.println("Entrez pseudo J1");
        String J1 = sc.next();
        Joueur Joueur0 = new Joueur(J1);
        System.out.println("Entrez pseudo J2");
        String J2 = sc.next();
        Joueur Joueur1 = new Joueur(J2);   
        
        System.out.println("  GRILLE");
        Partie LaPuissance = new Partie(Joueur0,Joueur1);
        LaPuissance.attribuerCouleursAuxJoueurs();
        LaPuissance.intialiserPartie();
        LaPuissance.debuterPartie();
    }
    
}
