package IntroduçãoEcossistemaJava;

public class RodarAplicacaoo {
    public static void main(String[] args) {

        Funcionário[] classes = new Funcionário[]{ new Faxineiro(), new Vendedor(), new Funcionário()};//Sobrescrita com Polimorfismo

        for(Funcionário classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        for(Funcionário classe: classes){
            classe.metodo2();
        }
        System.out.println("");
        Faxineiro faxineiro = new Faxineiro();//Sobrescrita
        faxineiro.metodo1();

       /* Funcionário funcionário = new Funcionário();//Instancia de um objeto

        Funcionário gerente = new Gerente();
        Funcionário vendedor = new Vendedor();
        Funcionário faxineiro = new Faxineiro();//UpCast

        Gerente gerente1 = (Gerente) new Funcionário();//DownCast*/
    }
}
