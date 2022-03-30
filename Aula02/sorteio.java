import java.util.Random;

public class sorteio {
    //atributos, propriedades, variaveis globais

    //funcoes, procedimentos

    //rotina principal
    public static void main(String[]args) {
        Random gerador = new Random();
        int contador = 1;
        int soma = 0;
        int maiorvalor = 0; //ou 1
        int menorvalor = 0; //ou 100
        while (contador <= 1000){
        
        int numero = 1 + gerador.nextInt(100);
        System.out.println(numero);
        
        soma += numero; //soma = soma + numero

        if (numero > maiorvalor){
            maiorvalor = numero;
        }
        if (numero < menorvalor){
            menorvalor = numero;
        }
        contador++;
    }
    System.out.println("O contador contou: " + contador);
    System.out.println("A soma dos números foi: " + soma);
    System.out.println("O maior valor foi: " + maiorvalor);
    System.out.println("O menor valor foi: " + menorvalor);
}
}
    //para sortear do 0 ao valor final
    //int n = 1 + gerador.nextInt(bound); para sortear do 1 ao valor final