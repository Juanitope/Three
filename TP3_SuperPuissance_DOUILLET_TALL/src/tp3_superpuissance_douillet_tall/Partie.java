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
        int[] choixcol ={0,1,2,3,4,5};
        int aleacol;
        int[] choixlin ={0,1,2,3,4,5,7};
        int alealin;
        int i = 0;
        while (i < 2) {

            aleacol = choixcol[(int) (Math.random() * choixcol.length)];    //tirer aleatoirement un entier
            alealin = choixlin[(int) (Math.random() * choixlin.length)];
            if ((grilledeJeu.CellulesduJeu[aleacol][alealin].trouNoir == true) && (grilledeJeu.CellulesduJeu[aleacol][alealin].presenceDesintegrateur() == false)) {
                grilledeJeu.placerDesintegrateur(aleacol, alealin);
                i += 1;
            }

        }
        int j = 0;

        while (j < 3) {

            aleacol = choixcol[(int) (Math.random() * choixcol.length)];    //tirer aleatoirement un entier
            alealin = choixlin[(int) (Math.random() * choixlin.length)];
            if ((grilledeJeu.CellulesduJeu[aleacol][alealin].trouNoir == false) && (grilledeJeu.CellulesduJeu[aleacol][alealin].presenceDesintegrateur() == false)) {
                grilledeJeu.placerDesintegrateur(aleacol, alealin);
                j += 1;
            }
        }
        
        
    }
    public void debuterPartie(){
       Scanner sc = new Scanner(System.in) ;
       System.out.println("TIME TO SHINE !");
       String choix = "0";
       while (grilledeJeu.etreGagnantePourJoueur(joueurCourant)!=true && grilledeJeu.etreRemplie()!=true){
           while (!"1".equals(choix) && !"2".equals(choix) && !"3".equals(choix)){
           System.out.println("Choix 1 : Placer votre jeton");
           System.out.println("Choix 2 : Retirer un de vos jetons");
           System.out.println("Choix 3 : Positionner un désintegrateur sur les jetons adverses");
           choix = sc.next();
           if (choix!="1" && choix !="2" && choix!="3"){
               System.out.println("C'est ni 1 ni 2 ni 3, recommencez...");
           }
            }
           
           switch(choix) {
               case "1":
                   System.out.println("Dans quelle colonne souhaitez vous placez votre jeton");
                   
                   int colonne = sc.nextInt();
                   while (colonne>7 || colonne<=0 || grilledeJeu.colonneRemplie(colonne)==true){
                       System.out.println("La colonne est rempli ! (ou vous n'avez pas tapé une colonne inexistante...)");
                       colonne = sc.nextInt();
                   }
                
                   
                   
                   
                   
                   
               case "2":

                  System.out.println("Saissisez les coordonnées du jeton : Ligne [0,5] puis colonne [0,6]") ;
                  int lignevoulu = sc.nextInt();
                  int colonnevoulu = sc.nextInt();
                  //verif si la cellule est occupé
                  
                  //Si oui recuperer le jeton
                  
               case "3":
                   //placer désintegrateur
                   //Joueur courant possède désintegrateur ?
                   System.out.println("Saissisez les coordonnées du jeton quje vous souhaitez désintégrer : Ligne [0,5] puis colonne [0,6]") ;
                  int lignedesin = sc.nextInt();
                  int colonnedesin = sc.nextInt();
                  //Check si c'est occupé
           }
           
       }
     //Chagement de role à chaque tour
       if (joueurCourant == ListeJoueurs[0]){
           joueurCourant = ListeJoueurs[1];
       }
       if (joueurCourant == ListeJoueurs[1]){
           joueurCourant = ListeJoueurs[0];
       }
       
         //Affichage des résultats
    if (grilledeJeu.etreGagnantePourJoueur(ListeJoueurs[0])==true) {
       System.out.println("Le joueur gagnant est : "+ListeJoueurs[0].Nom); 
    }
    if (grilledeJeu.etreGagnantePourJoueur(ListeJoueurs[1])==true) {
       System.out.println("Le joueur gagnant est : "+ListeJoueurs[1].Nom); 
    }
    else {
        System.out.println("Personne n'a gagné...");
    }
    }

    
    
}
