package com.company.ListadeExercicio1;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor1,valor2;
        System.out.println("Informe dois valores: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        System.out.printf("Soma : %.2f \nSubtracao : %.2f\nMultiplicacao %.2f\nDivisao: %.2f",valor1+valor2, valor1-valor2
                ,valor1*valor2,valor1/valor2);

    }
}
