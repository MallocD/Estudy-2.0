package br.molina;

public class Medico extends Pessoa{
    private String crm;
    private String especialidade;


    public String getEspecialidade() {
        return especialidade;
    }

    protected void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    protected void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "Nome: " + getNome() +
                "Endereço: " + getEndereco()+
                "Telefone: " + getTelefone()+
                "crm='" + crm + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}