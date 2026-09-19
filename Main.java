import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?  ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua altura?  ");
        String altura = scanner.nextLine();

        System.out.println("Seu nome é " + nome + "e você mede " + altura);
        scanner.close();
    }
}