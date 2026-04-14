import java.util.Scanner;

public class treangolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" escreva valor do lado do triangulo");
        double lado1 = sc.nextDouble();
        System.out.println(" valor atribuido foi: "+ lado1);

        System.out.println(" escreva valor do lado do triangulo");
        double lado2 = sc.nextDouble();
        System.out.println(" valor atribuido foi: "+ lado2);

        System.out.println(" escreva valor do lado do triangulo");
        double lado3 = sc.nextDouble();
        System.out.println(" valor atribuido foi:" + lado3);

        if ( lado1 <= lado2 + lado3 && lado2 <= lado1 + lado3 && lado3 <= lado1 + lado2){
            System.out.println(" Isso É TREANGOLO");

        }
        else{
            System.out.println(" SE dano erro");
        }





    }
}
