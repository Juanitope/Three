/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_superpuissance_douillet_tall;
import java.util.Scanner;
/**
 *
 * @author douil
 */
public class Partie {
    Joueur[] ListeJoueurs= new Joueur[2];
    Joueur joueurCourant;
    Grille grilledeJeu;
    
    public Partie(Joueur Joueur0,Joueur Joueur1){
       ListeJoueurs[0] = Joueur0;
       ListeJoueurs[1] = Joueur1;
    }
    public void attribuerCouleursAuxJoueurs(){
       int [] variablepossible = {0,1};
       int random;
       random = variablepossible [(int) (Math.random()* variablepossible.length)];
       if (random==0){
       ListeJoueurs[0].Couleur = "Rouge";
       ListeJoueurs[1].Couleur = "Jaune";
       }
       else {
           ListeJoueurs[1].Couleur = "Rouge";
           ListeJoueurs[0].Couleur = "Jaune";
       }
    }
    public void intialiserPartie(){ // Création de la grille et des jetons + Initialisation des paramètres joueurs
      // attribuerCouleursAuxJoueurs();
        grilledeJeu= new Grille();
        
        //donner les jetons aux joueur 

        for (int i = 0; i < 21; i++){
            Jeton Jaune = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterjeton(Jaune);
            Jeton Rouge = new Jeton(ListeJoueurs[1].Couleur);
            ListeJoueurs[1].ajouterjeton(Rouge);

        }
        grilledeJeu.afficherGrilleSurConsole();

        //Joueur commencant aléatoire
        int[] choice ={0,1};
        int aleatoire;
        aleatoire = choice[(int) (Math.random() * choice.length)];
        if (aleatoire==0){
            joueurCourant = ListeJoueurs[0];
        }else{
            joueurCourant = ListeJoueurs[1];
        }
        
        //Placer les trou noirs et désintegrateurs
    }
    public void debuterPartie(){
       System.out.println("TIME TO SHINE !");
       
       
       
       
       
       
    }
}
