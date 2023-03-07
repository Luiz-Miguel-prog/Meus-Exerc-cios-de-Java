/*******************************************************************************
* 60) Escreva um programa que retorne o número do quadrante (1,2,3 ou 4) através
* de um método chamado VERIFICA_QUADRANTE, que deve receber um valor para x e um
*	valor para y.
Quadrantes
*         x |
*           |
*     2o    |     1o
*           |
*y ----------------------
*           |
*           |
*     3o    |     4o
*           |
*******************************************************************************/

package exercícios60.quadrante;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios60Quadrante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x,y;
		x=entrada.nextInt();
		y=entrada.nextInt();
		System.out.print(VerificaQuadrante(x,y));


	}
	public static int VerificaQuadrante(int x, int y){
		boolean quadx,quady;
		if(x>=0){
			quadx=true;
		}else{
			quadx=false;
		}
                quady = y>=0;
                
		if(x==0||y==0) return 0;
		else if(quadx&&quady) return 1;
		else if (!quadx&&quady) return 2;
		else if (!quadx&&!quady) return 3;
		else return 4;

	}


}