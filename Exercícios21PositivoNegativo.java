/*******************************************************************************
* 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
* indicando se este número é positivo ou negativo. Pare a execução do programa
* quando o usuário requisitar.
*******************************************************************************/
package exercícios21.positivo.negativo;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios21PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int numero;

      	System.out.print("Verificador de numeros positivos ou negativos\n\n");

    		do {
          System.out.print("Digite um número, digite 0 para sair: ");
          numero = entrada.nextInt();
          if(numero>0){
            System.out.print("O número é positivo\n");
          }else if(numero < 0){
            System.out.print("O número é negativo\n");
          }
        }while(numero != 0);
	}
}
