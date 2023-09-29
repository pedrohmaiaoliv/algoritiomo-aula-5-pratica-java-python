// Calcule a área do Losangulo (base*altura)/2
import java.util.Scanner;

public class baselosangulo {
    public static void main(String[] args) throws Exception {
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o valor da base:");
        double base = sc.nextDouble();
        System.out.println("digite o valor da altura:");
        double altura = sc.nextDouble();
        
        double area = (base*altura)/2;
        
        System.out.println("o valor da área é:" + area);
        

    }
}