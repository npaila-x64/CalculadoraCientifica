import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OperacionesBasicasTest {
    @Test
    @DisplayName("Prueba unitaria suma")
    public void sumarTest(){
        assertEquals(OperacionesBasicas.sumar(1, 5), 6);
        assertEquals(OperacionesBasicas.sumar(1, -5), -4);
        assertEquals(OperacionesBasicas.sumar(1,0), 1);
    }

    @Test
    @DisplayName("Prueba unitaria resta")
    public void restarTest(){
        assertEquals(OperacionesBasicas.restar(1,-3),4);
    }

    @Test
    @DisplayName("Prueba unitaria multiplicacion")
    public void multiplicarTest(){
        assertEquals(OperacionesBasicas.multiplicar(5, 3), 15);
    }

    @Test
    @DisplayName("Prueba unitaria division")
    public void dividirTest(){
        assertEquals(OperacionesBasicas.dividir(10, 2), 5);
    }
    @Test
    @DisplayName("Prueba unitaria division por cero con dividendo positivo")
    public void dividirTestDivisionPorCero(){
        assertEquals(OperacionesBasicas.dividir(10, 0), Double.NaN);
    }
    @Test
    @DisplayName("Prueba unitaria numero mayor")
    public void numeroMayorTest(){
        assertEquals(OperacionesBasicas.numeroMayor(10, 3), 10);
    }
    @Test
    @DisplayName("Prueba unitaria numero menor")
    public void numeroMenorTest(){
        assertEquals(OperacionesBasicas.numeroMenor(10, 3), 3);
    }
    @Test
    @DisplayName("Prueba unitaria numeros menor dados numeros iguales")
    public void numeroMenorTestNumerosIguales(){
        assertEquals(OperacionesBasicas.numeroMenor(10, 10), 10);
    }

    @Test
    @DisplayName("Prueba unitaria elevar numero por otro")
    public void elevarNumeroTest(){
        assertEquals(OperacionesBasicas.elevarNumero(4, 2), 16);
    }
    @Test
    @DisplayName("Prueba unitaria elevar cero por cero")
    public void elevarNumeroTestElevarCeroEnCero(){
        assertEquals(OperacionesBasicas.elevarNumero(0, 0), Double.NaN);
    }

    @Test
    @DisplayName("Prueba unitaria sacar porcentaje de un numero")
    public void calcularPorcentajeTest(){
        assertEquals(OperacionesBasicas.calcularPorcentaje(100, 50), 50);
    }

}