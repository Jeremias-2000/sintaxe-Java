package com.company.ListadeExercicio1;


//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que
//as idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
//e o produto das idades do homem mais novo com a mulher mais velha.

import java.util.Scanner;

public class CalculoIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeHomem1,idadeHomem2,idadeMulher1,idadeMulher2,n1 = 0,n2 = 0,n3 = 0,n4 = 0;
        double somaIdade = 0.0,produtoIdade = 1.0;

        System.out.println("Informe a idade dos dois homens respectivamente");
        idadeHomem1 = sc.nextInt();
        idadeHomem2 = sc.nextInt();
        System.out.println("Informe a idade das duas mulheres respectivamente");
        idadeMulher1 = sc.nextInt();
        idadeMulher2 = sc.nextInt();

        if (idadeHomem1 > idadeHomem2){
           n1 = idadeHomem1;
           n2 = idadeHomem2;
        }

        else if (idadeHomem2 > idadeHomem1){
           n2 = idadeHomem2;
           n1 = idadeHomem1;
        }else if (idadeMulher1 > idadeMulher2){
            n3 = idadeMulher1;
            n4 = idadeHomem2;
        }
        else if (idadeMulher2 > idadeMulher1){
            n3 = idadeMulher2;
            n4 = idadeHomem1;
        }
        somaIdade = n1 + n4;
        produtoIdade = n2 * n3;

        System.out.println("soma das idades" + somaIdade
                + "\nproduto das idades "+ produtoIdade);

    }
}
