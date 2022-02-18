package br.molina;

public class Registro {
    Medico medico = new Medico();
    Paciente paciente = new Paciente();

    public void MostrarMedicos(Medico m1){
        System.out.println("--------Medico-------");
        System.out.println("Nome: " + m1.getNome());
        System.out.println("Telefone: " + m1.getTelefone());
        System.out.println("Especialidade: " + m1.getEspecialidade());
        System.out.println("Crm: " + m1.getCrm());
        System.out.println("----------------------");
    }

    public void MostrarPaciente(Paciente p1){
        System.out.println("-------Paciente-------");
        System.out.println("Id-Convênio: " + p1.getIdConvenio());
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso()+ "Kg");
        System.out.println("Altura: " + p1.getAltura() + "cm");
        System.out.println("Telefone: " + "+55 " + p1.getTelefone());
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("----------------------");

    }
}
