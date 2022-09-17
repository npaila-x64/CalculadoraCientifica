import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoRectaLinealUtilsTest {

    @Test
    void calcularPendienteTest() {
        double x1 = 3; double y1 = 3; double x2 = 1; double y2 = 1;
        double pendienteCalculada = CalculoRectaLinealUtils.calcularPendiente(x1, y1, x2, y2);
        double pendienteReal = 1;
        assertEquals(pendienteReal, pendienteCalculada);
    }

    @Test
    void obtenerEcuacionTest() {
        double x1 = 1; double y1 = 2; double x2 = -2; double y2 = 3;
        String ecuacionReal = "y = -0.333333333333333x + 2.333333333333334";
        String ecuacionObtenida = CalculoRectaLinealUtils.obtenerEcuacion(x1, y1, x2, y2);
        assertEquals(ecuacionReal, ecuacionObtenida);
    }

    @Test
    void calcularInterseccionEjeXTest() {
        double x1 = 1; double y1 = 2; double x2 = -2; double y2 = 3;
        double interseccionReal = 7;
        double interseccionObtenida = CalculoRectaLinealUtils.calcularInterseccionEjeX(x1, y1, x2, y2);
        assertEquals(interseccionReal, interseccionObtenida, 1e-15);
    }

    @Test
    void calcularInterseccionEjeYTest() {
        double x1 = 0; double y1 = 2; double x2 = 1; double y2 = 6;
        double interseccionReal = 2;
        double interseccionObtenida = CalculoRectaLinealUtils.calcularInterseccionEjeY(x1, y1, x2, y2);
        assertEquals(interseccionReal, interseccionObtenida, 1e-6);
    }
}