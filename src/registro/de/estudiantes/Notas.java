
package registro.de.estudiantes;

public abstract class Notas {
    
    double nota;
    
    public Notas(double _nota) {
        this.nota=_nota;
    }
    
    public abstract void notaver();
}
