/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_douillet_tall;

/**
 *
 * @author douil
 */
public class Convertisseur {
    int nbConvertions;

    public Convertisseur(){
        nbConvertions=0;

    }




    public double CelciusVersKelvin (double tempCelcius) {
        nbConvertions++;
        double tempKalvin=tempCelcius + 273;
        return (double) tempKalvin;
    }

    public double   KelvinVersCelcius(double tempKalvin) {
        nbConvertions++;
        double tempCelcius=tempKalvin - 273;
        return (double) tempCelcius;
    }

    public  double FarenheitVersCelcius(double tempFaren) {
        nbConvertions++;
        double tempCelcius=(tempFaren-32)/1.8;
        return (double) tempCelcius;
    }

    public double  CelciusVersFarenheit(double tempCelcius) {
        nbConvertions++;
        double tempFaren=tempCelcius*1.8+32 ;
        return (double) tempFaren;
    }

    public  double  KelvinVersFarenheit(double tempKalvin) {
        nbConvertions--;
        double tempCelcius =KelvinVersCelcius( tempKalvin);
        double tempFaren=CelciusVersFarenheit( tempCelcius);
        return (double) tempFaren;
    }

    public double   FarenheitVersKelvin(double tempFaren) {
        nbConvertions--;
        double tempCelcius= FarenheitVersCelcius(tempFaren);
        double tempKalvin =CelciusVersKelvin(tempCelcius);
        return (double) tempKalvin;





    }
    @Override
    public String toString () {
    return "Le nb de conversions effectuer est "+ nbConvertions;





}
}
