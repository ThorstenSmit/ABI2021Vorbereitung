//Arbeitsbereich | package | namespace
//eKUUGDHXIAELS
package abi2020ifvorbereitung;

//Erweiterung des Arbeitsbereichs um weitere packages|namespaces
import grundlagenjava.*;
import objekorientiertjava.Mensch;
import prozeduraljava.*;

public class ABI2020IFVorbereitung {

    /**
     * WICHTIG: 1 x main() pro Projekt PFLICHT
     *
     * @param args : Übergabeparameter
     */
    public static void main(String[] args) {

        /**
         * Strukturierte Programmierung
         */
        double zahl1 = 5.45;
        double zahl2 = 6.789;

        while (zahl1 > 0) {
            zahl1 = zahl1 - 0.9;
            if (zahl1 < 1.0) {
                zahl1 += 0.1;    //Kurzdeklaration von zahl1 = zahl1 + 0.1; 
            }
            System.out.println(zahl1);
        }

        //import, da nicht im selben package/namespace
        int unterrichtszeitHeute = Grundlagen.MAX_TIME_TODAY;

        //Beispiel: Nutzung von Konstanten als Array-Zugriff
        String ausgabeIntWert = Integer.toString(unterrichtszeitHeute);
        System.out.println("Minuten Unterricht heute : " + unterrichtszeitHeute + "min");

        //Beispiel: typeCast - implizit ::: KEINE VERLUST!!
        int ganzzahl = 3;
        double decZahl = ganzzahl;
        //Beispiel: typeCast - explizit ::: VERLUST!!
        //float floatZahl = decZahl; 
        //http://java.tsmit.de/explizite_typwandlung.html
        //http://java.tsmit.de/datentypen.html
        float floatZahl = (float) decZahl;
        System.out.println("Typecasted Value: " + floatZahl);
        
        /**
         * Arrays | Folgen | Container
         * MERKE:
         * In Java dürfen Arrays nur Inhalte gleichen Typs enthalten.
         * Hierbei gilt instanceOf
         */
        
        //ZWEI DEKLARATIONEN FÜHREN ZUM GLEICHEN ERGEBNIS
        
        //Deklaration 1:
        int[] intArrDekl1 = new int[3];
        intArrDekl1[0]=98;
        intArrDekl1[1]=99;
        intArrDekl1[2]=100;
        
        //Deklaration
        int[] intArrDekl2 = { 98, 99, 100 };
        
        //ACHTUNG: Esgibt ein "Copy-Problem"
        int[] intNeu = intArrDekl2;
        
        intNeu[1] = 5;
        
        System.out.println("Index 1 aus intNeu: "+intNeu[1]);
        System.out.println("Index 1 aus intArrDekl2: "+intArrDekl2[1]);
        //Es werden also nur die Adressen zu den physikalischen Werten kopiert!
        
        //"Echte" Array Kopie
        int[] intCopy = intArrDekl1.clone();
        intCopy[1] = 5;
        System.out.println("Index 1 aus intCopy: "+intCopy[1]);
        System.out.println("Index 1 aus intArrDekl1: "+intArrDekl1[1]);
        //Hier werden zwei separate Arrays angelegt!
        

        /**
         * Prozedurale Programmierung Merkmal: instanzungebunden Fähigkeiten
         * werden Funktionen genannt Stichwort: static im Funktionskopf Aufruf:
         * <KlassenName>.<staticFunktion>()
         */
        //Einstieg: Hello World
        HelloWorld.getHelloWorld();

        //Mischung Konstanten und Funktionsaufruf
        double kaufBetrag = 9.87;
        double bruttoKaufBetrag = Warenwirtschaft.berechneBrutto(kaufBetrag, Warenwirtschaft.MWST_REGELSATZ_REDUZIERT);
        System.out.println("Kaufbetrag: " + kaufBetrag + System.lineSeparator() + "Bruttokaufbetrag: " + bruttoKaufBetrag);

        //Nutzung von Java.lang in Prozedur z.B. Math.pow
        double kantenLaengeA = 5.67;
        double kantenLaengeB = 3.25;
        double diagRect = Geometrie.berechneDiagonaleRect(kantenLaengeA, kantenLaengeB);
        System.out.println("Diagonale: " + diagRect);
        
        
        
        
        /**
         * Objektorientierte Programmierung
         */
        //Wir bilden eine Instanz | Objekt aus der Vorlage | Klasse | Bauanleitung | Blaupause "Mensch"
        
        Mensch menschInstanz = new Mensch("2012-07-12");
        menschInstanz.laufen();
        
        
        
    }

}
