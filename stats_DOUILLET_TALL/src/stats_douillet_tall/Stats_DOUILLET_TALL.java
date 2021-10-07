
package stats_douillet_tall;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;


public class Stats_DOUILLET_TALL {

    
    public static void main(String[] args) {
        int [] tab ;
        tab = new int[6] ; 
        double pour;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entre une valeur :");
        int m=sc.nextInt();
        int i=1;
        for (;i<=m;) {
            Random generateurAleat = new Random();
            int nombre = generateurAleat.nextInt(5);
            tab[nombre] += 1 ;
            i +=1;
        }
     
     //Affichage
     //Affichage en pourcentage
        int u=0;
        for (;u<=5;){
            System.out.println("Il y eu "+tab[u]+ " fois le chiffre "+(u+1));
            pour=tab[u]*100/m;
            System.out.println(pour+"%");
            u+=1;
        }
           
    }

    //private static Scanner newScanner(InputStream in) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

