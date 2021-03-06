package registro.de.estudiantes;
//Autor: Diego Fernando Guevara Guerra
//       Guillermo Alejandro Mezquita Lopez
        
        
public class Beca extends Estudiante{
    private int codigoEstudiante;
    private float notaFinal;

    public Beca(String Nombre,String Apellido,int año, int Edad,int codigoEstudiante,float notaFinal)
    {
        super(Nombre,Apellido,año,Edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal= notaFinal;
    }
    
    public void mostrarDATOS()
    {
        System.out.println("El estudiante: "+ getNombre()+
                "\nde apellido: "+getApellido()+
                "\ncursante de: "+getAño() +
                "\ncon edad de: "+getEdad() +
                "\ncon el Codigo de Estudiante: "+codigoEstudiante+
                "\ncon una nota definitiva de: "+notaFinal);
        
        System.out.println("Es ganador de la beca estudiantil por sus esfuerzos.");
    }
}
