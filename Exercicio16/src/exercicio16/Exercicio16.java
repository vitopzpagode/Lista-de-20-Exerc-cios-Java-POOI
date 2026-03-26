
package exercicio16;


public class Exercicio16 {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("João", 30, "123.456.789-00");

        Pessoa medico = new Medico("Dr. Carlos", 45, "Cardiologia");
        Pessoa enfermeiro = new Enfermeiro("Ana", 35, "Emergência");

        Consulta c1 = new Consulta(paciente, medico, "30/03/2026");
        Consulta c2 = new Consulta(paciente, enfermeiro, "31/03/2026");

        paciente.exibirDados();

        c1.agendarConsulta();
        c1.realizarConsulta();

        c2.agendarConsulta();
        c2.realizarConsulta();
    }
    
}
