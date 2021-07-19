package com.company.ListadeExercicio1;

import java.util.Scanner;

//Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
//Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra
//EMPATE.

public class VencedorTime {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String timeA,timeB;
        int golsA,golsB;

        System.out.println("Informe o nome do times que jogarão :");
        timeA = sc.next();
        timeB = sc.next();

        System.out.println("Jogo encerrado !,informe o resultado do jogo : ");
        golsA = sc.nextInt();
        golsB = sc.nextInt();

        if (golsA > golsB){
            System.out.println("Ganhador" + timeA);
        }else if(golsB > golsA){
            System.out.println("Ganhador" + timeB);
        }else {
            System.out.println("Jogo empatado !");
        }

        System.out.println("Programa encerrado");

    }
}
