/*******************************************************************************
* 42) Faça um programa que determine o maior e o menor entre N números lidos.
* A condição de parada é a entrada de um valor 0, ou seja, o programa deve ficar
* executando até que a entrada seja igual a 0 (ZERO).
*******************************************************************************/
package exercícios42.maioremenor;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios42MaiorEMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
		int numero,maior,menor;

		System.out.print("Digite um número: ");
		numero = entrada.nextInt();
		menor = numero;
		maior = numero;

		do{
			System.out.print("Digite outro número: ");
			numero = entrada.nextInt();

			if(numero>maior) maior = numero;
			if(numero<menor&&numero!=0) menor = numero;

		}while(numero != 0);

		System.out.println("\nO menor número é "+menor+" e o maior número é "+maior+".");

	}
}
