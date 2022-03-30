import java.util.Scanner;

public class calculadora {
    public static void main(String[]args) {
        System.out.println("Calculadora");
        Scanner valores = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int num1 = valores.nextInt();
        System.out.println("Insira o segundo valor:");
        int num2 = valores.nextInt();
        valores.close();
        soma(num1, num2);
        subtracao(num1, num2);
        multiplicacao(num1, num2);
        divisao(num1, num2);
    }

    public static int soma(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("Resultado soma: " + resultado);
    }

    public static int subtracao(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("Resultado subtração: " + resultado);
    }

    public static int multiplicacao(int num1, int num2) {
        int resultado = num1 * num2;
        System.out.println("Resultado multiplicação: " + resultado);
    }

    public static int divisao(int num1, int num2) {
        int resultado = num1 / num2;
        System.out.println("Resultado divisão: " + resultado);
    }
}
