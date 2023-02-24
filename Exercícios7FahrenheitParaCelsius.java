/*****************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
* 		temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
* 		variável C é a temperatura em graus Celsius.
*****************************************************************************************************************/
package exercícios7.fahrenheitparacelsius;

import java.util.Scanner;

public class Exercícios7FahrenheitParaCelsius {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Fahrenheit, Celsius;
                
        System.out.print("Conversor de temperatura: Graus Fahrenheit -> Celsius\n\n");
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
	Fahrenheit = entrada.nextDouble();
        
       Celsius = (Fahrenheit - 32 ) * 5 / 9;
        
        System.out.print("\n A medida convertida é " + Celsius + "ºC\n");
    }
   
}
