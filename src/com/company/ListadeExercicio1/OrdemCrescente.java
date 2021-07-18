package com.company.ListadeExercicio1;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int aux = 0;
        for (int i = 0;i<3;i++){
            System.out.println("Informe o "+i+ " elemento:");
            numeros[i]= sc.nextInt();
        }
        for (int j = 0;j < numeros.length;j++){
            for (int c = 0;c < numeros.length;c++){
                if (numeros[j] < numeros[c]){
                    aux = numeros[j];
                    numeros[j] = numeros[c];
                    numeros[c]=aux;
                }
            }
        }
        for (int i = 0;i<3;i++){
            System.out.printf(numeros[i]+"\t");
        }
    }
}
