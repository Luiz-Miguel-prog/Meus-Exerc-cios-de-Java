/*******************************************************************************
* 17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o
* valor fornecido está na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da
* faixa, apresentar a mensagem “valor válido”. Caso contrário, apresentar a mensagem “valor
*  inválido”.
*******************************************************************************/
package exercícios17.valornafaixa;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios17ValorNaFaixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        int Numero;

      	System.out.print("Verificador de número\n\n");


        System.out.print("Digite o primeiro número:  ");
        Numero = entrada.nextInt();



        if(Numero >= 0 && Numero <= 9){
          System.out.println("Valor válido.");
        }else{
          System.out.println("Valor inválido.");
        }

    }

}
