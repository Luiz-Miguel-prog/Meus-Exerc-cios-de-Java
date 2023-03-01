/*******************************************************************************
* 23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada
* uma delas:
*		1 – Adição
*		2 – Subtração
*		3 – Multiplicação
*		4 – Divisão
*******************************************************************************/
package exercícios23.calculadora;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios23Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
        double PrimeiroNumero,SegundoNumero,Resultado;
		int Menu;
      	System.out.print("Menu Calculadora\n\n"); 
		
		
		System.out.print("Digite uma das operações a seguir:\n\t1 - Adição\n\t2 - Subtração\n\t3 - Multiplicação\n\t4 - Divisão\n");
		Menu = entrada.nextInt();
		
		
		System.out.print("Digite o primeiro número: ");
		PrimeiroNumero = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		SegundoNumero = entrada.nextDouble();
		
		
		switch(Menu){
			case 1:
				Resultado = PrimeiroNumero + SegundoNumero;
				System.out.printf("%f + %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 2:
				Resultado = PrimeiroNumero - SegundoNumero;
				System.out.printf("%f - %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 3:
				Resultado = PrimeiroNumero * SegundoNumero;
				System.out.printf("%f * %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 4:
				Resultado = PrimeiroNumero / SegundoNumero;
				System.out.printf("%f / %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			default:
				System.out.print("Opção inválida!");
		}
		
		
	}
	
}