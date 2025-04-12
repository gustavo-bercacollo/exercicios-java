package dataehora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma data (dd/MM/yyyy): ");
		String data1Str = scanner.nextLine();
		System.out.print("Digite outra data (dd/MM/yyyy): ");
		String data2Str = scanner.nextLine();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		LocalDate data1 = LocalDate.parse(data1Str, formato);
		LocalDate data2 = LocalDate.parse(data2Str, formato);
		
		long direncaEmDias = ChronoUnit.DAYS.between(data1, data2);
		
		System.out.println("Diferença de " + direncaEmDias + " dias");
		
		scanner.close();
		
	}
 
}
