package clase03.aula;

import Librerias.Utiles;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Formato {

    public static void main(String[] args) throws ParseException{

        //Formato.getFormatoMoneda();
        //Formato.getFormatoFecha();
        //Formato.getFormatoFecha2();
        //Formato.getFormatoFecha3();
        
        //Formato.textToDate();
        System.out.println( Utiles.stringToDate("aa/02/2013"));
    }

    public static void getFormatoMoneda() {

        // Formato de moneda
        NumberFormat formatGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatGermany.setGroupingUsed(false);
        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
        formatUS.setGroupingUsed(false);
        Locale lp = new Locale("es", "PE");
        NumberFormat formaPU = NumberFormat.getCurrencyInstance(lp);
        formaPU.setGroupingUsed(false);

        double miCuentaBancaria = 2515450.63;
        System.out.println("Moneda Euro  :" + formatGermany.format(miCuentaBancaria));
        System.out.println("Moneda Dolar :" + formatUS.format(miCuentaBancaria));
        System.out.println("Moneda Soles :" + formaPU.format(miCuentaBancaria));

    }

    public static void getFormatoFecha() {
        GregorianCalendar ahora = new GregorianCalendar();

        // Crear una fecha
        ahora = new GregorianCalendar(14, 02, 1988);

        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
        //
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
        //
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));

    }

    public static void getFormatoFecha2() {
        Date now = new Date();
        System.out.println(now.getTime());

        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        //DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);

        String s = df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        String s5 = df5.format(now);

        System.out.println("(Default) Hoy es " + s);
        System.out.println("(SHORT)   Hoy es " + s1);
        System.out.println("(MEDIUM)  Hoy es " + s2);
        System.out.println("(LONG)    Hoy es " + s3);
        System.out.println("(FULL)    Hoy es " + s4);
        System.out.println("(CUSTOM)  Hoy es " + s5);
    }

    public static void getFormatoFecha3() {
        Calendar c1 = new GregorianCalendar(2011, 9, 1);
        Date d1 = c1.getTime();

        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date d2 = c2.getTime();

        if (d1.after(d2)) {
            System.out.println("d1 es después que d2");
        }
        if (d1.before(d2)) {
            System.out.println("d1 es antes que d2");
        }
    }
    
    public static void textToDate() throws ParseException{
        DateFormat dateformat = DateFormat.getDateInstance();
        Date fecha =  dateformat.parse("18/08/2013");
        System.out.println(fecha);
    }
    
    //parse es un metodo para convertir
}
