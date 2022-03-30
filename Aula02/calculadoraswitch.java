import java.util.Scanner;
public class calculadoraswitch {
    public static void main(String[]args){
        System.out.println("Digite o número da operação que deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração:");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        Scanner input = new Scanner(System.in);
    
        int operador = input.nextInt();
    
        Scanner valores = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        int num1 = valores.nextInt();
    
        System.out.println("Insira o segundo valor:");
        int num2 = valores.nextInt();
    
        System.out.println("Resultado:" + operacao(operador, num1, num2));
    }
    public static float operacao(int operador, int num1, int num2){
        float result = 0;
        switch (operador) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / (float) num2;
                break;
    }
    return result;
}
}
