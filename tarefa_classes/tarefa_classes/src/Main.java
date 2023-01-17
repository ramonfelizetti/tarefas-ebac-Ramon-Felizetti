public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ramon");
        pessoa.setSexo("Masculino");
        pessoa.setTelefone("44 98998888");
        pessoa.setIdade(29);

        System.out.println(pessoa.toString());

        System.out.println(pessoa.retonaPessoa());
    }
}