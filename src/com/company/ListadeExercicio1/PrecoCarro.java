package com.company.ListadeExercicio1;

import java.util.Scanner;

public class PrecoCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorFabrica,valorCarro,impostos,ditribuidora;
        System.out.println("Informe o valor do custo de fabrica:");
        valorFabrica = sc.nextDouble();
        impostos = valorFabrica*(45/100);
        ditribuidora = valorFabrica *(28/100);
        valorCarro = valorFabrica + ditribuidora + impostos;
        System.out.println("Valor do carro : R$ " + valorCarro +" reais");
    }
}
