/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_superpuissance_douillet_tall;

/**
 *
 * @author douil
 */
public class Grille {
    Cellule CellulesduJeu[][] = new Cellule[6][7];       
   
    public Grille(){
        //Initialisation de la grille 6*7 : 
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                CellulesduJeu[i][j]=new Cellule();
            }
        }
    }

    
    public boolean ajouterJetonDansColonne(Jeton joueur,int colonne){ 
        //Colonne remplie ?
        for (int i=0 ; i<6 ; i++){
        if (CellulesduJeu[i][colonne]==null){
            CellulesduJeu[i][colonne].jetonCourant=joueur;
            return true;
            }
        }
        return false;
        }
    
    
    public boolean etreRemplie(){ // Renvoi true si la grille est remplie
        for (int i=0; i<6 ; i++) {
            if (CellulesduJeu[i][]==){
                
                return false;
                }
            }
        return true;   
    }
    
    
    
    public void viderGrille(){ //vide la grille
         for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                CellulesduJeu[i][j].jetonCourant = null;
            }
         }
    }    
    public void afficherGrilleSurConsole() { // Affichage avec couleurs + trou noirs
          for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if (CellulesduJeu[i][j].jetonCourant == null){
                    System.out.print(" ");
                }
                else {
                    System.out.print(CellulesduJeu[i][j].jetonCourant);
                }
            }
          }
    }    
    public boolean celluleOccupee(int i ,int j){ //retourne vrai si la cellule est occupé
        if (CellulesduJeu[i][j].jetonCourant == null) {
            return false;
        }
        else {
            return true;
        }
    }
    public String lireCouleurDuJeton(int i ,int j ){ // renvoi la couleur
        return CellulesduJeu[i][j].jetonCourant.lireCouleur();
    }
    
    public boolean etreGagnantePourJoueur(Joueur){ // renvoi vrai si un joueur à aligner 4 pions d'une même couleur (diago/horizentale/verticale)
        
        
    }
   /* public void tasserGrille(int){   
    }
    public boolean colonneRemplie(int) {       
    }
    public boolean placerDesintegrateur(int,int){
    }
    public boolean placerTrouNoir(int,int) {
    }
    public boolean supprimerJeton(int,int){
    }

*/
}
