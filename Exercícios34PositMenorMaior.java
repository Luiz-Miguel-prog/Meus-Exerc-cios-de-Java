/*******************************************************************************
* 34) Escreva um programa que leia um conjunto de números positivos e exiba o
* menor e o maior. Suporemos que o número de elementos deste conjunto não é
* conhecido, e que um número negativo será utilizado para sinalizar o fim dos
* dados.
*******************************************************************************/
//Obs: Nesse exercício seria um ótimo lugar para se colocar listas ligadas
package exercícios34.posit.menor.maior;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios34PositMenorMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
		int numeroAtual,maior,menor;
		boolean primeiro=true;

		System.out.print("Digite um número (negativo para sair): ");
		numeroAtual = entrada.nextInt();

		if(numeroAtual>=0){
			menor = numeroAtual;
			maior = numeroAtual;
			while(numeroAtual>=0){
				System.out.print("Digite outro número: ");
				numeroAtual = entrada.nextInt();
					if(numeroAtual > maior){
						maior = numeroAtual;
					}
					if(numeroAtual < menor && numeroAtual >= 0){
						menor = numeroAtual;
					}
			}
			System.out.println("\nO maior número foi "+maior+" e o menor foi "+menor);
		}


	}
}
