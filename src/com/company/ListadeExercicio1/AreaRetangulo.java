package com.company.ListadeExercicio1;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base,altura,areaRetangulo;
        System.out.println("Informe o valor da base e altura :");
        base = sc.nextDouble();
        altura = sc.nextDouble();
        areaRetangulo = (base * altura)/2;
        System.out.println("Area do retangulo : " + areaRetangulo);
    }
}
