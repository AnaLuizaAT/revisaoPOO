import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Estudante objetoUmEstudante = new Estudante("Ana", "2022102030");
        objetoUmEstudante.setDataNascimento(LocalDate.of(2000, 2, 12));
        objetoUmEstudante.setCurso("Analise e Desenvolvimento de Sistemas");
        System.out.println("\n-----ESTUDANTE-----" + objetoUmEstudante);

        Funcionario objetoUmFuncionario = new Funcionario("Ana Luiza", "2022120998");
        objetoUmFuncionario.setDataNascimento(LocalDate.of(2022, 9, 12));
        objetoUmFuncionario.setStatus(Status.INATIVO);
        System.out.println("\n-----FUNCIONARIO-----" + objetoUmFuncionario);

        Autor objetoUmAutor = new Autor("Ana Luiza", (LocalDate.of(2022, 2, 22)));
        objetoUmAutor.setQuantidadeLivros(5);
        objetoUmAutor.setArea("Biologicas");
        System.out.println("\n-----AUTOR-----" + objetoUmAutor);

        Livro objetoUmLivro = new Livro();
        objetoUmLivro.setTitulo("Programando em JAVA");
        objetoUmLivro.setAnoLancamento(2020);
        objetoUmLivro.setEditora("Editora XVV");
        objetoUmLivro.setNumeroDePaginas(234);
        objetoUmLivro.setAutor(objetoUmAutor);
    }
}