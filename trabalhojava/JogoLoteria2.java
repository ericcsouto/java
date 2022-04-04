import java.util.Scanner;

public class JogoLoteria2 {
    static int[] gerador() {
        int[] resultado = new int[6];
        for (int i = 0; i < 6; i++) {
            int sorteado;
            sorteado = (int)(Math.random()*60)+1;
            resultado[i] = sorteado;
        }
        return resultado;
    }
    static int comparar(int[] sorteio, int[] aposta) {
        int acertos = 0;
        for (int i = 0; i < 6; i++) {
            int result = aposta[i];
            if (existente(sorteio, result)) {
                acertos++;
            }
        }
        return acertos;
    }
    static boolean existente(int[] numeros, int n) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] sorteio = gerador();
        int[] aposta = new int[6];
        System.out.println("\nBem vindo a loteria!\n\nInsira seis dezenas de 1 a 60");
        for (int i = 0; i < 6; i++) {
            int input;
		    System.out.print("Dezena "+(i+1)+": ");
            input = teclado.nextInt();
                if (input < 1 || input > 60) {
                    System.out.println("Atenção! Insira somente dezenas entre 1 e 60!!");
                    return;
                }
            aposta[i] = input;
        }
	    System.out.println("\nAposta: ");
        for (int i = 0; i < aposta.length; i++) {
            System.out.print(aposta[i] + " ");
        }
        System.out.println("\n\nResultado: ");
        for (int i = 0; i < sorteio.length; i++) {
            System.out.print(sorteio[i] + " ");
        }
        int acertos = comparar(sorteio, aposta);
        switch (acertos) {
            case 4: System.out.println("Você acertou quatro dezenas!\nPremio: R$250.000,00 "); break;
            case 5: System.out.println("Você acertou cinco dezenas!\nPremio: R$250.000,00 "); break;
            case 6: System.out.println("Você acertou todas as seis dezenas!\nPremio: R$1.000.000,00 "); break;
            default: System.out.println("\n\nVocê perdeu :(\n"); break;
        }
    }
}