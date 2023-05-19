/*******************************************************************************
* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Decrescente
{
	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
        int Quantidade = 3;
        int[] Numeros = new int[Quantidade];
        System.out.print("Ordenador de números\n\n");
        
        for (int x = 0; x < Quantidade; x++) {
          System.out.print("Digite o "+(x+1)+" número:  ");
          Numeros[x] = Ler.nextInt();
        }
        
        Arrays.sort(Numeros);
        
        System.out.println("\n\nOs números em ordem crescente são:");
        for (int Numero : Numeros) {
          System.out.println(Numero);
        }
    }
}
