import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaEcuacionesTest {

    @Test
    @DisplayName("Prueba unitaria llenarMatriz caso entrada nula")
    public void llenarMatrizTestCasoNulo(){
        assertThrows(NullPointerException.class, () ->
                SistemaEcuaciones.llenarMatriz(null), "Se ha ingresado una entrada nula");
    }

    @Test
    @DisplayName("Prueba unitaria llenarMatriz caso entrada nula")
    public void mostrarSistemaTestCasoNulo(){
        assertThrows(NullPointerException.class, () ->
                SistemaEcuaciones.mostrarSistema(null), "Se ha ingresado una entrada nula");
    }

    @Test
    @DisplayName("Prueba unitaria calcularDeterminante caso entrada nula")
    public void calcularDeterminanteTestCasoNulo(){
        assertThrows(NullPointerException.class, () ->
                SistemaEcuaciones.calcularDeterminante(null), "Se ha ingresado una entrada nula");
    }

    @Test
    @DisplayName("Prueba unitaria calcularDeterminanteEnX caso entrada nula")
    public void calcularDeterminanteEnXTestCasoNulo(){
        assertThrows(NullPointerException.class, () ->
                SistemaEcuaciones.calcularDeterminanteEnX(null), "Se ha ingresado una entrada nula");
    }

    @Test
    @DisplayName("Prueba unitaria calcularDeterminanteEnY caso entrada nula")
    public void calcularDeterminanteEnYTestCasoNulo(){
        assertThrows(NullPointerException.class, () ->
                SistemaEcuaciones.calcularDeterminanteEnY(null), "Se ha ingresado una entrada nula");
    }

    @Test
    @DisplayName("Prueba unitaria noHaySolucion para caso verdadero")
    public void noHaySolucionTestCasoVerdadero(){
        assertTrue(SistemaEcuaciones.noHaySolucion(0,1,2));
    }

    @Test
    @DisplayName("Prueba unitaria noHaySolucion para caso falso")
    public void noHaySolucionTestCasoFalso(){
        assertFalse(SistemaEcuaciones.noHaySolucion(0,0,0));
    }

    @Test
    @DisplayName("Prueba unitaria hayInfinitasSoluciones para caso verdadero")
    public void hayInfinitasSolucionesTestCasoVerdadero(){
        assertTrue(SistemaEcuaciones.hayInfinitasSoluciones(0,0,0));
    }

    @Test
    @DisplayName("Prueba unitaria hayInfinitasSoluciones para caso falso")
    public void hayInfinitasSolucionesTestCasoFalso(){
        assertFalse(SistemaEcuaciones.hayInfinitasSoluciones(1,0,0));
    }

    @Test
    @DisplayName("Prueba unitaria resolverSistema caso entrada nula")
    public void resolverSistemaTestCasoNulo(){
        assertThrows(NullPointerException.class, () ->
                SistemaEcuaciones.resolverSistema(null), "Se ha ingresado una entrada nula");
    }

}
