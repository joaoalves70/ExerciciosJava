/*****************************************************************
 * 8) Calcular e representar o valor do volume de uma lata de óleo 
 * V = 3.14159*R*R*A
 * onde as variaveis: V, R e A representam respectivamente o:
 * Volume, o raio e a altura.
 ****************************************************************/

import java.util.Scanner;
public class Oito {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double v, r, a;
		
		System.out.print("Determine o valor do raio, e depois o da altura: ");
		r = ler.nextDouble();
		a = ler.nextDouble();
		
		v = 3.14159*r*r*a;
		System.out.print("O volume da lata é de: "+v);
		
	}

}
