package projetopessoa;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import static projetopessoa.ConnectionFactory.createConnectionToMySQL;

public class Main {

    public static void main(String[] args) throws Exception {
        //Testar conexão
        Connection conn = createConnectionToMySQL();

        if (conn != null) {
            System.out.println("Conectado!");

            conn.close();
        }

        //Criar registro
        Guilbert guilbert = new Guilbert();
        guilbert.setNome("MARCOS");
        guilbert.setCpf("12345678910");
        guilbert.setIdade(18);
        guilbert.setAltura(182);
        guilbert.setTurma("3°D");
        guilbert.setDataCadastro(new Date(System.currentTimeMillis()));
        guilbert.setTelefone(123456789);

        GuilbertDAO guilbertDAO = new GuilbertDAO();
        guilbertDAO.save(guilbert);

        //Atualizar registro
        Guilbert a1 = new Guilbert();
        a1.setId(2);
        a1.setNome("JOSE");
        a1.setCpf("12345678910");
        a1.setIdade(28);
        a1.setAltura(170);
        a1.setTurma("3°A");
        a1.setDataCadastro(new Date(System.currentTimeMillis()));
        a1.setTelefone(123456789);

        //alunoDAO.update(a1);
        //Excluir Registro
        //alunoDAO.deleteById(1);

        //Pesquisar Registro
        System.out.println(guilbertDAO.getGuilbert());
    }

}
