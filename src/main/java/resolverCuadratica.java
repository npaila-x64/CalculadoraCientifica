import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class resolverCuadratica {

    public void resolverCuadratica() {
        Double[] coeficientesNumericos = obtenerCoeficientesNumericos();
        if (discriminante(coeficientesNumericos) >= 0) {
            Double[] soluciones = obtenerSolucionesCuadraticas(coeficientesNumericos);
            mostrarSoluciones(soluciones);
        } else {
            System.out.println("La ecuación no tiene solución en los reales.");
        }
    }
    public static Double[] obtenerSolucionesCuadraticas(Double[] coeficientesNumericos) {
        Double[] soluciones = new Double[2];

        try {
            Double discriminante = discriminante(coeficientesNumericos);

            Double a = coeficientesNumericos[0];
            Double b = coeficientesNumericos[1];
            Double c = coeficientesNumericos[2];

            soluciones[0] = (-b + Math.sqrt(discriminante)) / 2*a;
            soluciones[1] = (-b - Math.sqrt(discriminante)) / 2*a;
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El arreglo de coeficientes numéricos no tiene suficientes valores.");
        }
        catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }

        finally {
            return soluciones;
        }
    }

    public static void mostrarSoluciones(Double[] soluciones) {
        try {
            if (Objects.equals(soluciones[0], soluciones[1])) {
                System.out.println("El sistema tiene una sola solución, y es " + soluciones[0]);
            } else {
                System.out.println("El sistema posee dos soluciones, " + soluciones[0] + " y " + soluciones[1]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No hay suficientes términos en el vector");
        }
        catch (NullPointerException e) {
            System.out.println("Hay valores nulos dentro de las soluciones");
        }
    }

    public static Double discriminante(Double[] coeficientesNumericos) {
        Double discriminante = -1.0;
        try {
            Double a = coeficientesNumericos[0];
            Double b = coeficientesNumericos[1];
            Double c = coeficientesNumericos[2];
            discriminante = b * b - 4 * a * c;
        }
        catch (NullPointerException e) {
            System.out.println("Uno de los valores introducidos es nulo.");
            throw e;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El arreglo de entrada no tiene los suficientes valores.");
            throw e;
        }
        finally {
            return discriminante;
        }
    }

    public static boolean validarCoeficientesNumericos(Double[] coeficientesNumericos) {
        try {
            return (coeficientesNumericos[0] != 0) && (coeficientesNumericos.length == 3);
        }
        catch (InputMismatchException e) {
            System.out.println("El arreglo posee un valor inválido");
            return false;
        }
        catch (NullPointerException e) {
            System.out.println("Hay un valor nulo en el vector");
            return false;
        }
    }

    public Double[] obtenerCoeficientesNumericos() {
        Double[] coeficientesNumericos = new Double[3];
        try {
            System.out.println ("Ingrese el coeficiente numérico del termino cuadrático (Distinto de cero):");
            coeficientesNumericos[0] = preguntarDouble();

            System.out.println("Ingrese el coeficiente numérico del término lineal:");
            coeficientesNumericos[1] = preguntarDouble();

            System.out.println("Ingrese una constante:");
            coeficientesNumericos[2] = preguntarDouble();

            return validarCoeficientesNumericos(coeficientesNumericos)
                    ? coeficientesNumericos : obtenerCoeficientesNumericos();
        }
        catch (InputMismatchException e) {
            System.out.println("No has ingresado un valor correspondiente (Double)");
            return obtenerCoeficientesNumericos();
        }
    }

    public Double preguntarDouble() {
        Scanner input = new Scanner(System.in);
        try {
            double numero = input.nextDouble();
            return numero;
        }
        catch (InputMismatchException e) {
            System.out.println("No se ha introducido un decimal.");
            return preguntarDouble();
        }
    }

}
