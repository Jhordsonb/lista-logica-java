import java.util.Scanner;

public class Calculadora {

            public static void main(String[] args) {
                Scanner scaner = new Scanner(System.in);

                System.out.println("Digite o primeiro número: ");
                double num1 = scaner.nextDouble();

                System.out.println("Digite o segundo número: ");
                double num2 = scaner.nextDouble();

                System.out.println("Digite a operação (+, -, *, /): ");
                char operacao = scaner.next().charAt(0);

                double resultado = 0;

                switch (operacao) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Erro: não pode dividir por zero!");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Operação inválida!");
                        return;
                }

                System.out.println("Resultado: " + resultado);
                scaner.close();
            }
    }

