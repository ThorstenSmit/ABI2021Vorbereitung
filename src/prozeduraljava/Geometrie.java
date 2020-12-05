package prozeduraljava;

public class Geometrie {

    public static double berechneDiagonaleRect(double a, double b) {
        return Math.sqrt(   //Wurzel aus...
                Math.pow(a, 2) //a²
                        + 
                Math.pow(b, 2) //b²
        );
    }

}
