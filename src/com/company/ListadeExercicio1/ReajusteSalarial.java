package com.company.ListadeExercicio1;


import java.util.Scanner;

//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual
//de reajuste. Calcular e escrever o valor do novo salário.
public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario,reajuste,percentual;;
        System.out.println("Informe o valor do salario e o percentual de reajuste salarial: ");
        salario = sc.nextDouble();
        percentual = sc.nextDouble();
        percentual = percentual/100;
        reajuste = salario +(salario * percentual);
        System.out.println("Salário final: " + reajuste);
    }
}
