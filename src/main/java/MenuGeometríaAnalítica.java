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

    private void mostrarMenuOpcionCalculoFigura() {
        System.out.print("""
                ¿Que desea calcular?
                [1] Perímetro
                [2] Área
                Si desea volver escriba [0]
                """.concat("> "));
    }

    private void mostrarMenuOpcionCalculoCuerpo() {
        System.out.print("""
                ¿Que desea calcular?
                [1] Área
                [2] Volumen
                Si desea volver escriba [0]
                """.concat("> "));
    }

    private void mostrarMenuCalculoCuadrado() {
        System.out.print("""
                Usted escogió el cuadrado, los cuadrados
                poseen 4 lados de misma longitud
                Por favor, introduzca la longitud de un lado
                """.concat("Longitud> "));
        double lon = pedirEntradaNumerica();
        mostrarMenuOpcionCalculoFigura();
        int contador = 0;
        do {
            switch (pedirOpcion()) {
                case 0 -> contador++;
                case 1 -> mostrarCalculoPerimetro(GeometriaAnaliticaUtils.
                        calcularPerimetroCuadrilatero(lon, lon, lon, lon));
                case 2 -> mostrarCalculoArea(GeometriaAnaliticaUtils.
                        calcularAreaCuadrilatero(lon, lon));
                default -> mostrarOpcionInvalida();
            }
            mostrarMenuOpcionCalculoFigura();
        } while (contador == 0);
    }

    private void mostrarCalculoPerimetro(double perimetro) {
        System.out.println("\t\t\t\tEl perímetro es: " + perimetro);
    }

    private void mostrarCalculoArea(double area) {
        System.out.println("\t\t\t\tEl área es: " + area);
    }

    private void mostrarCalculoVolumen(double area) {
        System.out.println("\t\t\t\tEl volumen es: " + area);
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
        mostrarMenuOpcionCalculoFigura();
        int contador = 0;
        do {
            switch (pedirOpcion()) {
                case 0 -> contador++;
                case 1 -> mostrarCalculoPerimetro(GeometriaAnaliticaUtils.
                        calcularPerimetroCuadrilatero(lon1, lon1, lon2, lon2));
                case 2 -> mostrarCalculoArea(GeometriaAnaliticaUtils.
                        calcularAreaCuadrilatero(lon1, lon2));
                default -> mostrarOpcionInvalida();
            }
            mostrarMenuOpcionCalculoFigura();
        } while (contador == 0);
    }

    private void mostrarMenuCalculoCirculo() {
        System.out.print("""
                Usted escogió el círculo, los círculos
                poseen un radio de longitud positiva
                Por favor, introduzca el radio del círculo
                """);
        System.out.print("Radio> ");
        double radio = pedirEntradaNumerica();
        mostrarMenuOpcionCalculoFigura();
        int contador = 0;
        do {
            switch (pedirOpcion()) {
                case 0 -> contador++;
                case 1 -> mostrarCalculoPerimetro(GeometriaAnaliticaUtils.
                        calcularPerimetroCirculo(radio));
                case 2 -> mostrarCalculoArea(GeometriaAnaliticaUtils.
                        calcularAreaCirculo(radio));
                default -> mostrarOpcionInvalida();
            }
            mostrarMenuOpcionCalculoFigura();
        } while (contador == 0);
    }

    private void mostrarMenuCalculoEsfera() {
        System.out.print("""
                Usted escogió la esfera, las esferas
                poseen un radio de longitud positiva
                Por favor, introduzca el radio de la esfera
                """);
        System.out.print("Radio> ");
        double radio = pedirEntradaNumerica();
        mostrarMenuOpcionCalculoCuerpo();
        int contador = 0;
        do {
            switch (pedirOpcion()) {
                case 0 -> contador++;
                case 1 -> mostrarCalculoArea(GeometriaAnaliticaUtils.
                        calcularAreaEsfera(radio));
                case 2 -> mostrarCalculoVolumen(GeometriaAnaliticaUtils.
                        calcularVolumenEsfera(radio));
                default -> mostrarOpcionInvalida();
            }
            mostrarMenuOpcionCalculoCuerpo();
        } while (contador == 0);
    }

    private void mostrarMenuCalculoCubo() {
        System.out.print("""
                Usted escogió el cubo, los cubos
                poseen 12 lados de misma longitud
                Por favor, introduzca la longitud de un lado
                """);
        System.out.print("Longitud> ");
        double lado = pedirEntradaNumerica();
        mostrarMenuOpcionCalculoCuerpo();
        int contador = 0;
        do {
            switch (pedirOpcion()) {
                case 0 -> contador++;
                case 1 -> mostrarCalculoArea(GeometriaAnaliticaUtils.
                        calcularAreaCubo(lado));
                case 2 -> mostrarCalculoVolumen(GeometriaAnaliticaUtils.
                        calcularVolumenCubo(lado));
                default -> mostrarOpcionInvalida();
            }
            mostrarMenuOpcionCalculoCuerpo();
        } while (contador == 0);
    }

    private void mostrarMenuCalculoCono() {
        System.out.print("""
                Usted escogió el cono, los conos
                poseen un radio basal y una altura
                Por favor, introduzca el radio y la altura
                """);
        System.out.print("Radio> ");
        double radio = pedirEntradaNumerica();
        System.out.print("Altura> ");
        double altura = pedirEntradaNumerica();
        mostrarMenuOpcionCalculoCuerpo();
        int contador = 0;
        do {
            switch (pedirOpcion()) {
                case 0 -> contador++;
                case 1 -> mostrarCalculoArea(GeometriaAnaliticaUtils.
                        calcularAreaCono(radio, altura));
                case 2 -> mostrarCalculoVolumen(GeometriaAnaliticaUtils.
                        calcularVolumenCono(radio, altura));
                default -> mostrarOpcionInvalida();
            }
            mostrarMenuOpcionCalculoCuerpo();
        } while (contador == 0);
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
        if (entrada <= 0) throw new InputMismatchException();
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
