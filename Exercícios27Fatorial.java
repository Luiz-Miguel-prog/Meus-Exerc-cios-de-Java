/*******************************************************************************
* 27) Escreva um programa que leia:
*   - a quantidade de números que deverá processar;
*   - os números que deverá processar,e calcule e exiba, para cada número a ser
*     processado o seu fatorial.
* Lembrete: O fatorial de um número N é dado pela fórmula:
*     N! = 1 * 2 * 3 * 4 * 5 * ... * N
*******************************************************************************/
package exercícios27.fatorial;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios27Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
    int quantidade;    
    System.out.print("Digite a quantidade de números: ");
    quantidade = entrada.nextInt();
    
    long[] numeros = new long[quantidade];
    for(int x=0;x < numeros.length;x++){
        System.out.print("Digite um número: ");
        numeros[x]= entrada.nextInt();
    }
    for(int x=0; x < numeros.length;x++){
		long resultado=1;
		for(long y=numeros[x]; y>0;y--){
			resultado = y*resultado;
		}
        System.out.println("O fatorial de "+numeros[x]+" é: "+resultado);
    } /*Para iniciar o inteiro(for(int x=0;... 
    Para a variavel ser menor que o número; 
    Para aumentar é (x++) e para diminuir (x--) */
    
    /* Fatorial Comum seria:
    int resultado =1;
	for(int y=5; y>0;y--){
	resultado = y*resultado;}
        System.out.println("O fatorial é: "+resultado); */
  }
}
