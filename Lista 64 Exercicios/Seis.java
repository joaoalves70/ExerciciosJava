/*****************************************************************************
 *  6) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
 *  Fahrenheit.
 ****************************************************************************/

import java.util.Scanner;
public class Seis
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double c, f;
		
		System.out.print("Informe a temperatura em graus celsius: ");
		c = ler.nextDouble();
		
		f = ((c*1.8)+32);
		
		System.out.print(c+"°C equivale a: "+f+"°F.");
	}
}   
