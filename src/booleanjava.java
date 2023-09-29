// insira 2 valores n1 e n2 e compare eles:



import java.util.Scanner;
public class booleanjava {
   
    public static void main(String[] args) throws Exception {
        
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor de n1:");
            int n1 = sc.nextInt();
        System.out.println("digite o valor de n2:");
            int n2 = sc.nextInt();
             
                System.out.println("n1 é maior que n2? " + (n1>n2));
                System.out.println("n1 é maior ou igual a n2? " + (n1>=n2));
                System.out.println("n1 é menor que n2? " + (n1<n2));
                System.out.println("n1 é menor ou igual a n2? " + (n1<=n2));
                System.out.println("n1 é igual a n2? " + (n1==n2));
                System.out.println("n1 é diferente de n2? " + (n1!=n2));

    }
}


