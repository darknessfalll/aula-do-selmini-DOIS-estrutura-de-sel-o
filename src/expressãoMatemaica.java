import java.util.Scanner;

public class expressãoMatemaica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" De um número para X: ");


        double x = teclado.nextDouble();
        double y;
        if( x <= 5)
        System.out.println(" Atribua outro valor. Divisão por 0");

        else{
            y=(8/(Math.sqrt(Math.pow(x, 2)-25)));
            System.out.println(" O valor da expressão é:"+ y);
        }
    }
}
