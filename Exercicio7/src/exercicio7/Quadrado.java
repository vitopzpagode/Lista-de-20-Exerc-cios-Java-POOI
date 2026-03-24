
package exercicio7;

class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
