package com.company.ListadeExercicio1;

import java.util.Scanner;

public class TrocaDeValores {
    public static void main(String[] args) {
        int a = 10,b =20,c,d;
        c =a;
        d =b;
        b =c;
        System.out.println("valor de a "+a +" valor de b "+b);
        a =d;
        System.out.println("valor de a "+a +" valor de b "+b);
    }
}
