public class OperacionesBasicas {
    public static void main(String[] args) {
        System.out.println(dividir(10,0));
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