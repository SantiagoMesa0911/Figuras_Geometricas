public class Cuadrado extends Figura {

    public Cuadrado(double lado) {
        if (lado > 10) {
            System.out.println("Error: La medida del lado no puede ser mayor a 10 cm.");
            System.exit(0);
        }
        this.lado = lado;
    }
    private double lado;


    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

    @Override
    public void dibujar() {
        System.out.println("Cuadrado");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}