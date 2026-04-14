import java.util.Scanner;

public class anobisestu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" digite o anu pra sabe se é bi 6xto: ");
        int anus = sc.nextInt();
        System.out.println(" anu adicionado: " + anus);

        if ((anus % 4 == 0 && anus % 100 !=0)&& anus % 400 == 0){
            System.out.println(anus + " é bisextu");
        }
        else {
            System.out.println(anus+ "nao é bixa sesto");
        }



}
}
