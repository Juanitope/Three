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
    
    public void DeroulementPartie(){
//        CréationGrille();
        for (int z = 0; z<6 ; z++){
        GrilledeJeu.NewCarte();
        }
        Scanner scanner = new Scanner(System.in);
        
        
       
        do {
            //Affichage
            GrilledeJeu.afficherlagrillesurconsole();
            System.out.print("Quelle direction souhaitez vous prendre ? (4/5/6/8) : ");
            choix=scanner.nextInt();
            
            //Faire la vérif sic'est le bon choix
            
            GrilledeJeu.Addition(choix);
            GrilledeJeu.NewCarte();
            
        }while (!GrilledeJeu.partieFini());
    
    System.out.println("Zut vous êtes bloqué , vous avez perdu ! ");
    //Calcul du score 
    score = CalculScore(score);
    if (score<=100){
    System.out.println("Pas oufouf votre score est de : "+score);
    }
    else{
    System.out.println("Wow votre score est de : "+score);
    }
        
        
    }
    
    
   /*    private void NewCarte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    private void CréationGrille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean partieFini() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int CalculScore(int score) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 /*   private void Addition(int choix) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}

        
        