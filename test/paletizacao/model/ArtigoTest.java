/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mac
 */
public class ArtigoTest {
    
    public ArtigoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of gramasParaUnidade method, of class Artigo.
     */
    @Test
    public void testGramasParaUnidade() {
        System.out.println("gramasParaUnidade");
        double gram = 0.0;
        Artigo instance = new Artigo();
        double expResult = 0.0;
        double result = instance.gramasParaUnidade(gram);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gramasParaCaixas method, of class Artigo.
     */
    @Test
    public void testGramasParaCaixas() {
        System.out.println("gramasParaCaixas");
        double gr = 0.0;
        Artigo instance = new Artigo();
        double expResult = 0.0;
        double result = instance.gramasParaCaixas(gr);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kilogramaParaCaixas method, of class Artigo.
     */
    @Test
    public void testKilogramaParaCaixas() {
        System.out.println("kilogramaParaCaixas");
        double kg = 0.0;
        Artigo instance = new Artigo();
        double expResult = 0.0;
        double result = instance.kilogramaParaCaixas(kg);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volumePorGrama method, of class Artigo.
     */
    @Test
    public void testVolumePorGrama() {
        System.out.println("volumePorGrama");
        double gramas = 0.0;
        Artigo instance = new Artigo();
        double expResult = 0.0;
        double result = instance.volumePorGrama(gramas);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volumePorKiloGrama method, of class Artigo.
     */
    @Test
    public void testVolumePorKiloGrama() {
        System.out.println("volumePorKiloGrama");
        double kg = 0.0;
        Artigo instance = new Artigo();
        double expResult = 0.0;
        double result = instance.volumePorKiloGrama(kg);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
