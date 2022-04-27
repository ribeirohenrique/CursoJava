package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("26/04/2022");
        Date y2 = sdf2.parse("26/04/2022 16:23:00");
        Date y3 = Date.from(Instant.parse("2022-04-26T16:39:30Z"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60 * 60 * 5);

        System.out.println(y1);
        System.out.println(y2);

        System.out.println("UTC:");
        System.out.println("----------------------");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));
        System.out.println("GMT: ");
        System.out.println("----------------------");
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
        System.out.println("----------------------");
        System.out.println("CALENDAR: ");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(y3);

        //Incrementando horas na data
        calendar.add(Calendar.HOUR_OF_DAY, 4);
        y3 = calendar.getTime();
        System.out.println(sdf3.format(y3));

        //Buscando os minutos da data
        int minutes = calendar.get(Calendar.MINUTE);
        System.out.println("Minutes: " + minutes);


        //Buscando o mes da data (precisa incrementar 1+ pois comeca em zero)
        int month = 1 + calendar.get(Calendar.MONTH);
        System.out.println("Month: " + month);

    }
}
