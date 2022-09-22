import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Funcionario funcionario;
    private Estudante estudante;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livroObjeto, Funcionario funcionarioObjeto, Estudante estudanteObjeto) {
        this.livro = livroObjeto;
        this.funcionario = funcionarioObjeto;
        this.estudante = estudanteObjeto;
        this.dataEmprestimo = LocalDate.now();
    }
}