package Aula2;

public class Funcionario extends Pessoa{ // Extende da classe "Pessoa"
    public String cargo;

    Funcionario (String nome, String cpf, String cargo) { // Método construtor
        super(nome,cpf); // Pega as variáveis da classe mãe "Pessoa"
        this.cargo= cargo;
}
}
