package com.company.ListadeExercicio1;

import java.util.Scanner;

//Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em
//estoque e quantidade mínima em estoque de um produto. Calcular e escrever a
//quantidade média ((quantidade média = quantidade máxima + quantidade
//mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média
//escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra'.
public class QuantidadeAtualEmEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long quantidadeAtual,quantidadeMaxima,quantidadeMinima;
        double media;

        System.out.println("Informe o a quantidade atual,\nquantidade máxima \ne quantidade mínima de produtos :");
        quantidadeAtual = sc.nextLong();
        quantidadeMaxima = sc.nextLong();
        quantidadeMinima = sc.nextLong();
        media = (quantidadeMaxima+quantidadeMinima)/2;
        if (quantidadeAtual>=media){
            System.out.println("Nao efetuar compra ");
        }
        else {
            System.out.println(" efetuar compra ");
        }
        System.out.println("quantidade media : "+ media);
    }
}
