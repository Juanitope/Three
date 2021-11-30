/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_superpuissance_douillet_tall;

/**
 *
 * @author douil
 */
public class Joueur {
    String Nom;
    String Couleur;
    int nombreJetonRestant;
    Jeton listeJetons[] = new Jeton[21];
    int nombreDesintegrateurs;
    
    public Joueur() {
        Nom=null;
        Couleur=null;
        nombreJetonRestant=0;
       
    }
    
    public Joueur(String nom){
        Nom=nom;
       
    }
    public void affectcouleur(String couleurJeton){
        Couleur=couleurJeton;
            }
                     
    public boolean ajouterjeton(Jeton unJeton){
        if (nombreJetonRestant>=21) {
            return false;
        }
        else {
        listeJetons[nombreJetonRestant++]=unJeton;
        return true;
        }
    }
    
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs = nombreDesintegrateurs + 1;
        }
    public boolean utiliserDesintegrateur() {
        if(nombreDesintegrateurs==0){
            return false;
        }
        else {
            nombreDesintegrateurs = nombreDesintegrateurs - 1;
            return true;
        }
    }
 

}
