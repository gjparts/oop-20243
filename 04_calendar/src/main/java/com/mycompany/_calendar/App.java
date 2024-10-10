package com.mycompany._calendar;

import java.util.Calendar;
import java.text.SimpleDateFormat;
public class App {
    public static void main(String[] args) {
        //clase Calendar: es una clase abstracta
        //por lo tanto no se puede insranciar por medios convencionales
        Calendar fecha1 = Calendar.getInstance();
        //lo anterior crea un objeto de clase Calendar
        //con la fecha/hora de la computadora
        //imprimir los datos de fecha1:
        //el año:
        System.out.println( fecha1.get( Calendar.YEAR ) );
        //podemos obtener otros datos como mes, dia, hora etc.
        //el JAVA el MONTH es un numero de 0 a 11, siendo 0 Enero
        System.out.println( fecha1.get( Calendar.MONTH ) );
        System.out.println( fecha1.get( Calendar.DAY_OF_MONTH ) );
        System.out.println( fecha1.get( Calendar.HOUR ) );
        System.out.println( fecha1.get( Calendar.MINUTE ) );
        System.out.println( fecha1.get( Calendar.SECOND ) );
        //en lugar de imprimir la fecha por partes, es mejor
        //usar un formateador de fecha, como por ejemplo
        //a SimpleDateFormat
        /*al construir el objeto formato se coloca la mascara de entrada
        que es como vamos a mostrar la fecha u hora, los caracteres que pueden
        usar son:
        YYYY año a 4 digitos
        YY   año a 2 digitos
        MM   mes a 2 digitos
        M    mes a 2 digitos pero ignorando el cero a la izquierda
        MMM  nombre del mes
        dd   dia a 2 digitos
        d    dia a 2 digitos pero ignorando el cero a la izquierda
        HH   hora a dos digitos en formato militar
        hh   hora a dos digitos en formato 12 horas
        mm   minuto a dos digitos
        ss   segundos a dos digitos
        aa   indicador de meridiano AM/PM
        */
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        System.out.println( formato.format( fecha1.getTime() ) );
        //crear otro objeto de fecha y ponerle una fecha y una hora fija
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1982, 9, 15, 7, 33, 0);
        System.out.println( formato.format( fecha2.getTime() ) );
        //cambiarle solo un valor a la fecha
        //aqui el segundo de fecha2 pasa a ser 12
        fecha2.set( Calendar.SECOND , 12);
        System.out.println( formato.format( fecha2.getTime() ) );
        //operaciones de suma y resta con fechas
        //sumar 3 años a fecha2
        fecha2.add( Calendar.YEAR , 3);
        System.out.println( formato.format( fecha2.getTime() ) );
        //restar 20 minutos a fecha2
        fecha2.add( Calendar.MINUTE , -20);
        System.out.println( formato.format( fecha2.getTime() ) );
    }
}
