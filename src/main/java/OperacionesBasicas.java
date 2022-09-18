import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        salirBucle:
        while(true){
            mostrarOpcionesMenu();
            switch (pedirOpcion()) {
                case 0 -> {
                    System.out.println("Hasta pronto");
                    break salirBucle;
                }
                case 1 -> menuSuma();
                case 2-> menuResta();
                case 3 -> menuMultiplicacion();
                case 4 -> menuDivision();
                case 5 -> menuMayor();
                case 6 -> menuMenor();
                case 7 -> menuPotencia();
                case 8 -> menuPorcentaje();
                default -> System.out.println("Por favor, escoja una de las opciones disponibles");
            }
        }
    }

    private static void menuPorcentaje() {
        System.out.print("INGRESE EL NUMERO: ");
        double num1 = pedirOpcionDecimal();
        System.out.print("INGRESE EL PORCENTAJE: ");
        double num2 = pedirOpcionDecimal();
        System.out.println("EL RESULTADO ES : " + calcularPorcentaje(num1, num2));
    }

    private static void menuPotencia() {
        System.out.print("INGRESE LA BASE: ");
        double base = pedirOpcionDecimal();
        System.out.print("INGRESE EL EXPONENTE: ");
        double exponente = pedirOpcionDecimal();
        System.out.println("EL RESULTADO ES : " + elevarNumero(base, exponente));
    }

    private static void menuMenor() {
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        double num1 = pedirOpcionDecimal();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        double num2 = pedirOpcionDecimal();
        System.out.println("EL NUMERO MENOR ES: " + numeroMenor(num1, num2));
    }

    private static void menuMayor() {
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        double num1 = pedirOpcionDecimal();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        double num2 = pedirOpcionDecimal();
        System.out.println("EL NUMERO MAYOR ES: " + numeroMayor(num1, num2));
    }

    private static void menuDivision() {
        System.out.print("INGRESE EL PRIMER DIVIDENDO: ");
        double dividendo = pedirOpcionDecimal();
        System.out.print("INGRESE EL SEGUNDO DIVISOR: ");
        double divisor = pedirOpcionDecimal();
        System.out.println("EL RESULTADO ES: " + dividir(dividendo, divisor));
    }

    private static void menuMultiplicacion() {
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        double num1 = pedirOpcionDecimal();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        double num2 = pedirOpcionDecimal();
        System.out.println("EL RESULTADO ES: " + multiplicar(num1, num2));
    }

    private static void menuResta() {
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        double num1 = pedirOpcionDecimal();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        double num2 = pedirOpcionDecimal();
        System.out.println("EL RESULTADO ES: " + restar(num1, num2));
    }

    private static void menuSuma() {
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        double num1 = pedirValorDecimal();
        System.out.print("INGRESE EL SEGUNDO NUMERO");
        double num2 = pedirValorDecimal();
        System.out.println("EL RESULTADO ES: " + sumar(num1, num2));
    }

    public static double pedirValorDecimal() throws InputMismatchException{
        return new Scanner(System.in).nextDouble();
    }
    public static double pedirOpcionDecimal(){
        try {
            return pedirValorDecimal();
        } catch (InputMismatchException e) {
            System.out.println("Error, ingrese un numero válido");
            return pedirOpcionDecimal();
        }
    }
    public static int pedirValorEntero() throws InputMismatchException {
        return new Scanner(System.in).nextInt();
    }
    public static int pedirOpcion() {
        try {
            return pedirValorEntero();
        } catch (InputMismatchException e) {
            System.out.println("Error, ingrese un numero entero válido");
            return pedirOpcion();
        }
    }
    private static void mostrarOpcionesMenu() {
        System.out.println("[1]Suma entre dos numeros");
        System.out.println("[2]Resta entre dos numeros");
        System.out.println("[3]Multiplicacion entre dos numeros");
        System.out.println("[4]Suma entre dos numeros");
        System.out.println("[5]Mayor entre dos numeros");
        System.out.println("[6]Menor entre dos numeros");
        System.out.println("[7]Potencia de un numero");
        System.out.println("[8]Porcentaje de un numero");
        System.out.println("[0]Salir");
        System.out.print("ELIGE UNA OPCION: ");
    }

    public static double sumar(double num1, double num2){
        return num1+num2;
    }
    public static double restar(double num1, double num2){
        return num1-num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1*num2;
    }
    public static double dividir(double dividendo, double divisor){
        if(divisor == 0){
            return Double.NaN;
        }
        return dividendo/divisor;
    }
    public static double numeroMayor(double num1, double num2){
        return Math.max(num1, num2);
    }
    public static double numeroMenor(double num1, double num2){
        return Math.min(num1, num2);
    }
    public static double elevarNumero(double base, double exponente){
        if(base == 0 && exponente == 0){
            return Double.NaN;
        }
        return Math.pow(base, exponente);
    }
    public static double calcularPorcentaje(double num1, double num2){
        double porcentaje = num2/100;
        return num1*porcentaje;
    }
}