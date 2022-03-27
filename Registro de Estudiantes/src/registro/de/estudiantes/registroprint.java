
package registro.de.estudiantes;


public class registroprint {
    private  registro ob;

    public registroprint(registro ob){
         this.ob = ob;
    }

    public void imprimirObjeto()
    {
      System.out.println(this.ob.imprimir());
    }
}

