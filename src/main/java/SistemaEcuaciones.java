import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaEcuaciones {
    public static void main(String[] args) {
        double[][] sistemaEcuaciones = generarSistema();
        llenarMatriz(sistemaEcuaciones);
        mostrarSistema(sistemaEcuaciones);

        double x = encontrarX(sistemaEcuaciones);
        double y = encontrarY(sistemaEcuaciones);

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

    }
    private static double encontrarY(double[][] sistemaEcuaciones) {
        double determinante = calcularDeterminante(sistemaEcuaciones);
        double determinanteY = calcularDeterminanteEnY(sistemaEcuaciones);
        return determinanteY/determinante;
    }
    private static double encontrarX(double[][] sistemaEcuaciones) {
        double determinante = calcularDeterminante(sistemaEcuaciones);
        double determinanteX = calcularDeterminanteEnX(sistemaEcuaciones);
        return determinanteX/determinante;
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
