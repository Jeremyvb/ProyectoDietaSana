package ClasesYObjetos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivosTxt {
    
    File archivo;
    
    public void crearArchivoDeTexto(){
    
        
        archivo = new File("archivo.txt");
        if (archivo.exists()){
            archivo.delete();
        }
        try{
            if(archivo.createNewFile()){
                System.out.println("Archivo creado con exito");
            }else{
                System.out.println("Error al crear archivo");
            }
        }catch(IOException exepcion){
            exepcion.printStackTrace(System.out);
        }
    }
    
    public void escribirListaDietas(ArrayList<Dieta> dieta){
        
        ArrayList<Dieta> dietaClon = new ArrayList<>();
        dietaClon = dieta;
    
    }
    
    public void escribirListaPersonas(ArrayList<Persona> persona){
        
        ArrayList<Persona> personaClon = new ArrayList<>();
        personaClon = persona;
        
    }
    
}
