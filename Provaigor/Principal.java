import java.util.Scanner;
import java.util.Arrays;


public class Principal {
    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        Aluno listaAluno[] = new Aluno[1];
       
        int opcao;
           
        for (int cont = 0; cont > -1; cont++){
            System.out.println("Escolha um número abaixo\n");
            System.out.println("1: Cadastrar Aluno em uma posição\n2: Listar Aluno em uma posição\n3: Listar todos os Alunos");
            opcao = sc.nextInt();

            if (opcao != 0) {
                switch (opcao){
                    case 1:
                    System.out.println("Posição no array para cadastrar");
                    int posicaoCad = sc.nextInt();
                    ColecaoAlunoArray.cadastrarAlunoPorPosicao(listaAluno, posicaoCad);
                    break;


                    case 2:
                    System.out.println("Posição no array para listar");
                    int posicaoList = sc.nextInt();
                    ColecaoAlunoArray.procurarAlunoPorPosicao(listaAluno, posicaoList);
                    break;


                    case 3:
                    ColecaoAlunoArray.listarAluno(listaAluno);
                    break;
                }
            }
        }
    }
}
