/*******************************************************************************
* 63) Escreva um programa que verifique se um número é par ou ímpar através de
* um método chamado VERIFICA. O método deverá receber um número inteiro (n) e
* deverá retornar a mensagem “PAR” ou “ÍMPAR”.
*******************************************************************************/

package exercícios63.verifpar;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios63VerifPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		System.out.println(Verifica(numero));
	}
	public static String Verifica(int numero){
		if(numero%2==0) return "PAR";
		else return "ÍMPAR";
	}



}