package dataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex09 {

    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        
        LocalDate primeiroDia = hoje.withDayOfMonth(1);
        LocalDate ultimoDia = hoje.withDayOfMonth(hoje.lengthOfMonth());

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Primeiro dia: " + primeiroDia.format(formato));
        System.out.println("Último dia: " + ultimoDia.format(formato));
    }
}
