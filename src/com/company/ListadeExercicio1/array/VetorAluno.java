package com.company.ListadeExercicio1.array;

public class VetorAluno {

    private Aluno[] alunos = new Aluno[10];
    int cont;

    public int  adicionaAluno(Aluno aluno){
        if (cont < 10){
            alunos[cont] = aluno;
            cont++;
            return 1;
        }
        return 0;
    }

    public Aluno buscaAluno(int posicao){
        if (posicao >=0 && posicao < cont){
            return alunos[posicao];
        }
        return null;
    }

    public int removeAluno(int posicao){
        if (posicao >= 0 && posicao < cont){
            for (int i = posicao;i<cont;i++){
                alunos[i] = alunos[i+1];
            }
            alunos[cont] = null;
            cont--;
            return 1;
        }
        return 0;
    }

    public void retornaAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }
}
