package abi2020ifvorbereitung;

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
        
        
        
        
    }

}
