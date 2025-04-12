package dataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Ex05 {

	public static void main(String[] args) {
		LocalDate hojeMenos30Dias = LocalDate.now().minusWeeks(2);
		
		
		String dataFormatada = hojeMenos30Dias.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.err.println(" Duas semanas atrás: " + dataFormatada);
	}

}
