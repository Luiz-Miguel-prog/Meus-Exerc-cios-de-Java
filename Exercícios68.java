/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercícios68;

import java.util.Scanner;

/**
 *
 * @author 36124872022.1N
 */
public class Exercícios68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /* Preparação para entrada dos dados com o usuário */
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um inteiro para calculo do faotrial:\n");
        int numero = input.nextInt();
        
        long fatorial =1; /* Inicio da váriavel como fatorial */
      
       /* Cálculo do fatorial */
      for(int i=0; i < 0; i++){
            fatorial = fatorial*i; 
        } 
      /* IMpressão do fatorial*/
      System.out.print("O Fatorial de "+numero+" e: "+fatorial+"\n");
    }
    
}
