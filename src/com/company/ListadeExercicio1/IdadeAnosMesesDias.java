package com.company.ListadeExercicio1;

import java.util.Scanner;

public class IdadeAnosMesesDias {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int idade,dias,meses;
        System.out.println("Informe sua idade :");
        idade = sc.nextInt();
        dias = idade * 365;
        meses = idade * 12;
        System.out.println("Idade " + dias +" dias\n"+meses+"meses");
    }
}
