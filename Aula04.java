package projetos_LPA.aula04;

import java.util.Scanner;

public class Aula04 {

	public static void main(String[] args) {
		double ht, vh, sb, sl, inss;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quantas horas você trabalha?: ");
		ht = ler.nextDouble();
		System.out.println("Informe quanto você ganha por hora?: ");
		vh = ler.nextDouble();
		
		sb = ht*vh;
		inss = sb*0.12;
		sl = sb-inss;
		
		System.out.println("Seu salário bruto é:: " + sb);
		System.out.println("Seu salário líquido é:: " + sl);
		
	}

}
