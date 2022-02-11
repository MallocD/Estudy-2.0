package IntroduçãoEcossistemaJava;

import java.io.IOException;
import java.util.Scanner;

public class Classe{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();

        if( A < B ){
            double d = 100;
            double res = B*d;
            double valor = (res/A)-100;
            System.out.printf("%.2f", valor);
            System.out.print("%");
        }else if(A==B) {
            System.out.println("0.00%");

        }
    }


}


/*public class RodarAplicacaoo {
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

       *//* Funcionário funcionário = new Funcionário();//Instancia de um objeto

        Funcionário gerente = new Gerente();
        Funcionário vendedor = new Vendedor();
        Funcionário faxineiro = new Faxineiro();//UpCast

        Gerente gerente1 = (Gerente) new Funcionário();//DownCast*//*
    }*/

