import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometriaAnaliticaUtilsTest {

    @Test
    void verificaCalcularPerimetroCuadrilateroTest() {
        double perimetro = GeometriaAnaliticaUtils.calcularPerimetroCuadrilatero(2, 1, 5.5, 1.6);
        assertEquals(10.1, perimetro, 1e-15);
    }

    @Test
    void verificaCalcularAreaCuadrilateroTest() {
        double area = GeometriaAnaliticaUtils.calcularAreaCuadrilatero(2.2, 4.5);
        assertEquals(9.9, area, 1e-15);
    }

    @Test
    void verificaCalcularPerimetroCirculoTest() {
        double perimetro = GeometriaAnaliticaUtils.calcularPerimetroCirculo(4.2);
        assertEquals(26.389378290154262, perimetro, 1e-15);
    }

    @Test
    void verificaCalcularAreaCirculoTest() {
        double perimetro = GeometriaAnaliticaUtils.calcularAreaCirculo(4.2);
        assertEquals(55.41769440932395, perimetro, 1e-15);
    }

    @Test
    void verificaCalcularAreaCuboTest() {
        double area = GeometriaAnaliticaUtils.calcularAreaCubo(5);
        assertEquals(150, area, 1e-15);
    }

    @Test
    void verificaCalcularPerimetroCuboTest() {
        double area = GeometriaAnaliticaUtils.calcularPerimetroCubo(2);
        assertEquals(24, area, 1e-15);
    }

    @Test
    void verificaCalcularAreaEsferaTest() {
        double area = GeometriaAnaliticaUtils.calcularAreaEsfera(4);
        assertEquals(201.06192982974676, area, 1e-15);
    }

    @Test
    void verificaCalcularAreaConoTest() {
        double area = GeometriaAnaliticaUtils.calcularAreaCono(2, 1);
        assertEquals(26.616000076440628, area, 1e-15);
    }

    @Test
    void verificaCalcularVolumenEsferaTest() {
        double volumen = GeometriaAnaliticaUtils.calcularVolumenEsfera(3);
        assertEquals(113.09733552923254, volumen, 1e-15);
    }

    @Test
    void verificaCalcularVolumenCuboTest() {
        double volumen = GeometriaAnaliticaUtils.calcularVolumenCubo(2.5);
        assertEquals(15.625, volumen, 1e-15);
    }

    @Test
    void verificaCalcularVolumenConoTest() {
        double volumen = GeometriaAnaliticaUtils.calcularVolumenCono(2, 1);
        assertEquals(4.1887902047863905, volumen, 1e-15);
    }
}