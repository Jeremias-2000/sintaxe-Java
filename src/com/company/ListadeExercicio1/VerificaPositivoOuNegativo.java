package com.company.ListadeExercicio1;


import java.util.Scanner;

//22. Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
//positivo).
public class VerificaPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Informe um valor : ");
        valor = sc.nextInt();
        if (valor >= 0 ){
            System.out.println("Positivo !");
        }
        else {
            System.out.println("Negativo !");
        }
    }
}
