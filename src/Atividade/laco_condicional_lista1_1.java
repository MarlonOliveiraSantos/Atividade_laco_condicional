package Atividade;

import java.util.Scanner;

public class laco_condicional_lista1_1 {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        int a,b,c,resul;

        System.out.println("Digite o número A: ");
        a = ler.nextInt();

        System.out.println("Digite o número B: ");
        b = ler.nextInt();

        System.out.println("Digite o número C: ");
        c = ler.nextInt();

        resul = a + b;

        if (resul > c) {
            System.out.println(b + " + " + a + " = " + resul + " > " + c);
            System.out.println("A Soma de " + a + " + " + b + " é Maior do que "+ c);
        }

        if (resul < c) {
            System.out.println(b + " + " + a + " = " + resul + " < " + c);
            System.out.println("A Soma de " + a + " + " + b + " é Menor do que "+ c);
        }

        if (resul == c) {
            System.out.println(b + " + " + a + " = " + resul + " = " + c);
            System.out.println("A Soma de " + a + " + " + b + " é Igual do que "+ c);
        }

        }

}
