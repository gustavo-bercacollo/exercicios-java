package dataehora;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03 {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
		
		
		System.out.println("Hoje é " + diaDaSemana);
	}

}
