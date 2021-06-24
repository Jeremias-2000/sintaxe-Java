package com.company.ListadeExercicio1;

import java.util.Scanner;

//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
//Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$
//1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário
//total.
public class ComissaoVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioFixo,salarioFinal,valorVendas;
        System.out.println("Informe o seu salario fixo e o valor das vendas: ");
        salarioFixo = sc.nextDouble();
        valorVendas = sc.nextDouble();
        salarioFinal = salarioFixo+(salarioFixo*(3/100));
        if (valorVendas > 1500.0){
            salarioFinal = salarioFixo+(salarioFixo*(8/100)) ;
        }
        System.out.println("Salario total: "+salarioFinal);
    }
}
