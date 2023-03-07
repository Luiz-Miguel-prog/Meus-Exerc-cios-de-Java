/*******************************************************************************
* 30) Faça um programa para imprimir uma tabuada.
*******************************************************************************/
package exercícios30.tabuada;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios30Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    double numero;
    System.out.print("Digite um número: ");
    numero = entrada.nextDouble();
    System.out.println();

    for(int x=0; x <= 10;x++){

        System.out.printf("%f x %d = %g\n",numero,x,numero*x);
    }


  }
}