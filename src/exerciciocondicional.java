public class exerciciocondicional {
    public static void main(String args[]) {
        //não ((5 <> 10/2) ou V e 2 - 5 > 5 - 2 ou V)
        //pot (2,4) <> 4+2 ou 2+3 *5/3 mod 5<0
        boolean resultado = !((5 !=10/2) || true && 2-5 > 5 -2 || true);
        boolean resultado2 = Math.pow(2,4) !=4+2 || 2 + 3 * 5 / 3 % 5 < 0;

        System.out.println(resultado);
        System.out.println(resultado2);


    }   
}

