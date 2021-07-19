package com.company.ListadeExercicio1;

import java.util.Scanner;

//Ler dois valores e imprimir uma das três mensagens a seguir:
//- ‘Números iguais’, caso os números sejam iguais
//- ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
//- ‘Segundo maior’, caso o segundo seja maior que o primeiro.
public class CompararValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.println("Informe dois numeros : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Numeros iguais");
        }else if (num1 > num2){
            System.out.println("Primeiro e maior");
        }else {
            System.out.println("Segundo e maior");
        }
    }
}
