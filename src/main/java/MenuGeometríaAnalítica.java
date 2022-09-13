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
            mostrarOpciones();
        }
    }

    private void mostrarMenuCalcularCuadrilatero() {
        System.out.print("""
                ¿Que desea calcular?
                [1] Perímetro
                [2] Área
                Si desea volver escriba [0]
                """.concat("> "));
    }

    private void mostrarMenuCalculoCuadrado() {
        System.out.print("""
                Usted escogió el cuadrado, los cuadrados poseen 4 lados iguales
                Por favor, introduzca la longitud de un lado
                """.concat("Longitud> "));
        double lon = pedirEntradaNumerica();

        mostrarMenuCalcularCuadrilatero();
        fueraDeBucle:
        while (true) {
            switch (pedirOpcion()) {
                case 0:
                    break fueraDeBucle;
                case 1:
                    mostrarCalculoPerimetro(lon, lon, lon, lon);
                    break;
                case 2:
                    mostrarCalculoArea(lon, lon);
                    break;
                default:
                    mostrarOpcionInvalida();
            }
            mostrarMenuCalcularCuadrilatero();
        }
    }

    private void mostrarCalculoPerimetro(double lon1, double lon2, double lon3, double lon4) {
        double perimetro = GeometriaAnaliticaUtils.
                calcularPerimetroCuadrilatero(lon1, lon2, lon3, lon4);
        System.out.println("\t\t\t\tEl perímetro es: " + perimetro);
    }

    private void mostrarCalculoArea(double lon1, double lon2) {
        double area = GeometriaAnaliticaUtils.
                calcularAreaCuadrilatero(lon1, lon2);
        System.out.println("\t\t\t\tEl área es: " + area);
    }

    private void mostrarMenuCalculoRectangulo() {
        System.out.print("""
                Usted escogió el rectángulo, los
                rectángulos poseen 2 pares de lados iguales
                Por favor, introduzca la longitud de ambos lados
                """);
        System.out.print("1° Longitud> ");
        double lon1 = pedirEntradaNumerica();
        System.out.print("2° Longitud> ");
        double lon2 = pedirEntradaNumerica();
        mostrarMenuCalcularCuadrilatero();
        fueraDeBucle:
        while (true) {
            switch (pedirOpcion()) {
                case 0:
                    break fueraDeBucle;
                case 1:
                    mostrarCalculoPerimetro(lon1, lon1, lon2, lon2);
                    break;
                case 2:
                    mostrarCalculoArea(lon1, lon2);
                    break;
                default:
                    mostrarOpcionInvalida();
            }
            mostrarMenuCalcularCuadrilatero();
        }
    }

    private void mostrarMenuCalculoCirculo() {

    }

    private void mostrarMenuCalculoEsfera() {

    }

    private void mostrarMenuCalculoCubo() {

    }

    private void mostrarMenuCalculoCono() {

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

    private Double pedirValorDoublePositivo() throws InputMismatchException {
        Double entrada = new Scanner(System.in).nextDouble();
        if (entrada < 0) throw new InputMismatchException();
        return entrada;
    }

    private Double pedirEntradaNumerica() {
        try {
            return pedirValorDoublePositivo();
        } catch (InputMismatchException e) {
            mostrarValorInvalido();
            return pedirEntradaNumerica();
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

    private void mostrarValorInvalido() {
        System.out.print("Por favor, escriba un número válido\n> ");
    }
}
