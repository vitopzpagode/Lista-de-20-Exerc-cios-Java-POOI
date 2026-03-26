
package exercicio19;

class CursoTecnico extends Curso {

    public CursoTecnico(String nome, int cargaHoraria, double valor) {
        super(nome, cargaHoraria, valor);
    }

    @Override
    public double calcularMensalidade() {
        return getValor() / 12;
    }
}
