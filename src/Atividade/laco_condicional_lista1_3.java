package Atividade;

import java.util.Scanner;

public class laco_condicional_lista1_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome,opcao;
        int idade;


        System.out.println("Digite o Nome do doador: ");
        nome = ler.nextLine();

        System.out.println("Digite a Idade do doador: ");
        idade = ler.nextInt();

        System.out.println("Primeira doação de sangue? ");
        opcao = ler.next();

        if (idade >= 60 && idade <= 69){
            if (opcao.equalsIgnoreCase("true")){
                System.out.println(nome + " não está apto para doar sangue!");
            } else {
                System.out.println(nome + " está apto para doar sangue!");
            }
        } else if (idade >= 18 && idade <= 59) {
            System.out.println(nome + " está apto para doar sangue!");
        } else {
            System.out.println(nome + " não está apto para doar sangue!");
        }

    }
}
