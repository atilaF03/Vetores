import java.util.Scanner;

public class Vetores2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];
    int maior = numeros[0];

    System.out.println(" digite 10 numero inteiros");
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("digite o numero" + (i++) + ": ");
    }

   for (int i <0; i< numeros.length; i++){
    if (numeros[i]>  maior) 
    {
    maior = numeros[i];
    }
   }
System.out.println("o maior valor é" + maior);
   

      sc.close();
    }
}
