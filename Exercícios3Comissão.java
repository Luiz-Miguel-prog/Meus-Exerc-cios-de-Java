/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda 
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida
*************************************************************************/
package exercícios3.comissão;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1n
 */
public class Exercícios3Comissão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		Scanner entrada = new Scanner(System.in);
		System.out.print("Programa para pagamento de comissão de vendedores de peças.\n\n"); //Why so specific?!
		
		int IdVendedor,IdPeca;
		float PrecoPeca,Quantidade,ValorComissao,PorcentagemComissao=0.05f;
		
		System.out.print("Digite a identificação do vendedor: ");
		IdVendedor = entrada.nextInt();
		
		System.out.print("Digite o ID da Peça: ");
		IdPeca = entrada.nextInt();
		
		System.out.print("Digite o preço unitário da peça: ");
		PrecoPeca = entrada.nextFloat();
		
		System.out.print("Digite a quantidade de peças vendidas: ");
		Quantidade = entrada.nextFloat();
		
		ValorComissao = (PrecoPeca * Quantidade) * PorcentagemComissao; 
		
		System.out.printf("O valor da comissão é de %.2f reais.\n", ValorComissao);
		
	}
}
