package com.company.ListadeExercicio1;

import java.util.Scanner;

//Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que
//10, caso contrário escrever NÃO É MAIOR QUE 10!
public class VerificaMaiorQue10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Informe um valor : ");
        valor = sc.nextInt();
        if (valor > 10){
            System.out.println("É maior que 10 !");
        }
        else {
            System.out.println("Não é maior que 10 !");
        }
    }
}
