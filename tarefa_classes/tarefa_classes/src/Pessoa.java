/**
 * Classe Pessoa
 * Atributos Nome, Idade, Sexo, Telefone
 * */
public class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Deprecated
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=" + nome +
                ", idade=" + idade +
                ", sexo='" + sexo +
                '}';
    }
    /**
     * Método que retorna os dados da pessoa conforme informado
     * */
    public String retonaPessoa() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
