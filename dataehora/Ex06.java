package dataehora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira sua data de nascimento (dd/MM/yyyy): ");
		String dataNascimentoStr = scanner.nextLine();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formato);
		LocalDate dataAtual = LocalDate.now();
		
		Period idade = Period.between(dataNascimento, dataAtual);
		
		System.out.println("Você tem " + idade.getYears() + " anos");
		
		scanner.close();
	}

}
