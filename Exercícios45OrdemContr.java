/*******************************************************************************
* 45) Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
* foi realizada a leitura.
*******************************************************************************/

package exercícios45.ordemcontr;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios45OrdemContr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
		int quantidade;
		
		System.out.print("Digite a quantidade de números: ");
		quantidade = entrada.nextInt();
		
		int[] Numeros = new int[quantidade];
		
		for(int x=0;x<quantidade;x++){
			System.out.print("Digite o "+(x+1)+"° Número: ");
			Numeros[x]= entrada.nextInt();
		}
		System.out.print("\nA ordem contrária é:\n");
		for(int y=quantidade-1;y>=0;y--){
			System.out.println(Numeros[y]);
		}

	}
}