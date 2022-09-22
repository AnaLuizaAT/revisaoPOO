import lombok.Data;

@Data
public class Funcionario extends Pessoa {
    private String matricula;
    private Status status;

    public Funcionario(String nomeConstrutor, String matriculaConstrutor) {
        this.nome = nomeConstrutor;
        this.matricula = matriculaConstrutor;
    }

    public String toString() {
        return "\nNome: " + this.nome +
                "\nMatricula: " + this.matricula +
                "\nStatus: " + this.status +
                "\nData de Nascimento: " + this.dataNascimento;
    }
}