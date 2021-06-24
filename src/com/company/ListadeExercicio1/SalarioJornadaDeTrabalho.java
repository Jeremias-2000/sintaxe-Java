package com.company.ListadeExercicio1;

import java.util.Scanner;

//29. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
//trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
//com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas
//trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
//que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere
//que o mês possua 4 semanas exatas).
public class SalarioJornadaDeTrabalho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHora,jornadaSemanal,salarioTotal;
        int numeroHoras;
        System.out.println("Informe o número de horas trabalhadas no mes  e o salário por hora: ");
        numeroHoras = sc.nextInt();
        valorHora = sc.nextDouble();
        jornadaSemanal = numeroHoras /4;
        System.out.println("Jornada semanal : " + jornadaSemanal);
        if (jornadaSemanal >= 40){
            salarioTotal =  numeroHoras * (valorHora * (50/100));
        }
        salarioTotal = valorHora * numeroHoras;
        System.out.println("Salario Final: " + salarioTotal);

    }
}
