import java.util.Scanner;

public class parimpar {
    
    public static String verificar(int numero){
        if (numero % 2 == 0){
            return "Par";
        }
        else{
            return "Ímpar";
        }
    }
    

    public static void main(String[]args) {
        System.out.println("Par ou Impar?");
        Scanner n = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Insira um número:");
            numero = n.nextInt();
            System.out.println("O número é " + verificar(numero));
        } while (numero >= 0);
        n.close();

    }
}
