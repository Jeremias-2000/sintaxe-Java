package com.company.ListadeExercicio1;

import java.util.Scanner;
//Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//Até 5 Kg Acima de 5Kg
//Morango R$ 2,50/Kg R$ 2,20/Kg
//Maçã R$ 1,80/Kg R$ 1,50/Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$
//25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo
//para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças
//adquiridas e escreva o valor a ser pago pelo cliente.
public class ValorFeira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qtdeMacas,qtdeMorangos,valorMaca = 0.0,valoMorango = 0,somaKgf,valor = 0.0;

        System.out.println("Informe a quantidade (em kgf) de macas e morangos :");
        qtdeMacas = sc.nextDouble();
        qtdeMorangos = sc.nextDouble();

        somaKgf = qtdeMacas + qtdeMorangos;

        if (qtdeMacas <= 5.0){
            valorMaca = qtdeMacas * 1.80;
        }else if (qtdeMacas > 5.0){
            valorMaca = qtdeMacas * 1.50;
        }

        else if (qtdeMorangos <= 5.0){
            valorMaca = qtdeMacas * 2.50;
        }
        else if (qtdeMacas > 5.0){
            valorMaca = qtdeMacas * 2.20;
        }

        valor = valorMaca + valoMorango;



    }
}
