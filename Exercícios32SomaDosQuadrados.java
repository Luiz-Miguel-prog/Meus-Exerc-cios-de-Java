/*******************************************************************************
* 32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros
* números inteiros positivos ímpares a partir do número informado pelo usuário menor que 10
* e maior que zero.
*******************************************************************************/
package exercícios32.somadosquadrados;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios32SomaDosQuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
		int Numero, Resultado=0;
		
		do{
			System.out.print("Digite um número maior que 0 e menor que 10: ");
			Numero = entrada.nextInt();
		}while(Numero<=0||Numero>=10);
		
		for(int x = Numero;x < 40+Numero;x++){
			if(x%2==1){
				Resultado += x*x;
			}
		}
		System.out.println("O resultado da soma dos quadrados dos 20 primeiros números inteiros positivos ímpares a partir do número informado é: "+Resultado);
	
	}
}
