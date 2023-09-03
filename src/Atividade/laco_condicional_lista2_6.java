package Atividade;

import java.util.Scanner;

public class laco_condicional_lista2_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int cd;
        float sal;

        System.out.println("Nome do colaborador: ");
        nome = ler.nextLine();

        System.out.println("Cargo: ");
        cd = ler.nextInt();

        System.out.println("Salário: ");
        sal = ler.nextFloat();

        switch (cd) {
            case(1):
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: " + "Gerente");
                System.out.printf("Salário: R$ %.2f", sal+(0.1*sal));
                break;
            case(2):
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: " + "Vendedor");
                System.out.printf("Salário: R$ %.2f", sal+(0.07*sal));
                break;
            case(3):
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: " + "Supervisor");
                System.out.printf("Salário: R$ %.2f", sal+(0.09*sal));
                break;
            case(4):
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: " + "Motorista");
                System.out.printf("Salário: R$ %.2f", sal+(0.06*sal));
                break;
            case(5):
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: " + "Estoquista");
                System.out.printf("Salário: R$ %.2f", sal+(0.05*sal));
                break;
            case(6):
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo: " + "Técnico de TI");
                System.out.printf("Salário: R$ %.2f", sal+(0.08*sal));
                break;
        }
    }
}
