import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {
        MenuCalculadora calculadora = new MenuCalculadora();
        calculadora.iniciar();
    }

    public void iniciar() {
        System.out.println("""
                
                Bienvenido/a a la
                   ___      _            _           _                                 \s
                  / __\\__ _| | ___ _   _| | __ _  __| | ___  _ __ __ _                 \s
                 / /  / _` | |/ __| | | | |/ _` |/ _` |/ _ \\| '__/ _` |                \s
                / /__| (_| | | (__| |_| | | (_| | (_| | (_) | | | (_| |                \s
                \\____/\\__,_|_|\\___|\\__,_|_|\\__,_|\\__,_|\\___/|_|  \\__,_|                \s
                                                                                       \s
                                                 ___ _            _   _  __ _          \s
                                                / __(_) ___ _ __ | |_(_)/ _(_) ___ __ _\s
                                               / /  | |/ _ \\ '_ \\| __| | |_| |/ __/ _` |
                                              / /___| |  __/ | | | |_| |  _| | (_| (_| |
                                              \\____/|_|\\___|_| |_|\\__|_|_| |_|\\___\\__,_|
                """);

        salirCalculadora:
        while (true) {
            mostrarOpciones();
            switch (pedirOpcion()) {
                case 0 -> {break salirCalculadora;}
                case 1 -> OperacionesBasicas.menuPrincipal();
                case 2 -> Calculadora.resolverCuadratica();
                case 3 -> new MenuGeometriaAnalitica().mostrarMenu();
                case 4 -> SistemaEcuaciones.menuResolucionSistema();
                case 5 -> new MenuCalculoRectaLineal().mostrarMenu();
                default -> mostrarOpcionInvalida();
            }
        }

    }


    private void mostrarOpciones() {
        System.out.print("""
                    
                    ¿Que aspecto de las matemáticas desea indagar?
                    Escriba una opción
                    [1] Operaciones matemáticas básicas
                    [2] Solucionador de ecuación cuadrática
                    [3] Analizador geométrico
                    [4] Solucionador de sistema de ecuaciones en dos variables
                    [5] Calculador de recta lineal
                    Si desea salir escriba [0]
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

    private void mostrarOpcionInvalida() {
        System.out.print("Por favor, escoja una opción válida\n> ");
    }
}
