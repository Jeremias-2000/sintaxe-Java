package com.company.ListadeExercicio1;

import java.util.Scanner;

public class ConversaoDolarReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cotacaoDolar,real;
        System.out.println("Informe a cotacao do dolar hhoje e quantos reais voce quer converter:");
        cotacaoDolar = sc.nextDouble();
        real = sc.nextDouble();
        System.out.printf("Dolares: %.2f",real/cotacaoDolar);
    }
}
