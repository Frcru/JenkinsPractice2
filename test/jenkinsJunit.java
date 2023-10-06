/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import Entity.Imprimir;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dcruces
 */
public class jenkinsJunit {

    public jenkinsJunit() {
    }
    static Imprimir print;

    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream outputCaptor = new ByteArrayOutputStream();

    @BeforeClass
    public static void setUpClass() {
        print = new Imprimir();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
            System.setOut(new PrintStream(outputCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(originalSystemOut);
        print.imprimir();
    }
    @Test
    public void testImprimir(){
        print.imprimir();
        assertEquals("Prueba con jenkins y Junit",outputCaptor.toString().trim());
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

}
