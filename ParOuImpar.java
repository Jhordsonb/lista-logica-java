import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Digite um número:" );
        int numero = scaner.nextInt();

        if(numero % 2 == 0){
            System.out.println("Esse número e Par");
        } else {
            System.out.println("Esse número e Impar");
        }
        scaner.close();
    }
}
