
package exercicio2;

class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está acelerando pela rua");
    }
}
