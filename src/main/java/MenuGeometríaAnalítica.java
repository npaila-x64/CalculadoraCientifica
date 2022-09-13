import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuGeometríaAnalítica {

    public void mostrarMenu() {
        mostrarOpciones();
        while (true) {
            switch (pedirOpcion()) {
                case 0 -> System.exit(0);
                case 1 -> mostrarMenuCalculoCuadrado();
                case 2 -> mostrarMenuCalculoRectangulo();
                case 3 -> mostrarMenuCalculoCirculo();
                case 4 -> mostrarMenuCalculoEsfera();
                case 5 -> mostrarMenuCalculoCubo();
                case 6 -> mostrarMenuCalculoCono();
                default -> mostrarOpcionInvalida();
            }
        }
    }

    private void mostrarMenuCalculoCuadrado() {

    }

    private void mostrarMenuCalculoRectangulo() {

    }

    private void mostrarMenuCalculoCirculo() {

    }

    private void mostrarMenuCalculoEsfera() {

    }

    private void mostrarMenuCalculoCubo() {

    }

    private void mostrarMenuCalculoCono() {

    }

    private int pedirValor() throws InputMismatchException {
        return new Scanner(System.in).nextInt();
    }

    private int pedirOpcion() {
        try {
            return pedirValor();
        } catch (InputMismatchException e) {
            mostrarOpcionInvalida();
            return pedirOpcion();
        }
    }

    private void mostrarOpciones() {
        System.out.print("""
                       !!Bienvenido a la calculadora analítica!!
                    ¿Que figura o cuerpo geométrico quiere analizar?
                    Escriba una opción
                    [1] Cuadrado
                    [2] Rectángulo
                    [3] Círculo
                    [4] Esfera
                    [5] Cubo
                    [6] Cono
                    Si desea volver escriba [0]
                    """.concat("> "));
    }

    private void mostrarOpcionInvalida() {
        System.out.print("Por favor, escoja una opción válida\n> ");
    }
}
