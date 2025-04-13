package dataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato (dd/MM/yyyy): ");
        String data = scanner.nextLine();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate dataFormatada = LocalDate.parse(data, formato);
        
        System.out.println("Data convertida: " + dataFormatada);
        
        scanner.close();
    }
}
