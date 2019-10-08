package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.ColorEnum;

public class FormaMainProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> formas = new ArrayList<Forma>();
		System.out.print("Entre com o número de Figuras:");
		Integer pNumFig = sc.nextInt();

		for (int i = 1; i <= pNumFig; i++) {
			System.out.println("Dados da Figura #" + i + ":");
			System.out.print("Retângulo ou Circulo? (r/c):");
			char pTipoFigura = sc.next().charAt(0);
			System.out.print("Cor:");
			ColorEnum pCor = ColorEnum.valueOf(sc.next());
			if (pTipoFigura=='r') {
				System.out.print("Informe a Largura do retângulo:");
				Double pLargura = sc.nextDouble();
				System.out.print("Informe a Altura do retângulo:");
				Double pAltura = sc.nextDouble();
				formas.add(new Retangulo(pCor, pAltura, pLargura));
			} else if (pTipoFigura=='c') {
				System.out.print("Informe o raio :");
				Double pRaio = sc.nextDouble();
				formas.add(new Circulo(pCor, pRaio));
			}
		}
		
		System.out.println("CÁLCULO DAS ÁREAS:");
		for (Forma forma : formas) {
			System.out.printf("%.2f%n", forma.area());			
		}

	}

}
