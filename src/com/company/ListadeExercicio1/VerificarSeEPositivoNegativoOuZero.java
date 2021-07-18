package com.company.ListadeExercicio1;


import java.util.Scanner;

//Ler um valor e escrever se é positivo, negativo ou zero.
public class VerificarSeEPositivoNegativoOuZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Informe um numero :");
        num =  sc.nextInt();
        if (num > 0){
            System.out.println("Positivo");
        }else if(num < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Igual a 0");
        }
    }
}
