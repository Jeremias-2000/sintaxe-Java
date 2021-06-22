package com.company.ListadeExercicio1;

import java.util.Scanner;

public class ValorDeVendaDeProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorProduto,acrescimo,valorVenda;
        System.out.println("Informe o valor do produto e o percentual de  acrescimo de preco(%):");
        valorProduto = sc.nextDouble();
        acrescimo = sc.nextDouble();
        valorVenda = valorProduto+(valorProduto *(acrescimo/100));
        System.out.println("Valor da parcela : R$ " + valorVenda +" reais");
    }
}
