package dataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
    	Locale localeBR = Locale.forLanguageTag("pt-BR");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataStr, formato);
        
        DateTimeFormatter formatoDiaSemana = DateTimeFormatter.ofPattern("EEEE", localeBR);
        String diaSemana = data.format(formatoDiaSemana);
        
        System.out.println("Data: " + data.format(formato) + " será " + diaSemana);

        scanner.close();
    }
}
