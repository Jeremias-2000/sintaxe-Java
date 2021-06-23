package com.company.ListadeExercicio1;

import java.util.Scanner;

public class PercentualEleicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleitores,votosBrancos,votosNulos,votosValidos,
                percentualBrancos,percentualValidos,percentualNulos,x;
        System.out.println("Informe o numero de eleitores , o número de votos brancos, nulos e válidos: ");
        eleitores = sc.nextInt();
        x = eleitores/100;
        votosBrancos = sc.nextInt();
        votosNulos = sc.nextInt();
        votosValidos = sc.nextInt();
        percentualBrancos = votosBrancos/x;
        percentualNulos = votosNulos/x;
        percentualValidos = votosValidos/x;
        System.out.println("Eleitores : " + eleitores+"\n"+"votos brancos: "+ percentualBrancos+"\n"
                +"votos nulos: "+ percentualNulos +"\n" +"votos válidos: "+percentualValidos);
    }
}
