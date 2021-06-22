package com.company.ListadeExercicio1;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,ant,pos;
        System.out.println("Informe um numero : ");
        number = sc.nextInt();
        ant = number -1;
        pos = number+1;
        System.out.println("anterior : "+ant + "sucessor : " + pos) ;
    }
}
