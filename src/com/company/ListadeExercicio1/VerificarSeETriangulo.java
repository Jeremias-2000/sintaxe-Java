package com.company.ListadeExercicio1;


import java.util.Scanner;

//Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever
//se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado
//deve ser menor que a soma dos outros 2 lados.
public class VerificarSeETriangulo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        System.out.println("Informe os valores");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //a<b+c c<a+b b<a+c

        if ((a<b+c)&&(c<a+b) &&(b<a+c)){
            System.out.println("é um triangulo !");
        }else{
            System.out.println("não é um triangulo !");
        }
    }
}
