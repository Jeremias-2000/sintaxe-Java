package com.company;

public class Multiplos {
    public static void main(String[] args) {
        int soma = 0;
        for (int i =1000;i>3;i--){
            if ((i%3==0)||(i%5 == 0)){
                soma+=i;
            }
        }
        System.out.printf("soma: %d",soma);
    }
}
