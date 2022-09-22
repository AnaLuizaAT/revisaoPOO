import lombok.Data;

@Data
public class Livro {
    private String titulo;
    private int anoLancamento;
    private String editora;
    private int numeroDePaginas;
    private Autor autor;
}
