import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data e hora do evento (dd/MM/yyyy HH:mm): ");
        String dataHoraStr = scanner.nextLine();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDateTime dataHoraEvento = LocalDateTime.parse(dataHoraStr, formato);
        
        LocalDateTime agora = LocalDateTime.now();
        
        Duration duracao = Duration.between(agora, dataHoraEvento);
        
        long dias = duracao.toDays();
        long horas = duracao.toHours() % 24;
        long minutos = duracao.toMinutes() % 60;
        
        System.out.println("Faltam " + dias + " dias, " + horas + " horas e " + minutos + " minutos para o evento");
        
        scanner.close();
    }
}
