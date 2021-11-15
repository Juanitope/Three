/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_superpuissance_douillet_tall;

/**
 *
 * @author douil
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
        public Cellule(){
              //constructeur initialisant les 
              //attributs avec des valeurs par défaut
              jetonCourant= null;
              trouNoir = false;
              desintegrateur=false;
        }
        
        public boolean affecterJeton(Jeton unJeton) {
            
            if (unJeton == null) {
               jetonCourant = unJeton;
                return true;      
            } 
            else {
                return false;
            }
        }
      /* public Jeton recupererJeton() {
           
           return leJeton;
       }  
       public boolean supprimerJeton() {
           
       }
       public boolean placerTrouNoir() {
           
       }
       public boolean placerDeesintegrateurs() {
           
       }
       public boolean presenceTrouNoir() {
           
       }   
       public boolean presenceDesintegrateur() {
           
       }
       public String lireCouleurDuJeton() {
           
       }
       public boolean recupererDesintegrateur() {
           
       }
       public boolean activerTrouNoir() {
           
       } */
}