import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCalculoRectaLineal {

    public void mostrarMenu() {
        mostrarOpciones();
        salirBucle:
        while (true) {
            switch (pedirOpcion()) {
                case 0 -> {break salirBucle;}
                case 1 -> mostrarMenuCalculoRectaLineal();
                default -> mostrarOpcionInvalida();
            }
            mostrarOpciones();
        }
    }

    private void mostrarMenuCalculoRectaLineal() {
        System.out.print("""
                Una recta lineal es un conjunto infinito de puntos cuyas
                coordenadas cumplen con la siguiente ecuación: y = mx + b
                Para obtener la ecuación una recta lineal se
                necesita a lo menos dos puntos; (x1,y1) y (x2,y2)
                """);
        System.out.print("x1> ");
        double x1 = pedirEntradaNumerica();
        System.out.print("y1> ");
        double y1 = pedirEntradaNumerica();
        System.out.print("x2> ");
        double x2 = pedirEntradaNumerica();
        System.out.print("y2> ");
        double y2 = pedirEntradaNumerica();
        String ecuacion = CalculoRectaLinealUtils.obtenerEcuacion(x1, y1, x2, y2);
        System.out.println("\nLa ecuación es ".concat(ecuacion));
    }

    private void mostrarOpciones() {
        System.out.print("""
                    
                       !!Bienvenido a la calculadora de recta lineal!!
                    
                    Para empezar a calcular rectas escriba [1]
                    Si desea volver escriba [0]
                    """.concat("> "));
    }

    private int pedirValorEntero() throws InputMismatchException {
        return new Scanner(System.in).nextInt();
    }

    private int pedirOpcion() {
        try {
            return pedirValorEntero();
        } catch (InputMismatchException e) {
            mostrarOpcionInvalida();
            return pedirOpcion();
        }
    }

    private Double pedirValorDouble() throws InputMismatchException {
        Double entrada = new Scanner(System.in).nextDouble();
        return entrada;
    }

    private Double pedirEntradaNumerica() {
        try {
            return pedirValorDouble();
        } catch (InputMismatchException e) {
            mostrarValorInvalido();
            return pedirEntradaNumerica();
        }
    }

    private void mostrarOpcionInvalida() {
        System.out.print("Por favor, escoja una opción válida\n> ");
    }

    private void mostrarValorInvalido() {
        System.out.print("Por favor, escriba un número válido\n> ");
    }
}
