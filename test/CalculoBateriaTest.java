package mcd;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;

@RunWith(Parameterized.class)
public class CalculoBateriaTest {

    private int expectedResult;
    private int numero1;
    private int numero2;
    private Calculo calculo;

    @Before
    public void initialize() {
        calculo = new Calculo();
    }

    public CalculoBateriaTest(int numero1, int numero2, int expectedResult) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection mcdNumbers() {
        return Arrays.asList(new Object[][]{
            {36, 60, 12},
            {42, 56, 14},
            {48, 60, 12},
            {5, 7, 1}

        });
    }

    @Test
    public void testCalculoMCD() {
        System.out.println("Parameterized Numbers are : " + numero1 + " " + numero2);
        assertEquals(expectedResult, calculo.obtenerMCD(numero1, numero2), 0);

    }
}
