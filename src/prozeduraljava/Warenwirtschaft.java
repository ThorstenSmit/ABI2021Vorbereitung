package prozeduraljava;

public class Warenwirtschaft {
    
    //Klassenkonstanten: Beispiel Indizee
    public static final int MWST_BEFREIT = 0/*Index*/;
    public static final int MWST_REDUZIERT = 1/*Index*/;
    public static final int MWST_ERMAESSIGT = 2/*Index*/;
    public static final int MWST_REGELSATZ_REDUZIERT = 3/*Index*/;
    public static final int MWST_REGELSATZ = 4/*Index*/;
    
    //Beispiel Array
    public static final int[] steuersaetze = {0,5,7,16,19};
    
    
    
    public static double berechneBrutto(double betrag, int steuerSatz){
        
        double bruttobetrag = betrag * ( 1 + Warenwirtschaft.steuersaetze[steuerSatz]/100);
        return bruttobetrag;
                
    }
    
    
}
