public class Aluno {


    private String nome;
    private String rg;
    private String idade;
    private String curso;




    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, String rg, String idade, String curso) {
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.curso = curso;
    }
    public Aluno() {
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", rg=" + rg + ", idade=" + idade + ", curso=" + curso + "]";
    }
   
    


   
}
