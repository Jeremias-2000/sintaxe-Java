package com.company;

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float velocidadeMedia,distancia,tempo;
        System.out.println("Infomre a distâcia e o tempo respectivamente :");
        distancia = sc.nextFloat();
        tempo = sc.nextFloat();
        velocidadeMedia = distancia/tempo;
        System.out.printf("Velocidade Média : %.2f",velocidadeMedia);

    }
}
