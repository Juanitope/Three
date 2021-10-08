/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_douillet_tall;

/**
 *
 * @author douil
 */
public class BouteilleBiere {
    //Attributs
    String Nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    //Méthodes 
    public void lireEtiquette() {
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;

    }
}
