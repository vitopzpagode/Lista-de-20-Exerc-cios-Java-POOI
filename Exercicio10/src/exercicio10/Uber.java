
package exercicio10;

class Uber extends Transporte {
    private double multiplicador;

    public Uber(int capacidade, String empresa, double tarifaBase, double multiplicador) {
        super(capacidade, empresa, tarifaBase);
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador() { return multiplicador; }
    public void setMultiplicador(double multiplicador) { this.multiplicador = multiplicador; }

    @Override
    public double calcularTarifa() {
        return getTarifaBase() * multiplicador;
    }
}
