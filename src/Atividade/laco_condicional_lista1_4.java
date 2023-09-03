package Atividade;

import java.util.Scanner;

public class laco_condicional_lista1_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String pala1, pala2, pala3;

        System.out.println("Primeira Palavra:");
        pala1 = ler.next();

        System.out.println("Segunda Palavra:");
        pala2 = ler.next();

        System.out.println("Terceira Palavra:");
        pala3 = ler.next();

        if (pala1.equalsIgnoreCase("Vertebrado")) {
            if (pala2.equalsIgnoreCase("Ave")) {
                if (pala3.equalsIgnoreCase("Carnívoro")) {
                    System.out.println("Águia");
                } else {
                    System.out.println("Pomba");
                }
            } else if (pala3.equalsIgnoreCase("Onívoro")) {
                System.out.println("Homem");
            } else {
                System.out.println("Vaca");
            }
        } else if (pala2.equalsIgnoreCase("Inseto")) {
            if (pala3.equalsIgnoreCase("Hematófago")) {
                System.out.println("Pulga");
            } else {
                System.out.println("Lagarta");
            }
        }
    }
}
