/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mcd.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Patripon
 */
public class CalculoTest {

    public CalculoTest() {
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
     * Test of setNumero1 method, of class Calculo.
     */
    @Ignore
    @Test
    public void testSetNumero1() {
        System.out.println("setNumero1");
        int numero = -1;
        Calculo instance = new Calculo();
        instance.setNumero1(numero);
        String mensaje = instance.getMensajeResultado();
        System.out.println("mensaje:" + mensaje);
    }

    /**
     * Test of setNumero2 method, of class Calculo.
     */
    @Ignore
    @Test
    public void testSetNumero2() {
        System.out.println("setNumero2");
        int numero = 0;
        Calculo instance = new Calculo();
        instance.setNumero2(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajeResultado method, of class Calculo.
     */
    @Test
    public void testGetMensajeResultado() {
        Calculo instance = new Calculo();
        instance.setNumero1(-1);
        System.out.println("Test mensaje num1 negativo:" + instance.getMensajeResultado());
        instance.setNumero2(-1);
        System.out.println("Test mensaje num2 negativo:" + instance.getMensajeResultado());
        int result = instance.obtenerMCD(36, 60);
        assertEquals(12, result, 0);
        System.out.println("Test mensaje operacion correcta:" + instance.getMensajeResultado());
        result = instance.obtenerMCD(0, 0);
        assertEquals(0, result, 0);
        System.out.println("Test mensaje operacion invalida:" + instance.getMensajeResultado());

    }

    @Ignore
    @Test(expected = AssertionError.class)
    public void testmensaje() {
        Calculo instance = new Calculo();
        System.out.println("salta excepcion");
        int result = instance.obtenerMCD(0, 0);
        assertEquals(0, result, 0);
        System.out.println("eror:" + instance.getMensajeResultado());
    }

    /**
     * Test of getNumero1 method, of class Calculo.
     */
    @Ignore
    @Test
    public void testGetNumero1() {
        System.out.println("getNumero1");
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.getNumero1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero2 method, of class Calculo.
     */
    @Ignore
    @Test
    public void testGetNumero2() {
        System.out.println("getNumero2");
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.getNumero2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 36;
        int num2 = 60;
        Calculo instance = new Calculo();
        int expResult = 12;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result, 0);
    }

}
