package com.company.ListadeExercicio1;

import java.util.Scanner;

//24. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples
//e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que
//nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.
public class MediaAritmeticaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;
        System.out.println("Informe a primeira nota e a segunda: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        media = (nota1 + nota2)/2;
        if (media >= 6.0){
            System.out.println("Aprovado,nota : "+media);
        }else {
            System.out.println("Reprovado,nota : "+media);
        }
    }
}
