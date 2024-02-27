package Aula2;

public class Aluno extends Pessoa { // Extende da classe mãe "Pessoa"
    public int matricula;

    public Aluno(String nome, String cpf, int matricula) { // Método construtor
        super(nome, cpf); // Pega as variáveis da classe mãe "Pessoa"
        this.matricula=matricula;
    }
}

