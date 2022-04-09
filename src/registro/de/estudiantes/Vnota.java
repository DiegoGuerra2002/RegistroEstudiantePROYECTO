package registro.de.estudiantes;

/**
 *
 * @author Agustin
 */
public class Vnota extends Notas{
    
    public void Casting(){
        System.out.println("Casting Casting Casting");
    }
    
    public Vnota(double nota){
        super(nota);
    }

    @Override
    public void notaver() 
    {
        System.out.println(nota);
   
    }
    
}
