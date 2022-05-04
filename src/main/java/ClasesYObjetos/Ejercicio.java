package ClasesYObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {
    
    String nombre;
    int horasAlDia;
    private ArrayList<Ejercicio> LEjercicio;
    
    public ArrayList<Ejercicio> getLEjercicio() {
        return LEjercicio;
    }

    public Ejercicio(String nombre, int horasAlDia) {
        this.nombre = nombre;
        this.horasAlDia = horasAlDia;
    }
    
    public Ejercicio(){
        LEjercicio = new ArrayList<Ejercicio>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasAlDia() {
        return horasAlDia;
    }

    public void setHorasAlDia(int horasAlDia) {
        this.horasAlDia = horasAlDia;
    }   
    
    public void InsertarDatosEjercicio(){

         String Nombre;
         int HorasAlDia;

         Scanner Entrada = new Scanner(System.in);
         System.out.println("Inserte los siguientes datos");
         System.out.println("Nombre ejercicio: ");
         Nombre = Entrada.next();

         System.out.println("Horas al dia que se pactrica: ");
         HorasAlDia = Entrada.nextInt();

         LEjercicio.add(new Ejercicio(Nombre,HorasAlDia));

    }
    
}
