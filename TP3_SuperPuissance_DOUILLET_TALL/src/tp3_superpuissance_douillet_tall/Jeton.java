/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_superpuissance_douillet_tall;

/**
 *
 * @author douil
 */
public class Jeton {
    String Couleur;
    
    public Jeton(String couleurJeton){
        Couleur=couleurJeton;
    }
        
    public String lireCouleur() {
        System.out.println("La couleur du jeton est: "+Couleur);
        return Couleur;
    }
}
