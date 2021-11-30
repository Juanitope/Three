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


    public boolean ajouterJetonDansColonne(Jeton J,int colonne){ 
        //Colonne remplie ?
        for (int i=0 ; i<6 ; i++){
        if (CellulesduJeu[i][colonne].jetonCourant==null){
            CellulesduJeu[i][colonne].jetonCourant=J;
            return true;
            }
        }
        return false;
        }
    
    
   public boolean etreRemplie(){ 
        for (int colonne=0; colonne<7 ; colonne++) {
            if (colonneRemplie(colonne)==false){
                
                return false;
                }
            }
            return true;   
    }
    public boolean colonneRemplie(int colonne){
        for (int i=0; i<6 ; i++) {
            if (CellulesduJeu[i][colonne].jetonCourant==null){;
                
                return false;
                }
            }
        return true;   
    }
    
    
    public void viderGrille(){ //vide la grille
         for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                CellulesduJeu[i][j].jetonCourant = null;
                CellulesduJeu[i][j].trouNoir = false;
                CellulesduJeu[i][j].desintegrateur = false;
            }
         }
    } 
        public void afficherGrilleSurConsole() { // Affichage avec couleurs + trou noirs
          for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if (CellulesduJeu[i][j].jetonCourant == null){
                    System.out.print("□");
                }
                else if (CellulesduJeu[i][j].trouNoir==true){
                    System.out.print("T");
                }
                else if (CellulesduJeu[i][j].desintegrateur==true) {
                    System.out.print("D");
                
                
                }else {
                    String CouleurDuJeton = lireCouleurDuJeton(i,j);
                    if(CouleurDuJeton=="Rouge"){
                        System.out.print("R");
                    }
                    else {
                        System.out.print("J");
                    }
                }
                System.out.print(" ");
            }
            System.out.println(" ");
          }
    }     
    public boolean celluleOccupee(int i ,int j){ 
        if (CellulesduJeu[i][j].jetonCourant == null) {
            return false;
        }
        else {
            return true;
        }
    }
    public String lireCouleurDuJeton(int i ,int j ){ // renvoi la couleur
        String laCouleur = CellulesduJeu[i][j].jetonCourant.lireCouleur();
        return laCouleur;
    }
    
    public boolean etreGagnantePourJoueur(Joueur joueur){ // renvoi vrai si un joueur à aligner 4 pions d'une même couleur ( 2 diago/horizentale/verticale)
        for (int i=0; i < 6; i++){
            for (int j=0 ; j<4 ; j++) {
                if(joueur.Couleur.equals(CellulesduJeu[i][j].lireCouleurDuJeton())
                     &&     joueur.Couleur.equals(CellulesduJeu[i][j+1].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i][j+2].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i][j+3].lireCouleurDuJeton())){
                            return true;
                     }
                }
            }
        for (int i=0 ; i<3 ; i++) {
            for (int j=0; j < 7; j++){
                if(joueur.Couleur.equals(CellulesduJeu[i][j].lireCouleurDuJeton())
                     &&     joueur.Couleur.equals(CellulesduJeu[i+1][j].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i+2][j].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i+3][j].lireCouleurDuJeton())){
                            return true;
                     }
                }
            }
        for (int i=0; i < 3; i++){
            for (int j=0 ; j<4 ; j++) {
                if(joueur.Couleur.equals(CellulesduJeu[i][j].lireCouleurDuJeton())
                     &&     joueur.Couleur.equals(CellulesduJeu[i+1][j+1].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i+2][j+2].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i+3][j+3].lireCouleurDuJeton())){
                            return true;
                     }
                }
            }
        for (int i=3; i < 6; i++){
            for (int j=0 ; j<4 ; j++) {
                if(joueur.Couleur.equals(CellulesduJeu[i][j].lireCouleurDuJeton())
                     &&     joueur.Couleur.equals(CellulesduJeu[i-1][j+1].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i-2][j+2].lireCouleurDuJeton())
                     &&   joueur.Couleur.equals(CellulesduJeu[i-3][j+3].lireCouleurDuJeton())){
                            return true;
                     }
                }
            }
        return false;
        }
        
     public void tasserGrille(){
        for (int colonne = 0; colonne < 7; colonne++) {
            for (int i = 0; i < 6; i++) {
                if (i == 5) {
                    CellulesduJeu[i][colonne].jetonCourant = null;
                }else if (CellulesduJeu[i][colonne].jetonCourant  == null){
                    CellulesduJeu[i][colonne].jetonCourant = CellulesduJeu[i + 1][colonne].jetonCourant;
                    CellulesduJeu[i + 1][colonne].jetonCourant=null;
                    }        
            }
        }       
    }    
   
        public boolean placerDesintegrateur(int i, int j) {
        if (CellulesduJeu[i][j].desintegrateur!=true) {
            CellulesduJeu[i][j].desintegrateur = true;
            return true;
        }
        return false;
    }
    public boolean placerTrouNoir(int i, int j) {
        if (CellulesduJeu[i][j].trouNoir!=true) {
            CellulesduJeu[i][j].trouNoir= true;
            return true;
        }
        return false;
    }
    public boolean supprimerJeton(int i, int j) {
        if (CellulesduJeu[i][j].jetonCourant == null) {
            return false;
        }
        else{
        CellulesduJeu[i][j].jetonCourant = null;
        return true;
        }
    }
       
        


}