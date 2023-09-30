// comparativo entre valores booleanos || && e !
import java.util.Scanner;
public class operadorlogico 
{
   
    public static void main(String[] args) throws Exception {
        
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro boolean:");
            Boolean b1 = sc.nextBoolean();
        System.out.println("digite o segundo boolean:");
            Boolean b2 = sc.nextBoolean();
             
                System.out.println("E " + (b1||b2));
                System.out.println("ou " + (b1&&b2));
                System.out.println("nao b1 " +(!b1));
                System.out.println("nao b2 " +(!b2));
            
               

    }
}
