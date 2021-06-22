package com.company.ListadeExercicio1;

import java.util.Scanner;

public class ConsumoMedioCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distancia,combustivel;
        System.out.println("Informe a distancia total percorrida e combustivel gasto respectivamente:");
        distancia = sc.nextFloat();
        combustivel = sc.nextFloat();
        System.out.printf("Consumo Medio: %.2f",distancia/combustivel);
    }
}
