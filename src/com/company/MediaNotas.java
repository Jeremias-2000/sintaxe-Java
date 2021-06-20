package com.company;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1,nota2,nota3,media;
        System.out.println("Informe as notas: ");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
        media = (nota1+nota2+nota3)/3;
        System.out.printf(String.format("Media das notas : %.2f",media));

    }
}
