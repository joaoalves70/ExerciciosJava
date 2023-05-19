/*******************************************************************************
* 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
* valores de modo que a variável A passe a possuir o valor da variável B, e a
* variável B passe a possuir o valor da variável A. Apresentar os valores
* trocados.
*******************************************************************************/
import java.util.Scanner;
public class Onze
{
	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
		int a, b, temp;
		
	  System.out.println("Efetuar troca de valores");
		System.out.println("Certo, informe o valor de A: ");
		a = Ler.nextInt();
		System.out.println("Agora informe o valor de B: ");
		b = Ler.nextInt();
		
		temp = a;
		a = b;
	  b = temp;
	    
	  System.out.println("O valor de A é igual a: "+a+", e o valor de B é: "+b+".");
	}
}
