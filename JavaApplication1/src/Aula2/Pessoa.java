package Aula2;

public class Pessoa {
    public String nome, cpf; // Declaração das variáveis

    public Pessoa (String nome, String cpf){ // Método construtor
        this.nome= nome; // Chama o construtor dentro de outro construtor, garantindo o acesso ao atributo
        this.cpf= cpf; // Chama o construtor dentro de outro construtor, garantindo o acesso ao atributo
}
}
