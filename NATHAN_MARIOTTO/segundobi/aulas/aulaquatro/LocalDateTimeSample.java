package segundobi.aulas.aulaquatro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSample {
    
    public static void main(String[] args) {
        
        //LocalTime samples
        LocalTime now = LocalTime.now();
        LocalTime fiveAM = LocalTime.of(5, 0);
        LocalTime cristianoRonaldoTime = LocalTime.now(ZoneId.of("Portugal"));
        
        System.out.println(now);
        System.out.println(fiveAM);
        System.out.println(cristianoRonaldoTime);
        
        //LocalDate samples
        LocalDate today = LocalDate.now();
        LocalDate yearOfBirth = LocalDate.of(1998, 11, 24);
        LocalDate dateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        
        System.out.println(today);
        System.out.println(yearOfBirth);
        System.out.println(dateInJapan);
        
        //LocalDateTime samples
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime dateTimeMillenniumBug = LocalDateTime.of(2000, 1, 1, 0, 0);
        LocalDateTime dateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(nowDateTime);
        System.out.println(dateTimeMillenniumBug);
        System.out.println(dateTimeInJapan);

        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println("Data formatada: " + dateTimeInJapan.format(dateFormater));
    }

}
