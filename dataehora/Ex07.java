package dataehora;

import java.time.Year;
import java.util.Scanner;


public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = scanner.nextInt();
		
		boolean isBissexto = Year.isLeap(ano);
		
		System.out.println(ano + " é bissexto ? " + isBissexto);
		
		scanner.close();
		
	}
 
}
