package com.company.ListadeExercicio1;

import java.util.Scanner;

public class ValorPrestacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorProduto,parcela;
        System.out.println("Informe o valor do produto:");
        valorProduto = sc.nextDouble();
        parcela = valorProduto/5;
        System.out.println("Valor da parcela : R$ " + parcela +" reais");
    }
}
