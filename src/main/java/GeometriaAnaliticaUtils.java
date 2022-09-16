public class GeometriaAnaliticaUtils {

    public static double calcularPerimetroCuadrilatero(double l1, double l2, double l3, double l4) {
        return l1+l2+l3+l4;
    }

    public static double calcularAreaCuadrilatero(double l1, double l2) {
        return l1*l2;
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2.0*Math.PI*radio;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI*Math.pow(radio, 2.0);
    }

    public static double calcularAreaCubo(double lado) {
        return 6.0*Math.pow(lado, 2.0);
    }

    public static double calcularAreaEsfera(double radio) {
        return 4.0*Math.PI*Math.pow(radio, 2.0);
    }

    public static double calcularAreaCono(double radio, double altura) {
        return Math.PI*radio*Math.pow(
                Math.pow(radio, 2.0)+Math.pow(altura, 2.0), 0.5)+Math.PI*Math.pow(radio, 2.0);
    }

    public static double calcularPerimetroCubo(double lado) {
        return 12.0*lado;
    }

    public static double calcularVolumenEsfera(double radio) {
        return (4.0/3.0)*Math.PI*Math.pow(radio, 3.0);
    }

    public static double calcularVolumenCubo(double lado) {
        return Math.pow(lado, 3.0);
    }

    public static double calcularVolumenCono(double radio, double altura) {
        return Math.PI*Math.pow(radio, 2.0)*(altura/3.0);
    }
}
