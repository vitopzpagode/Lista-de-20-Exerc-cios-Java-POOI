
package exercicio2;

class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está dirigindo na estrada");
    }
}
