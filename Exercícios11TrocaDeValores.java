/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercícios11.troca.de.valores;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios11TrocaDeValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int A,B,VariavelTemporaria;

      	System.out.print("Efetuador de troca de valores entre variaveis\n\n"); //Isso é estrutura condicional, mesmo?


      	System.out.print("Digite a variável A:  ");
      	A = entrada.nextInt();

      	System.out.print("Digite a variável B: ");
      	B = entrada.nextInt();



      	VariavelTemporaria = A;
        A = B;
        B = VariavelTemporaria;

        System.out.print("A="+A+" | B="+B+"\n");

    }

}
