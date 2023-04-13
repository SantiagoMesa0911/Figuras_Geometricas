public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("------------------------");
        // Creamos un objeto Cuadrado y lo dibujamos
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.dibujar();
        System.out.println("------------------------");
        System.out.println();

        // Creamos un objeto Rectangulo y lo dibujamos
        Rectangulo rectangulo = new Rectangulo(4, 6);
        rectangulo.dibujar();
        System.out.println("------------------------");

        System.out.println("");
        // Creamos un objeto Cilindro y lo dibujamos
        Cilindro cilindro = new Cilindro(3,10);
        cilindro.dibujar();
        System.out.println("------------------------");

        System.out.println("");
        // Creamos un objeto Cubo y lo dibujamos
        Cubo cubo = new Cubo(5);
        cubo.dibujar();
        System.out.println("------------------------");

        System.out.println("");
        // Creamos un objeto Triangulo y lo dibujamos
        Triangulo t1 = new Triangulo(3, 4, 5);
        t1.dibujar();
        System.out.println("------------------------");

        Triangulo t2 = new Triangulo(5, 5, 5);
        t2.dibujar();
        System.out.println("------------------------");

    }
}

