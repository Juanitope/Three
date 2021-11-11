/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_douillet_tall;

/**
 *
 * @author douil
 */
public class TP2_relation_1_DOUILLET_TALL {

   
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures [0] = uneClio;
        bob.liste_voitures [1] = uneMicra;
        reno.liste_voitures [0] = une2008;
        reno.liste_voitures [1] = uneAutreClio;
        bob.nbVoitures = 2;
        reno.nbVoitures = 2;
        uneMicra.Proprio = bob;
        uneClio.Proprio = bob;
        une2008.Proprio = reno;
        uneAutreClio.Proprio = reno;
        
        System.out.println("les "+ bob.nbVoitures + " voiture de bob sont une "+ bob.liste_voitures[0] +" et une "+ bob.liste_voitures[1]);
        System.out.println("les "+ reno.nbVoitures + " voiture de reno sont une "+ reno.liste_voitures[0] +" et une "+ reno.liste_voitures[1]);
    }
    
}
