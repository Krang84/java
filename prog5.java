import java.util.Scanner;
public class prog5 {

    public static void main(String[] args) {

        // input  notes
        // output moyenne
        Scanner reader = new Scanner(System.in);

        // notes

        System.out.println("Entrez note");

        int n1 = reader.nextInt();
        System.out.println("Entrez note");
        int n2 = reader.nextInt();        
        System.out.println("Entrez note");
        int n3 = reader.nextInt();
        System.out.println("Entrez note");
        int n4 = reader.nextInt();

       // moyenne

       double moyenne = (n1+n2+n3+n4)/4.0;

       System.out.println("La moyenne est " + moyenne);

    }
    
}
