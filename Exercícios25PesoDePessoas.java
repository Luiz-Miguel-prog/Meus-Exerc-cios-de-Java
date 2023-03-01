/*******************************************************************************
* 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um
* programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
* (h = altura)
*   - Para homens: (72.7*h) - 58
*   - Para mulheres: (62.1 *h) - 44.7
*******************************************************************************/
package exercícios25.pesodepessoas;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios25PesoDePessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
      double Altura,PesoIdeal;
	    char Sexo='n';

  		System.out.print("Digite sua altura (em metros): ");
      Altura = entrada.nextDouble();

      while(Sexo !='m' && Sexo !='M' && Sexo !='h' && Sexo !='H'){

        System.out.print("Digite H ou M para especificar o sexo: "); // o/
        Sexo = entrada.next(".").charAt(0);

        switch(Sexo){
          case 'h', 'H' -> {
              PesoIdeal = ( 72.7* Altura ) - 58;
              System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
             }
          case 'm', 'M' -> {
              PesoIdeal = ( 62.1 * Altura ) - 44.7;
              System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
             }
          default -> System.out.println("Não é M");
        }

      }
	}

}
