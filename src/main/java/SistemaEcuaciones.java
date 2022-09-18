import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaEcuaciones {
    public static void main(String[] args) {
        menuResolucionSistema();
    }

    private static void menuResolucionSistema() {
        double[][] sistemaEcuaciones = generarSistema();
        llenarMatriz(sistemaEcuaciones);
        mostrarSistema(sistemaEcuaciones);
        resolverSistema(sistemaEcuaciones);
    }

    private static void resolverSistema(double[][] sistemaEcuaciones) {
        double determinante = calcularDeterminante(sistemaEcuaciones);
        double determinanteY = calcularDeterminanteEnY(sistemaEcuaciones);
        double determinanteX = calcularDeterminanteEnX(sistemaEcuaciones);

        if(noHaySolucion(determinante, determinanteX, determinanteY)){
            System.out.println("EL SISTEMA NO TIENE SOLUCION");
            return;
        }
        if(hayInfinitasSoluciones(determinante, determinanteX, determinanteY)){
            System.out.println("EL SISTEMA TIENE INFINITAS SOLUCIONES");
            return;
        }
        double x = determinanteX/determinante;
        double y = determinanteY/determinante;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    private static boolean hayInfinitasSoluciones(double determinante, double determinanteX, double determinanteY) {
        return (determinante == 0 && determinanteX == 0 && determinanteY ==0);
    }

    private static boolean noHaySolucion(double determinante, double determinanteX, double determinanteY) {
        return (determinante == 0 && determinanteX != 0 || determinanteY !=0);
    }

    public static double calcularDeterminanteEnY(double[][] sistemaEcuaciones){
        double coeficienteX1 = sistemaEcuaciones[0][0];
        double coeficienteLibre1 = sistemaEcuaciones[0][2];
        double coeficienteX2 = sistemaEcuaciones[1][0];
        double coeficienteLibre2 = sistemaEcuaciones[1][2];

        return (coeficienteX1 * coeficienteLibre2)-(coeficienteLibre1 * coeficienteX2);
    }

    public static double calcularDeterminanteEnX(double[][] sistemaEcuaciones){
        double coeficienteLibre1 = sistemaEcuaciones[0][2];
        double coeficienteY1 = sistemaEcuaciones[0][1];
        double coeficienteLibre2 = sistemaEcuaciones[1][2];
        double coeficienteY2 = sistemaEcuaciones[1][1];

        return (coeficienteLibre1 * coeficienteY2)-(coeficienteY1 * coeficienteLibre2);
    }

    public static double calcularDeterminante(double[][] sistemaEcuaciones){
        double coeficienteX1 = sistemaEcuaciones[0][0];
        double coeficienteY1 = sistemaEcuaciones[0][1];
        double coeficienteX2 = sistemaEcuaciones[1][0];
        double coeficienteY2 = sistemaEcuaciones[1][1];

        return (coeficienteX1 * coeficienteY2)-(coeficienteY1 * coeficienteX2);
    }
    private static void mostrarSistema(double[][] sistemaEcuaciones) {
        for (double[] ecuacion : sistemaEcuaciones) {
            System.out.print(ecuacion[0] + "X ");
            System.out.print(ecuacion[1] + "Y ");
            System.out.print( "= "+ ecuacion[2]);
            System.out.println();
        }
    }
    public static void llenarMatriz(double[][] sistema){
        for (int ecuacion = 0; ecuacion < sistema.length; ecuacion++) {
            System.out.println("ECUACION " + (ecuacion+1));
            System.out.print("COEFICIENTE X: ");
            sistema[ecuacion][0] = pedirOpcionDecimal();
            System.out.print("COEFICIENTE Y: ");
            sistema[ecuacion][1] = pedirOpcionDecimal();
            System.out.print("COEFICIENTE LIBRE: ");
            sistema[ecuacion][2] = pedirOpcionDecimal();
        }
    }
    public static double[][] generarSistema(){
        return new double[2][3];
    }
    public static double pedirOpcionDecimal(){
        try {
            return pedirValorDecimal();
        } catch (InputMismatchException e) {
            System.out.println("Error, ingrese un numero válido");
            return pedirOpcionDecimal();
        }
    }
    public static double pedirValorDecimal() throws InputMismatchException {
        return new Scanner(System.in).nextDouble();
    }
}
