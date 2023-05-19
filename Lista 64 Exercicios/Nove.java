/*****************************************************************
 * 9) Faça um algoritmo que leia a idade de uma pessoa expressa em
 * anos, meses e dias e escreva a idade dessa pessoa expressa apenas
 * em dias. Considerando o ano com 365 dias e os meses com 30 dias.
 ****************************************************************/

import java.util.Scanner;
public class Nove {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double anos, meses, dias, diastotal;
		
		System.out.println("Informe sua idade em anos, meses e dias respectivamente: ");
		anos = ler.nextDouble();
		meses = ler.nextDouble();
		dias = ler.nextDouble();
		
		diastotal = anos*365 + meses*30 + dias;
		
		System.out.print("Sua idade em dias é de: "+diastotal);
	}
}
