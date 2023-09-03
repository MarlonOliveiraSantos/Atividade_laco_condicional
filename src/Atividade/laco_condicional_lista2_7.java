package Atividade;

import java.util.Scanner;

public class laco_condicional_lista2_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float n1,n2,resul;
        int cd;

        System.out.println("Digite o 1º número: ");
        n1 = ler.nextFloat();

        System.out.println("Digite o 2º número: ");
        n2 = ler.nextFloat();

        System.out.println("Operação: ");
        cd = ler.nextInt();

        switch (cd) {
            case(1):
                resul = n1 + n2;
                System.out.printf(n1 + " + " + n2 + " = " + resul);
                break;
            case(2):
                resul = n1 - n2;
                System.out.printf(n1 + " - " + n2 + " = " + resul);
                break;
            case(3):
                resul = n1 * n2;
                System.out.printf(n1 + " * " + n2 + " = " + resul);
                break;
            case(4):
                resul = n1 / n2;
                System.out.printf(n1 + " / " + n2 + " = " + resul);
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}
