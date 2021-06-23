package com.company.ListadeExercicio1;

import java.util.Scanner;

//23. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
//forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs
//compradas, calcule e escreva o custo total da compra.
public class ValorMaca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMaca = 0;
        double valor = 0;
        System.out.println("Informe o número de maçãs : ");
        numeroMaca = sc.nextInt();
        if ((numeroMaca <= 6) && (numeroMaca>= 6) && (numeroMaca<=11)){
            valor = numeroMaca * 1.30;
            System.out.println("valor compra" + valor);
        }
        else if(numeroMaca >= 12) {
            valor = numeroMaca * 1.0 ;
            System.out.println("valor compra" + valor);
        }
    }
}
