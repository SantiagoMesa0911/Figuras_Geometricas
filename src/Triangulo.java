public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(double lado1, double lado2, double lado3) {
        if (lado1 > 10 || lado2 > 10  || lado3 > 10) {
            System.out.println("Error: La medida de uno de los lados supera los  10 cm.");
            System.exit(0);
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String determinarTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularVolumen() {
        return 0; // El triángulo no tiene volumen
    }
    public void dibujar() {
        System.out.println("Triangulo:");
        System.out.println("Tipo de Triangulo: " + determinarTipo());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());

    }

}
