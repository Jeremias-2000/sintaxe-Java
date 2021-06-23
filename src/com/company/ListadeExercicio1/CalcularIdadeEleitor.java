package com.company.ListadeExercicio1;

import java.util.Scanner;

//25. Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que
//diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que
//a pessoa nasceu).
public class CalcularIdadeEleitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual,dataNascimento,idade;
        System.out.println("Informe o ano atual e seu ano de nascimento: ");
        anoAtual = sc.nextInt();
        dataNascimento = sc.nextInt();
        idade = anoAtual - dataNascimento;
        if (idade >=16 ){
            System.out.println("Você pode votar \n sua idade é "+ idade);
        }
    }
}
