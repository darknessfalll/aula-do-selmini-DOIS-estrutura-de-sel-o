import java.util.Scanner;

public class exec1 {
    public static void main(String[] args) {
        Scanner tclado = new Scanner(System.in);
        System.out.println(" Quanto cusou a compra?: ");
        double compra = tclado.nextDouble();
        if(compra>1000){
            System.out.println(" Voce recebeu 15% de desconto! ");
        double desconto = compra*0.85;
        System.out.println(" valor otal foi: "+ desconto);}
        else{
            System.out.println(" Voce recebeu 8% de desconto! ");
            double desconto = compra*0.92;
            System.out.println(" valor total foi: "+ desconto);
        }

    }
}
