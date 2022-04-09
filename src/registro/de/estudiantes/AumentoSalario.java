package registro.de.estudiantes;

//Se habilita la herencia en la clase con la clave [extends]

public class AumentoSalario extends Docentes {
//La accion codigoDocente, asistencia, notaDocente se a creado sin relacion alguna a la clase padre, unas variables nuevas.
//polimorfismo
    
    private int codigoDocente;
    private float asistencia;
    private int notaDocente;

    public AumentoSalario(String Nombre,String Apellido,String año, String seccion,int codigoDocente,float asist,int notadocente)
    {
        super(Nombre,Apellido,año,seccion);
        this.codigoDocente = codigoDocente;
        this.asistencia= asist;
        this.notaDocente = notadocente;
    }
    
    public void mostrarDATOS()
    {
        System.out.println("El docente: "+ getNombre()+
                "\nde apellido: "+getApellidos()+
                "\nque instruye en el: "+getAño() +
                "\nresponsable de la seccion: "+getSección() +
                "\ncon el Codigo de Docente: "+codigoDocente+
                "\ncon una asistencia de: " + asistencia +
                "\ncon una nota de docente definitiva de: "+notaDocente);
        
        System.out.println("Recibira un aumento en su salario por su dedicación y sus esfuerzos.");
    }
}
