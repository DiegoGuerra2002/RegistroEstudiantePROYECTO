/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro.de.estudiantes;

/**
 *
 * @author Agustin
 */
public class Cicloresumen {
    //Metodo creado para la suma de la nota de todos los periodos.
    public static int sumPeriodo(int periodo1, int periodo2, int periodo3)
    {
        return periodo1+periodo2+periodo3;
    }
    //Metodo creado para dividir la suma de las notas de los periodos entre los periodos.
    public static int divSuma(int sum, int periodos)
    {
        return sum/periodos ;
    }
    //Suma de la nota F de todas las materias de un periodo dividido entre el numero de materias.
    public static int calcPeriodos(int sumnotaF, int numM)
    {
        return (sumnotaF*numM)/numM;
    }
    
}
