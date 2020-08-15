package tareasobrecarga;
class ValorPotencia {
    int CalcularPotencia(int voltaje, int intensidad){
        return voltaje*intensidad;
    }
    double CalcularPotencia(double voltaje, double intensidad){
        return voltaje*intensidad;
    }
    float CalcularPotencia(float voltaje, float intensidad){
        return voltaje*intensidad;
    }
    String CalcularPotencia(String voltaje, String intensidad){
        return "voltaje*intensidad";
    }
}
/**
 * @author Junior Steven Cangui Toapanta
 */
public class TareaSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\tSede Latacunga");
        System.out.println("Estudiante: Junior Cangui");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Tema: SOBRECARGA\n");
        
        ValorPotencia Calculo1=new ValorPotencia();
        ValorPotencia Calculo2=new ValorPotencia();
        ValorPotencia Calculo3=new ValorPotencia();
        ValorPotencia Calculo4=new ValorPotencia();
        
        int resultado1;
        Calculo1.CalcularPotencia(100,5);
        resultado1= Calculo1.CalcularPotencia(100,5);
        System.out.println("Potencia máxima: " +resultado1);
        
        double resultado2;
        Calculo2.CalcularPotencia(100,5);
        resultado2= Calculo2.CalcularPotencia(100,5);
        System.out.println(String.format("Potencia máxima: %.2f",resultado2));
        
        float resultado3;
        Calculo3.CalcularPotencia(100,5);
        resultado3= Calculo3.CalcularPotencia(100,5);
        System.out.println("Potencia máxima: " +resultado3);
        
        String resultado4;
        Calculo4.CalcularPotencia("100","5");
        resultado4= Calculo4.CalcularPotencia("100","5");
        System.out.println("Potencia máxima: " + resultado4);
    }
    
}

