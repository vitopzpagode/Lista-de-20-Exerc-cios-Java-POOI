
package exercicio19;

class CursoPresencial extends Curso {

    public CursoPresencial(String nome, int cargaHoraria, double valor) {
        super(nome, cargaHoraria, valor);
    }

    @Override
    public double calcularMensalidade() {
        return getValor() * 1.2;
    }
}
