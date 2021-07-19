package com.company.ListadeExercicio1;

import java.util.Scanner;

//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
//(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
//pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do
//litro do álcool é R$ 2,90.

public class CalcularValorCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litros;
        double valor = 0.0,valoAlcool = 2.90,valoGasolina = 3.30;
        String opcao;

        System.out.println("Informe o numero de litros vendidos :");
        litros = sc.nextInt();
        System.out.println("Informe o tipo de combustivel [A-álcool,G-gasolina]");
        opcao = sc.next();

        if (opcao.equals("A") && litros <= 20){
            valor = (valoAlcool * litros) - (litros * (3/100));

        }else if(opcao.equals("A") && litros > 20){
            valor = (valoAlcool * litros) - (litros * (5/100));
        }

        else if (opcao.equals("G") && litros <= 20){
            valor = (valoGasolina * litros) - (litros * (4/100));

        }else if (opcao.equals("G") && litros > 20){
            valor = (valoGasolina * litros) - (litros * (6/100));
        }else {
            System.out.println("combustival nao cadastrado");
        }

        System.out.println("Valor do combustivel " + valor);
        System.out.println("Programa finalizado com sucesso !");
    }
}
