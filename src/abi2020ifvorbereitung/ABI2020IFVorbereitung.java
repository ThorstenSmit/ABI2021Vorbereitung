package abi2020ifvorbereitung;

import grundlagenjava.Grundlagen;
import static grundlagenjava.Grundlagen.*;

public class ABI2020IFVorbereitung {

    public static void main(String[] args) {

        //Strukturierte Programmierung
        double zahl1 = 5.45;
        double zahl2 = 6.789;
        
        while(zahl1 > 0){
            zahl1 = zahl1 - 0.9;
            if(zahl1 < 1.0){
                zahl1 += 0.1;    //Kurzdeklaration von zahl1 = zahl1 + 0.1; 
            }
            System.out.println(zahl1);
        }
        
        //import, da nicht im selben package/namespace
        int unterrichtszeitHeute = MAX_TIME_TODAY;
        
        //Beispiel: Nutzung von Konstanten als Array-Zugriff
        System.out.println("MWST: "+Grundlagen.steuersaetze[Grundlagen.MWST_REDUZIERT_REGEL]+"%");
        
        //Beispiel: typeCast - implizit ::: KEINE VERLUST!!
        int ganzzahl = 3;
        double decZahl = ganzzahl;
        //Beispiel: typeCast - explizit ::: VERLUST!!
        //float floatZahl = decZahl; 
        //http://java.tsmit.de/explizite_typwandlung.html
        //http://java.tsmit.de/datentypen.html
        float floatZahl = (float) decZahl;
        System.out.println("Typecasted Value: "+floatZahl);
    }

}
