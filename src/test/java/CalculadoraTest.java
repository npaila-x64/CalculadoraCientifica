import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {


    @DisplayName("Prueba determinante con valor nulo")
    @Test
    public void testDiscriminanteEcuacionValorNulo() {
        Double[] test = {0.2, null, 0.5};
        assertThrows(InputMismatchException.class,
                () -> Calculadora.discriminanteEcuacion(test),
                "Hay un valor nulo presente");
    }

    @DisplayName("Prueba para validar los coeficientes numéricos, con término cuadrático igual a 0")
    @Test
    public void testValidarCoeficientesNumericosA0(){
        Double[] test = {0.0, 1.2, 7.0};
        assertFalse(Calculadora.validarCoeficientesNumericos(test));
    }





