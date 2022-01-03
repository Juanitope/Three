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
    int score;
    Grille GrilledeJeu;
    
    public void DeroulementPartie(){
        CréationGrille();
        for (int z = 0; z<6 ; z++){
        NewCarte();
        }
        Scanner scanner = new Scanner(System.in);
        //Random des lignes colonnes
        Random random = new Random();
        int colonne= random.nextInt(4);
        int ligne = random.nextInt(4);
        
       
        do {
            //Affichage
            System.out.print("Quelle direction souhaitez vous prendre ? (4/5/6/8");
            choix=scanner.nextInt();
            switch(choix){
                case 4: //GAUCHE
                    
                case 5: //BAS
                    
                case 6: // DROITE
                    
                case 8: // HAUT
            }
            
            
            
        }while (!partieFini());
       
    






//Mouvements effectué par le joueur (haut bas gauche droite)
    //----> +1 dans le mouvement en question dans la Grille
    
    //Check si deux nombres sont égaux cote a cote + l'un est bloqué par un des murs ou collé a une carte qui bouge pas
    //---> Si oui il s'assemblent (différents de 2 et 1
    
    //Check si 2+1 se fusionnent soit = 3 
    
    
    //Puis a chaqye mouvement :
    //----> Apparation d'une nouvelle carte aléatoire entre 1 2 sur les bords de la grille sans présence de carte
    //---> Soit i=3 ou j=3
    
    
    
    
    }

    private void NewCarte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CréationGrille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean partieFini() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}