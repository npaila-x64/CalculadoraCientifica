public class CalculoRectaLinealUtils {

    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        double pendiente = (y1 - y2)/(x1 - x2);
        return pendiente;
    }

    public static String obtenerEcuacion(double x1, double y1, double x2, double y2) {
        double pendiente = calcularPendiente(x1, y1, x2, y2);
        double intercepcion = -pendiente*x1 + y1;
        return String.format("y=%5.15fx+%5.15f", pendiente, intercepcion);
    }

    public static double calcularInterseccionEjeX(double x1, double y1, double x2, double y2) {
        double pendiente = calcularPendiente(x1, y1, x2, y2);
        double intercepcion = -pendiente*x1 + y1;
        double interseccionX = -intercepcion / pendiente;
        return interseccionX;
    }

    public static double calcularInterseccionEjeY(double x1, double y1, double x2, double y2) {
        double pendiente = calcularPendiente(x1, y1, x2, y2);
        double intercepcion = -pendiente*x1 + y1;
        return intercepcion;
    }
}
