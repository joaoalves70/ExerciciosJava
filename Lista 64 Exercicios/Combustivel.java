/*************************************************************
 * 5) Efetuar o cálculo da quantidade em litros de combustivel
 * gasta em uma viagem, utilizando um carro que faz 12KM por
 * litro. O programa deve apresentar os valores da velocidade média
 * tempo gasto, distância percorrida, e a quantidade de litros
 * utilizada na viagem.
 ************************************************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tempo, velo, distancia, combustivel;
		
		System.out.println("Qual foi o tempo gasto da viagem em minutos?");
		tempo = ler.nextInt();
		
		System.out.println("Qual foi a velocidade média?");
		velo = ler.nextInt();
		
		distancia = tempo * velo;
		
		combustivel = distancia/12;
		
		System.out.print("A quantidade de combustivel gasta foi de: "+combustivel);		
	}
}
