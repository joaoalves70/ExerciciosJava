/**********************************************
 * 1)
 * Faça um programa para calcular o estoque
 * médio de uma peça.
**********************************************/
import java.util.Scanner;
public class Um
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);	    
	    double estoquemed, quantmin, quantmax;
	    String peça;
	    
	    System.out.println("Qual peça você quer calcular o estoque médio?");
	    peça = ler.next();
	    
	    System.out.println("Qual o estoque minimo dessa peça?");
	    quantmin = ler.nextDouble();
	    
	    System.out.println("Qual o estoque máximo dessa peça?");
	    quantmax = ler.nextDouble();
	    
	    estoquemed = (quantmin+quantmax)/2;
	    
    System.out.println("O estoque médio de "+peça+" é: "+estoquemed);

	}
}
