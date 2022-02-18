package br.molina;


import java.util.Scanner;

public class Cadastro {
    public void EscreveMedico(Medico m1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do medico: ");
        m1.setNome(sc.nextLine());
        System.out.println("Digite o endereco do medico: ");
        m1.setEndereco(sc.nextLine());
        System.out.println("Digite o telefone do medico: ");
        m1.setTelefone(sc.nextLine());
        System.out.println("Digite a especialidade do medico: ");
        m1.setEspecialidade(sc.nextLine());
        System.out.println("Digite o crm do medico: ");
        m1.setCrm(sc.nextLine());
    }

    public void EscrevePaciente(Paciente p1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do paciente: ");
        p1.setNome(sc.nextLine());
        System.out.println("Digite o endereco do paciente: ");
        p1.setEndereco(sc.nextLine());
        System.out.println("Digite o telefone do paciente: ");
        p1.setTelefone(sc.nextLine());
        System.out.println("Digite o id do convenio do paciente: ");
        p1.setIdConvenio(sc.nextLine());
        System.out.println("Digite o idade do paciente: ");
        p1.setIdade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o peso do paciente: ");
        p1.setPeso(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite o altura do paciente: ");
        p1.setAltura(Float.parseFloat(sc.nextLine()));
    }

}