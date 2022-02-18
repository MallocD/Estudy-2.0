package br.molina;

public class Main {
    public static void main(String[] args) {
        Registro r1 = new Registro();
        Cadastro c1 = new Cadastro();
        Medico m1 = new Medico();
        Paciente p1 = new Paciente();

        System.out.println("Informações sobre o Médico\n");
        c1.EscreveMedico(m1);
        System.out.println("Informaçõe sobre o Paciente\n");
        c1.EscrevePaciente(p1);

        r1.MostrarMedicos(m1);
        r1.MostrarPaciente(p1);

    }
}
