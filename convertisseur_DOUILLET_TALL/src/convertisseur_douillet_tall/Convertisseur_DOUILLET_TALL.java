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
        double tempC;
        double tempK;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer temp C :");
        tempC=sc.nextFloat();
        tempC = CelciusVersKelvin (tempC);
        System.out.println("\n temp en celcius est: "+ tempC);       
        tempK = (tempC+273);
        double tempKa = CelciusVersKelvin ( tempC);     
        System.out.println( "\n temp en kalvin est: "+ tempK);        
        System.out.println( "\n temp en kalvin est: "+ tempKa);
        
        
        
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


