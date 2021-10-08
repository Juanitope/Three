/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_douillet_tall;

/**
 *
 * @author douil
 */
public class TP2_Bieres_DOUILLET_TALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BouteilleBiere Biere1 = new BouteilleBiere("Cuvéee des trolls ", (float) 7.0, "Dubuisson") ;
       /*Biere1.Nom = "Cuvée des trolls";
       Biere1.degreAlcool = (float)7.0 ;
       Biere1.brasserie = "Dubuisson";*/
       Biere1.ouverte = false ; 
       Biere1.lireEtiquette();
       
       BouteilleBiere Biere2 = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe") ;
       /*Biere2.Nom = "Leffe";
       Biere2.degreAlcool = (float)6.6 ;
       Biere2.brasserie = "Abbaye de Leffe";*/
       Biere2.lireEtiquette();
       
       BouteilleBiere Biere3 = new BouteilleBiere("Pelfort", (float) 7.6, "Fort de Pelfort") ;
       Biere3.lireEtiquette();
       BouteilleBiere Biere4 = new BouteilleBiere("Ikki", (float) 4.5, "Japan") ;
       Biere4.lireEtiquette();
       BouteilleBiere Biere5 = new BouteilleBiere("Saitama", (float) 100, "Ville Z") ;
       Biere5.lireEtiquette();
    }
    
}
