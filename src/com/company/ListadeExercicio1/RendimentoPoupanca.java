package com.company.ListadeExercicio1;

import java.util.Scanner;

public class RendimentoPoupanca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double conta,juros,rendimento;
        System.out.println("Informe o valor depositado na poupanca e o juros da conta :");
        conta = sc.nextDouble();
        juros = sc.nextDouble();
        rendimento = conta *(juros/100);
        System.out.printf("Rendimento : %.2f",rendimento);
    }
}
