import java.time.LocalDate;
import java.time.Period;

/**
 * AgeCalulator
 */
public class AgeCalulator {

      public static void main(String[] args) {
          
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2001, 03, 01);
        int years = Period.between(birthDate, today).getYears();
        
        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);
      }
     
}