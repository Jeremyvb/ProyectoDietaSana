package ClasesYObjetos;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dieta {
    
    private String nombre;
    private int totalCalorias;
    public ArrayList<Dieta> dieta = new ArrayList<>();
    public ArrayList<Alimento> alimentos = new ArrayList<>();
    Scanner Entrada = new Scanner(System.in);

    public Dieta() {
        
    }
    
    public Dieta(String nombre, int totalCalorias, ArrayList<Alimento> alimentos) {
        this.nombre = nombre;
        this.totalCalorias = totalCalorias;
        this.alimentos = alimentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
    
    public void InsertarDatosDieta() throws ParseException{

        String Nombre;
        int TotalCalorias;

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la dieta: ");
        Nombre = Entrada.next();
                
        System.out.println("Ingrese el total de calorias: ");
        TotalCalorias = Entrada.nextInt();
                             
        System.out.println("¿Cuantos alimentos quiere?");
        int totalAlimentos = Entrada.nextInt();

        Alimento alimentosL = new Alimento();
        for(int i=0 ;i < totalAlimentos; i++){
            alimentosL.InsertarDatos();
        }  
                
        Dieta dietaNew = new Dieta(Nombre,TotalCalorias,alimentosL.getLAlimento());
                
        dieta.add(dietaNew);
                
        System.out.println("!Dieta registrada!");
        
    }
    
    public void imprimirDatosDieta(){
    
        for (int i = 0; i < dieta.size(); i++) {
            System.out.println("Dieta "+(i+1)+":");
            System.out.println("-Nombre dieta: "+dieta.get(i).getNombre());
            System.out.println("-Total calorias: "+dieta.get(i).getTotalCalorias());
            for (int j = 0; j < dieta.get(i).alimentos.size(); j++) {
                System.out.println("Lista de alimentos:");
                System.out.println("("+(j+1)+")Nombre alimento: "+dieta.get(i).alimentos.get(j).getNombre()+" - Tipo: "+dieta.get(i).alimentos.get(j).getTipo()+" - Calorias: "+dieta.get(i).alimentos.get(j).getCalorias());
            }  
        }
                  
    }
    
    public void actualizarDieta(String nombreDieta){
        
        for (int i = 0; i < dieta.size(); i++) {
            if (dieta.get(i).getNombre().equals(nombreDieta)) {
                String Nombre;
                int TotalCalorias;

                System.out.println("¡Para actualizar datos de la dieta ingreselos nuevamente!");
                System.out.println("Ingrese el nombre de la dieta: ");
                Nombre = Entrada.next();

                System.out.println("Ingrese el total de calorias: ");
                TotalCalorias = Entrada.nextInt();

                System.out.println("¿Cuantos alimentos quiere?");
                int totalAlimentos = Entrada.nextInt();

                Alimento alimentosL = new Alimento();
                for(int j=0 ;j < totalAlimentos; j++){
                    alimentosL.InsertarDatos();
                }  

                Dieta dietaActualizada = new Dieta(Nombre,TotalCalorias,alimentosL.getLAlimento());

                dieta.set(i, dietaActualizada);

                System.out.println("!Dieta actualizada!");
            }
        }
    }
    
    public void eliminarDieta(String nombreDieta){
    
        for (int i = 0; i < dieta.size(); i++) {
            if(dieta.get(i).getNombre().equals(nombreDieta)){
                dieta.remove(i);
            }
        }
    }
    
    public boolean buscarDieta(String nombreDieta){
    
        for (int i = 0; i < dieta.size(); i++) {
            if(dieta.get(i).getNombre().equals(nombreDieta)){
                return true;
            }
        }
        return false;
    }
        
       
}