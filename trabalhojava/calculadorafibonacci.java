import java.util.Scanner;
public class calculadorafibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Fibonacci f(n)");
        System.out.println("Insira o valor de n:");
        int enesimo = sc.nextInt();
        int n1 = 0, n2 = 1;
        if (enesimo == 0){
            System.out.println("O valor de f(0) = 0");
        }
        else if (enesimo == 1){
            System.out.println("O valor de f(1) = 1");
        }
        else if (enesimo < 0){
            System.out.println("Insira um valor positivo!");
        }
        //como validar se o n é inteiro? mudar tipo primitivo de int para long? e validar aqui no elseif? 
        else if (enesimo % 2 != 0){
            System.out.println("Insira um valor inteiro!");
        } 

        else{
        for (int i = enesimo; i > 0; i--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            sc.close();
        }
        System.out.println("<- este é o n-ésimo termo!");
    }
}
}