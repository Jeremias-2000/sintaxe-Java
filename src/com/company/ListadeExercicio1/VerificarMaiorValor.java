package com.company.ListadeExercicio1;

import java.util.Scanner;

// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
public class VerificarMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Informe dois valores : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println(num1 + "é igual à"+ num2);
        }else if(num1 > num2){
            System.out.println(num1 + "é maior que"+ num2);
        }
        else {
            System.out.println(num2 + "é maior que"+ num2);
        }
    }
}
