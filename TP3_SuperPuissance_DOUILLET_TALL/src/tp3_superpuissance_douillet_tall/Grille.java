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
    
    public boolean ajouterJetonDansColonne(Jeton,int){
        
    }
    public boolean etreRemplie(){
        
    }
    public void viderGrille(){
        
    }    
    public void afficherGrilleSurConsole() {
        
    }    
    public boolean celluleOccupee(int,int){
        
    }
    public String lireCouleurDuJeton(int,int){
    
    }
    public boolean etreGagnantePourJoueur(Joueur){
        
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
