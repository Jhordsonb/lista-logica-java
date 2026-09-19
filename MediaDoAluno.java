import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Digite uma nota:" );
        double nota01 = Double.parseDouble(scaner.nextLine());

        System.out.println("Digite outra nota:" );
        double nota02 = Double.parseDouble(scaner.nextLine());


        double notaFinal = (nota01 + nota02) / 2;

        if (notaFinal >=8 ){
            System.out.println("Aprovado");
        } else if (notaFinal >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Sua Média final é: " + notaFinal);
        scaner.close();
    }
}
