package prozeduraljava;

public class Warenwirtschaft {
    
    //Klassenkonstanten: Beispiel Indizee
    public static final int MWST_BEFREIT = 0/*%*/;
    public static final int MWST_REDUZIERT = 1/*%*/;
    public static final int MWST_ERMAESSIGT = 2/*%*/;
    public static final int MWST_REGELSATZ_REDUZIERT = 3/*%*/;
    public static final int MWST_REGELSATZ = 4/*%*/;
    
    //Beispiel Array
    public static final int[] steuersaetze = {0,5,7,16,19};
    
    
    
    public static double berechneBrutto(double betrag, int steuerSatz){
        
        double bruttobetrag = betrag * ( 1 + Warenwirtschaft.steuersaetze[steuerSatz]);
        return bruttobetrag;
                
    }
    
    
}
