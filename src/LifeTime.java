package sasuke;
import java.util.*;



/**
 * Created by Сергей on 17.02.2017.
 */
    public class LifeTime {

        public static void main(String[] args) {

            Calendar currentCalendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar = Calendar.getInstance();



            calendar.set(Calendar.YEAR, 1998);
            calendar.set(Calendar.MONTH, 5);
            calendar.set(Calendar.DATE, 16);
            calendar.set(Calendar.HOUR_OF_DAY, 1);
            calendar.set(Calendar.MINUTE, 35);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            calendar2.set(Calendar.YEAR, currentCalendar.get(Calendar.YEAR) - calendar.get(Calendar.YEAR));
            calendar2.set(Calendar.MONTH, currentCalendar.get(Calendar.MONTH) - calendar.get(Calendar.MONTH));
            calendar2.set(Calendar.DAY_OF_MONTH, currentCalendar.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH));
            calendar2.set(Calendar.HOUR_OF_DAY, currentCalendar.get(Calendar.HOUR_OF_DAY) - calendar.get(Calendar.HOUR_OF_DAY));
            calendar2.set(Calendar.MINUTE, currentCalendar.get(Calendar.MINUTE) - calendar.get(Calendar.MINUTE));
            calendar2.set(Calendar.SECOND, currentCalendar.get(Calendar.SECOND) - calendar.get(Calendar.SECOND));

            System.out.println("Мне исполнилось: " + calendar2.get(Calendar.YEAR) + " лет , " + calendar2.get(Calendar.MONTH) + " месяцев , " + calendar2.get(Calendar.DAY_OF_MONTH) + " дней , " + calendar2.get(Calendar.HOUR_OF_DAY) + " часов , " + calendar2.get(Calendar.MINUTE) + " минут , " + calendar2.get(Calendar.SECOND) + " секунд.");
        }
    }




