/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_douillet_tall;

/**
 *
 * @author douil
 */
public class TP2_manip_DOUILLET_TALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        //Une nouvelle assiette de tartiflette a été crée , elle est réferé par la tartiflettre 2
        assiette1.nbCalories += 1000;
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        int inverseur = assiette1.nbCalories;
        assiette1.nbCalories=assiette2.nbCalories;
        assiette2.nbCalories=inverseur;
        System.out.println("Après inversion :");
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        //Impossible de réferer deux objets qui n'ont aucun rapport
        
        Moussaka a;
        Moussaka[] tab = new Moussaka [10];
        for(int i=0; i<=10; i++){
            a = new Moussaka(400);
            tab[i]=a;
            }
                 
    }
}
