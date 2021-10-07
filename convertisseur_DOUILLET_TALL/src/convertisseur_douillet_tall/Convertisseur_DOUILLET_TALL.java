package convertisseur_douillet_tall;
import java.util.Scanner;
/**
 *
 * @author douil
 */
public class Convertisseur_DOUILLET_TALL {

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
        System.out.println("\n Bonjour, saisissse une valeur :");
        temp=sc.nextFloat();
        System.out.println("\n Saisissez la conversion que vous souhaiter effectuer :"+"\n 1) De Celcius vers Kelvin "+"\n 2) De Kelvin vers Celcius "+"\n 3) De  Farenheit vers Celcius "+"\n 4) De Celcius vers Farenheit"+"\n 5) De Kelvin vers Farenheit"+"\n 6) De Farenheit vers Kelvin" );       
        choix=sc.nextInt();
        switch (choix){
            case 1 :
                temps=CelciusVersKelvin(temp);
                text1="Celcius";
                text2="Kelvin";
                break;
            case 2 :
                temps=KelvinVersCelcius(temp);
                text1="Kelvin";
                text2="Celcius";
                break;
            case 3 :
                temps= FarenheitVersCelcius(temp);
                text1="Farenheit";
                text2="Celcius";
                break;
            case 4 :
                temps= CelciusVersFarenheit(temp);
                text1="Celcius";
                text2="Farenheit";  
                break;
            case 5 :
                temps=KelvinVersFarenheit(temp);
                text1="Kelvin";
                text2="Farenheit";    
                break;
            case 6 :
                    
                temps=FarenheitVersKelvin(temp);
                text1="Farenheit";
                text2="Kelvin";    
                break;
        }            
                    
        System.out.println("\n"+temp+" degrés "+text1+" est égal à "+temps+" degrés "+text2);
        //fini
        
        
    
    }
    
    
    
public static double CelciusVersKelvin (double tempCelcius) {
    double tempKalvin=tempCelcius + 273;
    return (float) tempKalvin;
    }

public static double   KelvinVersCelcius(double tempKalvin) {
    double tempCelcius=tempKalvin - 273;
    return (float) tempCelcius;
    }

public static double FarenheitVersCelcius(double tempFaren) {
    double tempCelcius=(tempFaren-32)/1.8;
    return (float) tempCelcius;
    }

public static double  CelciusVersFarenheit(double tempCelcius) {
    double tempFaren=tempCelcius*1.8+32;
    return (float) tempFaren;
    }

public static double  KelvinVersFarenheit(double tempKalvin) {
    double tempCelcius =KelvinVersCelcius( tempKalvin);
    double tempFaren=CelciusVersFarenheit( tempCelcius);
    return (float) tempFaren;
    }

public static double   FarenheitVersKelvin(double tempFaren) {
    
    double tempCelcius= FarenheitVersCelcius(tempFaren);
    double tempKalvin =CelciusVersKelvin(tempCelcius);
    return (float) tempKalvin;
    }






} 


