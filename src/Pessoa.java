import lombok.Data;

import java.time.LocalDate;

@Data
abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
}