import java.util.Scanner;
import java.util.Arrays;



public class ColecaoAlunoArray {

    

    public static Aluno[] cadastrarAlunoPorPosicao(Aluno[]listaAluno, int posicaoCad) {
        Aluno listaAlunoCopia[] = new Aluno[1];
        Scanner sc = new Scanner(System.in);
        Aluno alunoinsert = new Aluno();
        int cont = 0;

        if (cont == listaAluno.length){
            System.arraycopy(listaAluno,0, listaAlunoCopia, 0, listaAluno.length);
            for (Aluno Aluno : listaAluno) {
                System.out.println(Aluno);
            }

        }

        System.out.println("Nome: \n");
        alunoinsert.setNome(sc.nextLine());
        int x;


        System.out.println("RG: \n");
        alunoinsert.setIdade(sc.nextLine());


        System.out.println("Idade: \n");
        alunoinsert.setRg(sc.nextLine());

        System.out.println("Curso: \n");
        alunoinsert.setCurso(sc.nextLine());
        
       listaAluno[posicaoCad] = alunoinsert;
       
       
       for (Aluno Aluno : listaAluno) {
           System.out.println(Aluno);
       }
       return listaAluno;

   }
       
    public static void listarAluno(Aluno[]listaAluno){
        for(Aluno procurar : listaAluno){
            System.out.println(procurar);


        }
    }

    public static void procurarAlunoPorPosicao(Aluno[]listaAluno, int posicaoList){
        System.out.println("" + listaAluno[posicaoList]);
    }
}
