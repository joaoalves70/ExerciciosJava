/*******************************************************************************
* 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
*   O módulo de um número x é:
*   x se x é maior ou igual a zero
*   x * (-1) se x é menor que zero
*******************************************************************************/
import java.util.Scanner;
public class Doze
{
	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
		int x;
		
	    System.out.println("Módulo de um numero inteiro");
	    
	    System.out.println("Por favor informe o número desejado: ");
	    x = Ler.nextInt();
	    
	    if (x > 0) {
	        x = x;
	    } 
	    
	    else {
	        x = x * (-1);
	    }
	    
	    System.out.println("O módulo do número informado é: "+x);
	}
}
