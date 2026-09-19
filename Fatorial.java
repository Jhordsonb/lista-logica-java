import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Digite um número:" );
        int numero = scaner.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial*i;
        }
        System.out.println("Fatorial de " + numero + " é " + fatorial);
    }
}
