
package stats_douillet_tall;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;


public class Stats_DOUILLET_TALL {

    
    public static void main(String[] args) {
     int [] tab = {0,0,0,0,0,0} ;
     tab = new int[6] ; 
      
     Scanner sc = new Scanner(System.in); 
     System.out.println("Entre une valeur :");
     int m=sc.nextInt();
     for (int i=1;i<=m;) {
        Random generateurAleat = new Random();
        int nombre = generateurAleat.nextInt(5);
        tab[nombre] += 1 ; 
        }
     
     //Affichage
     //Affichage en pourcentage
     for (int u=0;u<=5;){
         System.out.println("Il y eu"+tab[u]+ " fois le chiffre"+(u+1));
     }
           
    }

    //private static Scanner newScanner(InputStream in) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

