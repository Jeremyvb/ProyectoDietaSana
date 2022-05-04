package ClasesYObjetos;

public class Calculadora {
    
    float imc;
    float hb; 

    public Calculadora() {
        
    }  

    public float calcularIMC(float Peso, float Altura){
        float indiceMC;
        indiceMC = (float) (Peso / (Math.pow(Altura, 2.0)));
        return indiceMC;
    }
    
    public float calcularHB(String Genero, float Peso, float Altura, int Edad){
        float harrisB = 0;
        
        if("Hombre".equals(Genero)){
            harrisB = (float) ((10 * Peso) + (6.25 * Altura) - (5 * Edad) + 5);
        }else if("Mujer".equals(Genero)){
            harrisB = (float) ((10 * Peso) + (6.25 * Altura) - (5 * Edad) - 161);
        }
        return harrisB;
    }
    
}
