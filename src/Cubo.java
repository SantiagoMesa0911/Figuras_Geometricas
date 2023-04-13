public class Cubo extends Figura {

    private double lado;

    public Cubo(double lado) {
        if (lado > 10) {
            System.out.println("Error: La medida del lado no puede ser mayor a 10 cm.");
            System.exit(0);
        }
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
        calcularVolumen();
    }


    @Override
    public double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 12 * lado;
    }

    @Override
    public double calcularVolumen() {
        return lado * lado * lado;
    }
    @Override
    public void dibujar() {
        System.out.println("Cubo:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Volumen: "+ calcularVolumen());

    }

}
