/*******************************************************************
 * 10) Escrever um programa que leia dois números inteiros e mostre
 * todos os relacionamentos de ordem existentes entre eles.
 * Os relacionamentos possíveis são: Igual, Não Igual, Maior, Menor,
 * Maior ou Igual, Menor ou Igual.
 ******************************************************************/

import java.util.Scanner;
public class Dez {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, y;
		boolean igual=false, naoigual=false, maior=false, menor=false, maiorigual=false, menorigual=false;

    System.out.println("Determine os dois valores: ");
    x = ler.nextInt();
    y = ler.nextInt();
    
    if (x==y) igual=true;
    if (x!=y) naoigual=true;
    if (x>y)  maior=true;
    if (x<y)  menor=true;
    if (x>=y) maiorigual=true;
    if (x<=y) menorigual=true;
    
  System.out.println("\nIgual = "+igual);
	System.out.println("Não Igual = "+naoigual);
	System.out.println("Maior = "+maior);
	System.out.println("Menor = "+menor);
	System.out.println("Maior ou igual = "+maiorigual);
	System.out.println("Menor ou igual = "+menorigual);
	}
}
