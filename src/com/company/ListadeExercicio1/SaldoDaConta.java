package com.company.ListadeExercicio1;

import java.util.Scanner;

//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após,
//calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar
//se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão
//escrever a mensagem 'Saldo Negativo'.
public class SaldoDaConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long numeroConta;
        double saldo,debito,credito,saldoAtual;
        System.out.println("Informe  o numero da conta\nsaldo,debito e credito: ");
        numeroConta = sc.nextLong();
        saldo = sc.nextDouble();
        if (saldo >= 0 ){
            System.out.println("Saldo Positivo");
        }else{
            System.out.println("Saldo Negativo");
        }
        debito = sc.nextDouble();
        credito = sc.nextDouble();
        saldoAtual = saldo-debito+credito;
        System.out.println("saldo atual: " + saldoAtual);
    }
}
