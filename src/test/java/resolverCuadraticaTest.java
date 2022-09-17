import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.*;

class resolverCuadraticaTest {

    @DisplayName("Prueba determinante con valor nulo")
    @Test
    public void testDiscriminanteEcuacionValorNulo() {
        Double[] test = {0.2, null, 0.5};
        assertThrows(NullPointerException.class,
                () -> resolverCuadratica.discriminante(test),
                "Hay un valor nulo presente");
    }

    @DisplayName("Prueba determinante con arreglo de tamaño menor al esperado")
    @Test
    public void testDiscriminanteArregloMenorDimension() {
        Double[] test = {0.2,0.2};
        assertThrows(ArrayIndexOutOfBoundsException.class,
                    () -> resolverCuadratica.discriminante(test),
                    "El arreglo posee un tamaño menor al esperado.");
    }



}