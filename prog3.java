import java.util.Scanner;

public class prog3 {

    public static void main(String[] args) {
        System.out.println("Conversion Degres en Radians");

    Scanner reader = new Scanner(System.in);
    System.out.println("entre valeurs en degres");
    double x = reader.nextDouble();
    double radians = (x /Math.PI) * 3.14;
    System.out.println("Valeur en radians " + radians);
        
    }

    
    

    
}
