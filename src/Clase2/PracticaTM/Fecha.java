package Clase2.PracticaTM;

import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    GregorianCalendar gcal = new GregorianCalendar();

    private int dia;
    private int mes;
    private int anio;

    public Fecha(Fecha f){this(f.dia,f.mes,f.anio);}
    public Fecha() {
        this.dia = gcal.get(Calendar.DATE);
        this.mes = gcal.get(Calendar.MONTH)+1;
        this.anio = gcal.get(Calendar.YEAR);
    }

    // Para controlar si la fecha es correcta tengo 2 formas: antes o despues de crearla
    // Controlo si la fecha es correcta despues de crearla llamando a fechaCorrecta()
    public Fecha(int d, int m, int a){
        dia = d;
        mes = m;
        anio = a;
    }

    // Controlo si la fecha es correcta antes de crearla usando excepciones
//    public Fecha(int dia, int mes, int anio) {
//        gcal.setLenient(false);
//        gcal.set(anio, mes-1, dia);
//        try {
//            this.dia = gcal.get(Calendar.DATE);
//            this.mes = gcal.get(Calendar.MONTH) + 1;
//            this.anio = gcal.get(Calendar.YEAR);
//        }
//        catch (Exception e){
//            if (e.getMessage() == "DAY_OF_MONTH")
//                System.out.println("El dia ingresado no es valido");
//            else if (e.getMessage() == "MONTH")
//                System.out.println("El mes ingresado no es valido");
//            else if (e.getMessage() == "YEAR")
//                System.out.println("El año ingresado no es valido");
//            else
//                e.printStackTrace();
//        }
//        finally {
//            gcal.setLenient(true);
//        }
//    }

    @Override
    public String toString() {return dia+"/"+mes+"/"+anio;}

    public boolean fechaCorrecta(){
        if (anio > 0 && 1 <= mes && mes <= 12 )
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                    || mes == 8 || mes == 10 || mes == 12 && 1 <= dia && dia <= 31) return true;
            else if (mes == 4 || mes == 6 || mes == 9
                    || mes == 11 && 1 <= dia && dia <= 30) return true;
            else if ((mes == 2 && 1<= dia && dia <= 28) ||
                    (esBisiesto(anio) && mes == 2 && 1<= dia && dia <= 29)) return true;
            else return false;
        else return false;
    }

    public boolean esBisiesto(int anio){
        String year = String.valueOf(anio);
        return ((year.endsWith("00") && anio%400 == 0) || (!year.endsWith("00") && anio%4 == 0));
    }

    public void sumarDia(){
        gcal.set(Calendar.DATE, this.dia+1);
        this.dia = gcal.get(Calendar.DATE);
        this.mes = gcal.get(Calendar.MONTH) + 1;
        this.anio = gcal.get(Calendar.YEAR);
    }
}
