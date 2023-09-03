package Atividade;

import java.util.Scanner;

public class laco_condicional_lista2_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cd;
        float qnt;

        System.out.println("Código do Produto:");
        cd = ler.nextInt();
        System.out.println("Quantidade:");
        qnt = ler.nextFloat();

        switch (cd) {
            case 1:
                System.out.printf("Produto: Cachorro Quente" + "\nValor total: R$ %.2f", qnt * 10);
                break;
            case 2:
                System.out.printf("Produto: X-Salada" + "\nValor total: R$ %.2f", qnt * 15);
                break;
            case 3:
                System.out.printf("Produto: X-Bacon" + "\nValor total: R$ %.2f", qnt * 18);
                break;
            case 4:
                System.out.printf("Produto: Bauru" + "\nValor total: R$ %.2f", qnt * 12);
                break;
            case 5:
                System.out.printf("Produto: Refrigerante" + "\nValor total: R$ %.2f", qnt * 8);
                break;
            case 6:
                System.out.printf("Produto: Suco de laranja" + "\nValor total: R$ %.2f", qnt * 13);
                break;
        }
    }
}
