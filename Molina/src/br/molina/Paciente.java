package br.molina;

public class Paciente extends Pessoa {

    private String idConvenio;
    private float peso;
    private float altura;
    private int idade;



    public int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    protected void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    protected void setPeso(float peso) {
        this.peso = peso;
    }

    public String getIdConvenio() {
        return idConvenio;
    }

    protected void setIdConvenio(String idConvenio) {
        this.idConvenio = idConvenio;
    }

}