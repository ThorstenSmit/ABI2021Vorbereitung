package objekorientiertjava;

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
    private boolean verletzt = false;

    /**
     * Konstruktor, kann nur einmal mit Hilfe des new-Operators aufgerufen
     * werden
     *
     * @param geburtsdatum
     */
    public Mensch(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public boolean isVerletzt() {
        return verletzt;
    }

    public void setVerletzt(boolean verletzt) {
        this.verletzt = verletzt;
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
     * Diese Fähigkeit ist von verletzt abhängig.
     */
    public void laufen() {
        if(this.verletzt){
            System.out.println("Das Laufen wird langsamer.");
        }else{
            System.out.println("Das Laufen ist normal.");
        }
    }

}
