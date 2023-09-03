package Atividade;

import com.sun.jdi.StringReference;

import java.util.Scanner;

public class laco_condicional_lista2_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float valor=0,saldo=1000,resul;
        int cd;

        System.out.println("Operação: ");
        cd = ler.nextInt();

        if (cd == 2) {
            System.out.println("Valor: ");
            valor = ler.nextFloat();
        } else if(cd == 3) {
            System.out.println("Valor: ");
            valor = ler.nextFloat();
        }

        switch (cd) {

            case(1):
                System.out.printf("Operação - Saldo" + "\nSaldo: R$ %.2f", saldo);
                break;
            case(2):
                if (valor > saldo) {
                    System.out.println("Operação - Saque" + "\nSaldo Insuficiente!");
                } else {
                    resul = saldo - valor;
                    System.out.printf("Operação - Saque" + "\nNovo Saldo: R$ %.2f", resul);
                }
                break;
            case(3):
                resul = saldo + valor;
                System.out.printf("Operação - Depósito" + "\nNovo Saldo: R$ %.2f", resul);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
    }
}
