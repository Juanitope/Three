/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author douil
 */
public class Partie {
    int choix;
    int score=0;
    Grille GrilledeJeu=new Grille();
    
    public int DeroulementPartie(){
//        CréationGrille();
        for (int z = 0; z<6 ; z++){
        GrilledeJeu.NewCarte();
        }
        Scanner scanner = new Scanner(System.in);
        
        
       
        do {
            //Affichage
            GrilledeJeu.afficherlagrillesurconsole();
            System.out.print("Quelle direction souhaitez vous prendre ? (4 GAUCHE/5 BAS /6 DROITE/8 HAUT) : ");
            choix=scanner.nextInt();
            
            //Faire la vérif sic'est le bon choix
            
            GrilledeJeu.Addition(choix);
            GrilledeJeu.NewCarte();
            
        }while (GrilledeJeu.partieFini()!=true);
    
    System.out.println("Pas de chance vous êtes bloqué , vous avez perdu ! ");
    //Calcul du score 
    score = GrilledeJeu.CalculScore(score);
    return score;      
    }
    
}
        
        