import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atribua nota1:");
        double nota1 = teclado.nextDouble();
        System.out.println(" Atribua nota2:");
        double nota2 = teclado.nextDouble();
        System.out.println(" Atibua nota3:");
        double nota3 = teclado.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        if (media<6){
            System.out.println(" Reprovado :l, malou "+ media);}
        else{
            System.out.println(" Aprovadooooooooooooooooooooo, tu tiro: "+ media);}






    }

}
