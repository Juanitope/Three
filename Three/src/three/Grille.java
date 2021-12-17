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
    int Grille[][]= new int[5][5];
    int carte;
   
    
    
    public void Grille(){
        for (int i=0; i<5 ; i++){
            for (int j=0; j<5 ;j++){
                Grille[i][j]=0;
            }
        }
    }
    public void NewCarte(){
        Random random = new Random();
        carte = random.nextInt(4)+1; // à vérifier si c'est entre 1 et 3
        
    }
            
            
            
       public boolean partieFini(){
    
           //Si impossible de jouer :
           return true;
           
       }
    
}
