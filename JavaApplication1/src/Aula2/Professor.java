package Aula2;

public class Professor extends Pessoa {  // Extende da classe mãe "Pessoa" public Double salario;
    public Double salario;
    Professor (String nome, String cpf, Double salario) {  // Método construtor
        super(nome,cpf);  // Pega as variáveis da classe mãe "Pessoa"
        this.salario=salario;
}
}
