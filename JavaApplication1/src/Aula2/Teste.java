package Aula2;

public class Teste {

    public static void main(String[] args) { 
        Pessoa pes= new Pessoa("José","123");
        Aluno a= new Aluno (null,null,1234); 
        Professor prof= new Professor (null,null,20.000);
        Funcionario func= new Funcionario (null,null,"Administrador");
            System.out.println("NOME: " + pes.nome + "\nCPF : " + pes.cpf);
            System.out.println("MATRÍCULA :" + a.matricula);  
            System.out.println("SALÁRIO :" + prof.salario);  
            System.out.println("CARGO: " + func.cargo); 
    }
}
