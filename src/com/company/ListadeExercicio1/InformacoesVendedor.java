package com.company.ListadeExercicio1;

import java.util.Scanner;

public class InformacoesVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double totalVendas,salarioFixo,salarioFinal,comissao =0.0;
        System.out.printf("Informe o nome,salario fixo e total de vendas ,respectivamente:");
        nome = sc.next();
        salarioFixo = sc.nextFloat();
        totalVendas = sc.nextFloat();
        comissao = totalVendas * 0.15;
        salarioFinal = salarioFixo+comissao;
        System.out.printf("Nome: %s\nSalario fixo: %.2f\nSalario final %.2f",nome,salarioFixo,salarioFinal);
    }
}
