package dataehora;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex11 {

    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
     
        LocalDate natal = LocalDate.of(hoje.getYear(), 12, 25);
        
        long diasParaONatal = ChronoUnit.DAYS.between(hoje, natal);
        
        System.out.println("Faltam " + diasParaONatal + "para o natal");
        
        
    }
}
