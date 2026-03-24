
package exercicio2;

class Bicicleta extends Veiculo {

    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está sendo pedalada");
    }
}
