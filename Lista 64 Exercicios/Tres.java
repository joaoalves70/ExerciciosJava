/***********************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças
 * levando-se em consideração que sua comissão será de 5% do total da venda
 * e que você tem os seguintes dados:
 * - Identificação do vendedor
 * - Código da peça
 * - Preço unitário da peça
 * - Quantidade vendida
***********************************************************************/
import java.util.Scanner;
public class Tres
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);	    
	    String vendedor;
	    Double valor, comissao;
	    int codigo, quantidade;
	    
    System.out.print("Informe o vendedor: ");
    vendedor = ler.next();
    
    System.out.print("Informe o código da peça: ");
    codigo = ler.nextInt();
    
    System.out.print("Informe o valor da peça: R$ ");
    valor = ler.nextDouble();
    
    System.out.print("Quantas peças foram vendidas? ");
    quantidade = ler.nextInt();
    
    comissao = (valor*quantidade)*0.05;
    
    System.out.print("O valor a receber de comissão é de: R$ "+comissao);
	}
}
