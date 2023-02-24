/*****************************************************************************************************************
* 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
* 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
* 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*****************************************************************************************************************/
package exercícios6.celsius.para.fahrenheit;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1n
 */
public class Exercícios6CelsiusParaFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; //Consegui colocar o nome de variável mais difícil do mundo! o/

		System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n\n");
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();
		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
		
	}

}