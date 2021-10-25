/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_douillet_tall;
import java.util.Scanner;
/**
 *
 * @author douil
 */
public class TP2_convertisseurObjet_DOUILLET_TALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp;
        double temps;
        int choix;
        temps=0;
        String text1="";
        String text2="";
        Scanner sc = new Scanner(System.in);
        choix=9;
        Convertisseur tem= new Convertisseur ();        
        while (choix!=0){
            System.out.println("\n Saisissez la conversion que vous souhaiter effectuer :"+"\n 1) De Celcius vers Kelvin "+"\n 2) De Kelvin vers Celcius "+"\n 3) De  Farenheit vers Celcius "+"\n 4) De Celcius vers Farenheit"+"\n 5) De Kelvin vers Farenheit"+"\n 6) De Farenheit vers Kelvin"+"\n 0) Arrêter le programme" );       
            choix=sc.nextInt();
            
            if (choix==0){
                System.out.println(tem.toString()); 
                
                break;
            }    
            System.out.println("\n Bonjour, saisissse une valeur :");
            temp=sc.nextFloat();
            
            switch (choix){
                
                case 1 :

                    temps=tem.CelciusVersKelvin(temp);
                    text1="Celcius";
                    text2="Kelvin";
                    break;
                case 2 :
                    temps=tem.KelvinVersCelcius(temp);
                    text1="Kelvin";
                    text2="Celcius";
                    break;
                case 3 :
                    temps= tem.FarenheitVersCelcius(temp);
                    text1="Farenheit";
                    text2="Celcius";
                    break;
                case 4 :
                    temps= tem.CelciusVersFarenheit(temp);
                    text1="Celcius";
                    text2="Farenheit";  
                    break;
                case 5 :
                    temps=tem.KelvinVersFarenheit(temp);
                    text1="Kelvin";
                    text2="Farenheit";    
                    break;
                case 6 :

                    temps=tem.FarenheitVersKelvin(temp);
                    text1="Farenheit";
                    text2="Kelvin";    
                    break;
                case 0:
                    break;


            }
            
            System.out.println("\n"+temp+" degrés "+text1+" est égal à "+temps+" degrés "+text2);  
            
        }    
        
        //fini
        
    }
    }
    

