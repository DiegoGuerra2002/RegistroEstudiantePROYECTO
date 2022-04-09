package registro.de.estudiantes;

//La clase beca se a instanciado en la clase Becamain

import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Becamain {
    
        public static void main(String[] args) {
        
        Beca estudiante = new Beca("Walter","Vanegas",3,20,26,10);
        
        estudiante.mostrarDATOS();
        //Se crea un arreglo en el que se guarden variables polimorficas ( Lista )
        List<Notas> lista = new ArrayList<>();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("La nota del estudiante: ");
        double nota = reader.nextDouble();
        //Intanciar=Llamar un metodo de otra clase a la clase main.
        lista.add(new Vnota(nota));
        
        System.out.println("Registro de notas");
        for(Notas salida:lista) {
            salida.notaver();
        }
        
        System.out.println("------------");
        ((Vnota)lista).Casting();
    }
    
}
