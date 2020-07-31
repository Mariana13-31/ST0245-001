
public class EjecutarPunto
{
    public static void main(String[] args) {
        Punto p = new Punto(10, 20);
        System.out.printf("Punto: " + p.obtX() + p.obtY());
        System.out.println("La coordenada x es: " + p.obtX());
        System.out.println("La coordenada y es: " + p.obtY());
        System.out.println("Radio Polar: " + p.radioPolar());
        System.out.println("Angulo Polar: " + p.anguloPolar());
        System.out.println("Distancia Euclidiana: " + p.distanciaEuclidiana(new Punto(0, 0)));

    }
}
