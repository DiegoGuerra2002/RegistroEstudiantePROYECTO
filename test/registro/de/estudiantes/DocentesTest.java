/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package registro.de.estudiantes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agustin
 */
public class DocentesTest {
    
    public DocentesTest() {
    }

    /**
     * Test of getSección method, of class Docentes.
     */

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Docentes instance = new Docentes();
        String expResult = "Diego";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
