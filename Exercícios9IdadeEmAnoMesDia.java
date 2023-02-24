/*******************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e mês com 30 dias.
*******************************************************************************/
package exercícios9.idade.em.ano.mes.dia;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1n
 */
public class Exercícios9IdadeEmAnoMesDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
	int IdDias, IdMeses, AnoAtual, AnoNasc, IdAnos ;
        
        System.out.print("Calculo de Idade em Dias, Meses e Anos \n\n");
        
        System.out.print("Digite o Ano Atual: ");
	AnoAtual = entrada.nextInt();
		
	System.out.print("Digite o Ano de Nacimento : ");
	AnoNasc = entrada.nextInt();
        
        IdAnos = AnoAtual - AnoNasc;
        IdDias = IdAnos * 365;
        IdMeses = IdAnos * 12;
        
        System.out.print("\n A idade em Anos é " + IdAnos + ".");
                
        System.out.print("\n A idade em Dias é " + IdDias + ".");
        
        System.out.print("\n A idade em Meses é " + IdMeses + ".");
}
    
}
