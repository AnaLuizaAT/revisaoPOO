import lombok.Data;

import java.time.format.DateTimeFormatter;

@Data
public class Estudante extends Pessoa {
    private String ra;
    private String curso;

    public Estudante(String nomeConstrutor, String raConstrutor) {
        this.nome = nomeConstrutor;
        this.ra = raConstrutor;
    }

    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\nNome: " + this.nome +
                "\nRA: " + this.ra +
                "\nCurso: " + this.curso +
                "\nData de nascimento: " + this.dataNascimento.format(dateFormatter);\\
    }
}