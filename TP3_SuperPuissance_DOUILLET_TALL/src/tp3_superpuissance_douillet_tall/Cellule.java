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
            
            if (jetonCourant == null) {
               jetonCourant = unJeton;
                return true;      
            } 
            else {
                return false;
            }
        }
       public Jeton recupererJeton(){
           Jeton jetonenRetour = jetonCourant;
           jetonCourant = null;
           return jetonenRetour;
       }
       public boolean supprimerJeton() {
           if (jetonCourant==null){
               return false;
           }
           else {
           jetonCourant = null;
           return true;
                   }
       }
       
       
       
       public String lireCouleurDuJeton() {
           if (jetonCourant == null){
               return " - ";
           }
           return jetonCourant.Couleur;
       }
       
       
       
       
       
       
       
       public boolean placerTrouNoir() {
           if (trouNoir==false){
               trouNoir=true;
                      return true; 
           }
           else {
               return false;
           }
       }       
       public boolean presenceTrouNoir() {
           if (trouNoir==true){
               return true;
           }
           else {
               return false;
           }
       }
       public boolean activerTrouNoir() {
           if (jetonCourant!=null){
               jetonCourant = null;
               trouNoir=false;
               return true;
           }
           else {
               return false;
           }
       } 
  
       
       
       
       
       
       
       
       public boolean placerDeesintegrateurs() {
           if (desintegrateur==false){
           return false;
           }
           else {
               desintegrateur = true;
               return true;
           }
       }
       
       public boolean presenceDesintegrateur() {
           return desintegrateur;
       }
       public boolean recupererDesintegrateur() {
           if (presenceDesintegrateur()){
               desintegrateur = false;
               return true;
           }
               else {
                       return false;
                       }
         
       }
       
}