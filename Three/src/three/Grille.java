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
    int GrilledeJeu[][]= new int[5][5];
    int carte;
   
    
    
    public void CréationGrille(){
        for (int i=0; i<5 ; i++){
            for (int j=0; j<5 ;j++){
                GrilledeJeu[i][j]=0;
            }
        }
    }
    
    public void NewCarte(){
        Random random = new Random();
        carte = random.nextInt(3)+1; // à vérifier si c'est entre 1 et 3
        
    }
            
          
    
    
    
           public boolean partieFini(){
               
                

                
           //Si la partie est finie (soit la fonction retourne true)
           //Soit impossible de jouer :
           // ----> Calcul du score final , en fonction des cartes présentes
           return true;
           
       }         
            

    
}
