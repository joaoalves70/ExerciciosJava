/*************************************************************
 * 7) Ler uma temperatura em graus Fahrenheit e apresentá-la
 * convertida em graus Celsius.
 ************************************************************/

import java.util.Scanner;
public class Sete {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double f, c;
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		f = ler.nextDouble();
		
		c = (f-32)*5/9;
		
		System.out.print("A temperatura em graus Celsius é de: "+c);
	}
}
