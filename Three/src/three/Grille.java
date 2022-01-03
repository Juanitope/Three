/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three;
import java.util.Random;
/**
 *
 * @author douil
 */
public class Grille {
    int GrilledeJeu[][]= new int[4][4];
    int carte;
   
    
    
    public void CréationGrille(){
        for (int i=0; i<4 ; i++){
            for (int j=0; j<4 ;j++){
                GrilledeJeu[i][j]=0;
            }
        }
    }
    
    public void Affichage(){
        
    }
    
    public void NewCarte(){
        Random random = new Random();
        carte = random.nextInt(3)+1; // à vérifier si c'est entre 1 et 3
        int colonne= random.nextInt(4);
        int ligne = random.nextInt(4);
        while (GrilledeJeu[colonne][ligne]!=0){
            colonne= random.nextInt(4);
            ligne = random.nextInt(4);
        }
        if (GrilledeJeu[colonne][ligne]==0){
            GrilledeJeu[colonne][ligne]=carte;
        }
            }
            
          
    public void Addition(){
        
    }
    
    
   public boolean partieFini(){
                //Vérif que la grille est remplie
               for (int i=0; i<4 ; i++){
                    for (int j=0; j<4 ;j++){
                        if (GrilledeJeu[i][j]==0){
                            return false;   
                         }
                }
               }
               
             for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    //Vérif de soit deux cases identiques ou une carte 1 et 2 collés
                    if ((GrilledeJeu[i][j]==GrilledeJeu[i+1][j] || GrilledeJeu[i][j]==GrilledeJeu[i][j+1]) ||
                        ((GrilledeJeu[i][j]==1 && GrilledeJeu[i+1][j]==2) || (GrilledeJeu[i][j]==2 && GrilledeJeu[i+1][j]==1)
                               || (GrilledeJeu[i][j]==1 && GrilledeJeu[i][j+1]==2) || (GrilledeJeu[i][j]==2 && GrilledeJeu[i][j+1]==1))){
                        return false;
                    }
               
                    }
             }         
           //Si la partie est finie (soit la fonction retourne true)
           //Soit impossible de jouer :
           // ----> Calcul du score final , en fonction des cartes présentes
           return true;
           
       }    
   public int CalculScore(int score){
   for (int i=0; i<4 ; i++){
            for (int j=0; j<4 ;j++){
                if (GrilledeJeu[i][j]!=1 && GrilledeJeu[i][j]!=2){
                score += GrilledeJeu[i][j] ;
                }
                
            }
            }
    return score;
    }
   


}
            

    

