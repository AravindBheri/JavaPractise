import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Date
 */
public class CurrentDate {

    public static void main(String[] args) {
        Date currentTime = new Date();
        System.out.println(currentTime); 

        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        System.out.println(time.format(currentTime));

        SimpleDateFormat month = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(month.format(currentTime));
        
        SimpleDateFormat day = new SimpleDateFormat("EEEE");
        System.out.println(day.format(currentTime));
    }
}