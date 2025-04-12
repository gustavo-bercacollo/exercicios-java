package dataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Ex04 {

	public static void main(String[] args) {
		LocalDate hojeMais30Dias = LocalDate.now().plusDays(30);
		
		
		String dataFormatada = hojeMais30Dias.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.err.println("Daqui a 30 dias será: " + dataFormatada);
	}

}
