import java.util.Scanner;

public class fatorial {

    public static void leitura(String[]args) {
        System.out.println("Calcule o fatorial de um número!");
        Scanner n = new Scanner(System.in);
        System.out.println("Insira o número que deseja calcular:");
        int numero = n.nextInt();
    }


        public static void main(String[]args){  
            int i,fatorial=1;  
            int numero;//It is the number to calculate factorial    
            for(i=1;i<=numero;i++){    
                fatorial=fatorial*i;    
            }    
            System.out.println("Factorial of "+numero+" is: "+fatorial);    
           }  
           n.close();
}  
          







  













 /*        if (numero > 0){
            return (numero * validar(numero - 1));
        }
        else if (numero == 0){
            System.out.println("O fatorial é 1");
        }
        else{
            System.out.println("Atenção! Insira um número positivo para calcular o fatorial.");
        }
    }
}
 
 public class calculeFatorial{
        public static void main(String[] args) {
          int fatorial = 1;
      
          for (int i = 1;i < 11 ; i ++ ) {
            fatorial *= i;
      
            System.out.println("Fatorial de " +i+"=" +fatorial);
          }
        }
      }

  public static void main(String[]args ) {
      int numero = 6;
      
      System.out.println( "Calcule o fatorial de um número");
      System.out.println( "Digite o número que gostaria de calcular o fatorial:");
      System.out.println( "O fatorial do número " + numero + " é " + factorial( numero ) );      
   }
 
   public static int factorial( int numero ) {
      int fact = 1;
      for( int i = 1; i <= numero; i++ ) {
         fact *= i;
      }
 
      return fact;
 
}


if(numero < 0)
        {
            Integer.parseInt(JOptionPane.showMessageDialog(null, "Manê, não há fatorial de números negativos"));
        }    
            else
            {
                while(n > 1)
                {
                    fat *= n;
                    n--;
                }
            JOptionPane.showMessageDialog(null, "Resposta" + fat);
            }
    } */