import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
        
        public static void dica(int palpite, int numero, int tentativas){
            if(palpite < 0 || palpite > 100){
                System.out.println("Esse número não vale! Insira um número entre 0 e 100!\n");
            } 
            else if (palpite < numero){
                System.out.println("O número informado é menor que o número sorteado, tente novamente!\n");
            }
            else if (palpite > numero){
                System.out.println("O número informado é maior que o número sorteado, tente novamente!\n");
            } 
            else {
                System.out.println("Você acertou! O número correto era " + numero);
                }
            }
        public static void main(String[]args) {
            int palpite, 
                tentativas = 10;

            Random random = new Random();
            int sorteado = random.nextInt(100) + 1;
            System.out.println("\nJogo de advinhação! Advinhe o número de 0 a 100!!\n");
            System.out.println("Tentativas restantes: 10\n");        
            do{
                Scanner entrada = new Scanner(System.in);
                System.out.print("Seu palpite: ");
                palpite = entrada.nextInt();
                dica(palpite,sorteado,tentativas);
                tentativas--;
                System.out.println("\nVocê tem " + tentativas + " tentativas restantes!\n");
            }
            while (palpite != sorteado && tentativas > 0);
            if (tentativas == 0){
                System.out.println("Suas tentativas acabaram! Você perdeu :(");
            }
        }
    }