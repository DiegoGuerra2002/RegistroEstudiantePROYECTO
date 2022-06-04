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
public class CicloresumenTest {
    
    public CicloresumenTest() {
    }

    /**
     * Test of sumPeriodo method, of class Cicloresumen.
     */
    @Test
    public void testSumPeriodo() {
        System.out.println("sumPeriodo");
        int periodo1 = 10;
        int periodo2 = 10;
        int periodo3 = 7;
        int expResult = 27;
        int result = Cicloresumen.sumPeriodo(periodo1, periodo2, periodo3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("A ocurrido un error");
    }

    /**
     * Test of divSuma method, of class Cicloresumen.
     */
    @Test
    public void testDivSuma() {
        System.out.println("divSuma");
        int sum = 27;
        int periodos = 3;
        int expResult = 9;
        int result = Cicloresumen.divSuma(sum, periodos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("A ocurrido un error");
    }

    /**
     * Test of calcPeriodos method, of class Cicloresumen.
     */
    @Test
    public void testCalcPeriodos() {
        System.out.println("calcPeriodos");
        int sumnotaF = 10;
        int numM = 4;
        int expResult = 10;
        int result = Cicloresumen.calcPeriodos(sumnotaF, numM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("A ocurrido un error");
    }
    
}
