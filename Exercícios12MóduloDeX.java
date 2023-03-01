/*******************************************************************************
* 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
*   O módulo de um número x é:
*   x se x é maior ou igual a zero
*   x * (-1) se x é menor que zero
*******************************************************************************/
package exercícios12.módulodex;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios12MóduloDeX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int Numero,ModuloNumero;

      	System.out.print("Módulo de Número\n\n"); //Finalmente...


      	System.out.print("Digite um número inteiro:  ");
      	Numero = entrada.nextInt();


      	ModuloNumero = (Numero < 0)? ModuloNumero = Numero*(-1):Numero;

        System.out.print("O módulo do número é "+ModuloNumero+"\n");

    }

}
