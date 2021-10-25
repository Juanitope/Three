/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_douillet_tall;

/**
 *
 * @author douil
 */
public class Personne {
    String nom;
    String prenom;
    
    public Personne(String Unnom, String Unprenom){
        nom=Unnom;
        prenom=Unprenom;
        
    }
    @Override
    public String toString() { 
      String chaine;
      chaine= nom + prenom;
      return chaine;
        }
}
