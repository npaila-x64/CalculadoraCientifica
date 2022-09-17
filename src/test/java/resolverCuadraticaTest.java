import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.*;

class resolverCuadraticaTest {

    @DisplayName("Se prepara un objeto representante de la clase, para no cambiar los atributos de los métodos.")
    @BeforeEach
    public void setUp() {
        resolverCuadratica resolverCuadratica = new resolverCuadratica();
    }

    @DisplayName("Prueba discriminante con valor nulo")
    @Test
    public void testDiscriminanteEcuacionValorNulo() {
        Double[] test = {0.2, null, 0.5};
        assertThrows(NullPointerException.class,
                () -> resolverCuadratica.discriminante(test),
                "Hay un valor nulo presente");
    }

    @DisplayName("Prueba discriminante con arreglo de tamaño menor al esperado")
    @Test
    public void testDiscriminanteArregloMenorDimension() {
        Double[] test = {0.2,0.2};
        assertThrows(ArrayIndexOutOfBoundsException.class,
                    () -> resolverCuadratica.discriminante(test),
                    "El arreglo posee un tamaño menor al esperado.");
    }

    @DisplayName("Validación de coeficiente numérico con variables del tipo null")
    @Test
    public void testValidarCoeficientesNumericosNull(){
        Double[] test = {null,0.2,2.5};
        assertThrows(NullPointerException.class,
                () -> resolverCuadratica.validarCoeficientesNumericos(test),
                "Hay un valor nulo en el arreglo.");
    }

    @DisplayName("Validacion de coeficiente numérico con arreglo de tamaño distinto")
    @Test
    public void testValidarCoeficientesNumericosDistintoTamaño() {
        Double[] test = {0.2,0.1,0.3,0.1};
        assertFalse(resolverCuadratica.validarCoeficientesNumericos(test));
    }

    @DisplayName("Obtener soluciones cuando a = 0")
    @Test
    public void testObtenerSolucionesCuadraticasA0() {
        Double[] test = {0.0,3.1,2.2};
        assertThrows(ArithmeticException.class,
                () -> resolverCuadratica.obtenerSolucionesCuadraticas(test),
                "Hubo división por cero.");
    }

    @DisplayName("Obtener soluciones cuando el vector de doubles tiene un tamaño menor a 3")
    @Test
    public void testObtenerSolucionesCuadraticasVectorPequeño() {
        Double[] test = {1.1};
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> resolverCuadratica.obtenerSolucionesCuadraticas(test),
                "No se puede acceder a alguna posición del arreglo");
    }

    @DisplayName("Mostrar soluciones cuando el vector tiene un tamaño inferior a 2")
    @Test
    public void testMostrarSolucionesVectorInfimo() {
        Double[] test = {0.2};
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> resolverCuadratica.mostrarSoluciones(test),
                "No se puede acceder a ciertas posiciones del vector.");
    }

}