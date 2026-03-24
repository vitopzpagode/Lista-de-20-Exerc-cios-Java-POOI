
package exercicio2;

class Onibus extends Veiculo {

    public Onibus(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está transportando passageiros");
    }
}
