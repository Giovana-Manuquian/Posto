package br.senai.sp.posto;

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {

        /** Criar Variaveis */
        double gasolina, alcool;
        int desconto = 4;

        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i<desconto; i++){
            /** Coletar os Precos */
            System.out.println("------------------------------------");
            System.out.println("-----    Bem Vindo ao br.senai.sp.posto.Posto   ------");
            System.out.println("Você é o cliente n° " + i);
            System.out.print("Digite o preço da gasolina: ");
            gasolina = teclado.nextDouble();
            System.out.print("Digite o preço do Alcool: ");
            alcool = teclado.nextDouble();

            /** Logica br.senai.sp.posto.Posto */

            gasolina = gasolina*0.75;

            double avalia = (alcool / gasolina);

            if (avalia >= 0.7) {
                System.out.println("Abasteça Gasolina !");
            } else {
                System.out.println("Abasteça Alcool !");
            }
        }

        while (true) {

            System.out.println("-------------------------------------------------");
            System.out.println("Acabou os Descontos !!!!!!!!!!!!!!!!!!!!!!");

            /** Coletar os Precos */
            System.out.println("------------------------------------");
            System.out.println("-----    Bem Vindo ao br.senai.sp.posto.Posto   ------");
            System.out.print("Digite o preço da gasolina: ");
            gasolina = teclado.nextDouble();
            System.out.print("Digite o preço do Alcool: ");
            alcool = teclado.nextDouble();

            /** Logica br.senai.sp.posto.Posto */

            double avalia = (alcool / gasolina);

            if (avalia >= 0.7) {
                System.out.println("Abasteça Gasolina !");
            } else {
                System.out.println("Abasteça Alcool !");
            }

        }

    }
}