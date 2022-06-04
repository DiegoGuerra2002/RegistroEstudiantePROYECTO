/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import registro.de.estudiantes.Docentes;

/**
 *
 * @author Agustin
 */
public class docentesTest {
    private static Docentes docentes;
    public docentesTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testgetNombre()
    {
        docentes = new Docentes();
        String expResult = "";
        String result = docentes.getNombre();
        assertEquals(expResult, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
