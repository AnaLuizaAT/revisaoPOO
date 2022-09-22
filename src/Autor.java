import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class Autor extends Pessoa {
    private int quantidadeLivros;
    private String area;

    public Autor (String nomeConstrutor, LocalDate dataNascimentoConstrutor) {
        this.nome = nomeConstrutor;
        this.dataNascimento = dataNascimentoConstrutor;
    }

    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\nNome: " + this.nome +
                "\nArea: " + this.area +
                "\nQuantidade de Livros: " + this.quantidadeLivros +
                "\nData de Nascimento: " + this.dataNascimento.format(dateFormatter);
    }
}