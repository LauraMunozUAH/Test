package es.uah.matycomp.edu.ejemplos;
import java.time.ZoneId;
import java.time.LocalDateTime;

public class Jugando {
    Boolean esVerdad = true;
    Boolean esMentira = false;
    String nombre;
    int edad;
    Integer miEdad = 18;


    public void tocaVariables() {
        esVerdad = !esMentira;
        nombre = "Laura Muñoz";
        edad = miEdad.intValue();
    }

    public void estructurasDeControl() {
        //For
        for (int x = 1; x < 5; x++) {
            //Interior del bucle
            System.out.println("Es el bugle, interacción" + x);
        }
        //For v2, x++ = --x :incrementar uno, x-- = ++x: decrementar uno
        int y;
        for ( y = 1; y < 5; y++) {
            //Interior del bucle
            System.out.println("Es el bugle for v2, interacción" + y);
        }
        //For v3
        int z=1;
        for (; z < 5;) {
            //Interior del bucle
            System.out.println("Es el bugle for v3, interacción" + z);
            z++;
        }
        /////////////////////////////////////////////////////////////////////////////
        //Bucles while
        while (z<10){
            System.out.print("Estoy en un bucle de infinito");
            z++;
        }
        z=0;
        while (z<10){
            System.out.print("Estoy en un bucle de infinito");
            z++;
        }
        if (true){
            //Cosas del true
        } else{
            //Cosas del false
        }
        int resultado;
        resultado= (z<y)?1:2; //es un if
    }
    public long getSegundos(){
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }
}
