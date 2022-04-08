
package registro.de.estudiantes;


public class registroprint {
    private  registro oz;

    public registroprint(registro ob){
         this.oz = ob;
    }

    public void imprimirObjeto()
    {
      System.out.println(this.oz.imprimir());
    }
}

