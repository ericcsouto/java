import java.util.Scanner;
public class calculadoraifelse {
  public static void main(String[]args){
    int operador1, num1, num2, result;
    
    Scanner operador = new Scanner(System.in);

    System.out.println("Insira o número referente a operação desejada:");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    operador1 = operador.nextInt();

    Scanner valores = new Scanner(System.in);

    System.out.println("Insira o primeiro valor:");
    num1 = valores.nextInt();

    System.out.println("Insira o segundo valor:");
    num2 = valores.nextInt();

    if (operador1 == 1){
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);}
        else if (operador1 == 2){
          result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);}
  
        else if  (operador1 == 3){
          result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);}
  
        else if  (operador1 == 4){
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);}
        
        else {
          System.out.println("Operação inválida!");}

      } 
  }

