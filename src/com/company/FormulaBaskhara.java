package com.company;

import java.util.Scanner;

public class FormulaBaskhara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,delta;
        System.out.println("Informe os valores de a,b e c: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        delta = (float) Math.pow(b,2)-4*a*c;
        System.out.printf("Delta: %.2f",delta);
    }
}
