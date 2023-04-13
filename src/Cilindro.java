class Cilindro extends Figura {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        if (radio > 10 || altura > 10) {
            System.out.println("Error: La medida del radio o la altura es mayor a 10 cm.");
            System.exit(0);
        }


        this.radio = radio;
        this.altura = altura;
    }



    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public double calcularVolumen() {
        return Math.PI * radio * radio * altura;
    }

    public void dibujar() {
        System.out.println("Cilindro:");
        System.out.println("Radio: " + radio);
        System.out.println("Altura: " + altura);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
}