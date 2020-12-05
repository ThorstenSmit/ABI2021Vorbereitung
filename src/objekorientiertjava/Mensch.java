package objekorientiertjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Merke: In nativ angelegter OOP wird sehr selten mit dem Zusatz "static"
 * gearbeitet, da die meisten Fähigkeiten nicht statisch sonder Zustandsabhängig
 * sind
 */
public class Mensch {

    /**
     * Identität, Merkmale Sichtbarkeitsmodifikator=private keine setterMethode,
     * nur getterMethode Wert wird im Konstruktor gesetzt
     */
    private String geburtsdatum;

    /**
     * Zustand, Merkmale Sichtbarkeitsmodifikator=private Wertmanipulation über
     * setterMethode Wertabfrage über getterMethode
     */
    private String haarfarbe;

    /**
     * Konstruktor, kann nur einmal mit Hilfe des new-Operators aufgerufen
     * werden
     *
     * @param geburtsdatum
     */
    public Mensch(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getHaarfarbe() {
        return haarfarbe;
    }

    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    /**
     * Diese Fähigkeit ist von Alter abhängig Wir nehmen an, dass man ab dem 80.
     * Lebensjahr nicht mehr gut läuft...
     */
    public void laufen() {
        LocalDate birthday = LocalDate.parse(this.geburtsdatum);
        LocalDate now = LocalDate.now();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(this.geburtsdatum));
        int d2 = Integer.parseInt(formatter.format(now));
        int age = (d2 - d1) / 10000;
        if(age >= 80){
            System.out.println("Das Laufen wird langsamer.");
        }else{
            System.out.println("Das Laufen ist normal.");
        }
    }

}
