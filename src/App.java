// Elabore um algoritimo em java que permita a entrada de 2 valoes x e y, que pege valores x e y, troque seus valores entre si e então exiba os novos  resultados
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor de x:");
        int x = sc.nextInt();
        System.out.println("digite o valor de y:");
        int y = sc.nextInt();

        int t = x;
        x = y;
        y = t;

       
        System.out.println("o valor de x apos a troca com y" + x);
        System.out.println("o valor de y apos a troca com x" + y);

    }
}
