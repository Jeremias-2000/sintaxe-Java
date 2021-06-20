package com.company;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fahrenheit,resultado;
        System.out.println("Informe a temperatura em Fahrenheit a converter em Celsius :");
        fahrenheit = sc.nextFloat();
        resultado = (fahrenheit - 32) * 5/9;
        System.out.printf("Celsius: %.2f",resultado);
    }
}
