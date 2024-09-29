package projetocrud;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import static projetocrud.ConnectionFactory.createConnectionToMySQL;

public class Main {

    public static void main(String[] args) throws Exception {

        //Testar conexão
        Connection conn = createConnectionToMySQL();

        if (conn != null) {
            System.out.println("Conectado!");

            conn.close();
        }

        //Criar registro
        Contato contato = new Contato();

        contato.setNome("Marias");
        contato.setIdade(21);
        contato.setDataCadastro(new Date(System.currentTimeMillis()));

        ContatoDAO contatoDao = new ContatoDAO();
        contatoDao.save(contato);

        //Pesquisar Registro
        for (Contato c : contatoDao.getContatos()) {
            System.out.println(""
                    + "id:" + c.getId()
                    + " Nome:" + c.getNome()
                    + " Idade:" + c.getIdade()
            );
        }
        
        //Atualizar registro
        Contato c1 = new Contato();
        c1.setId(2);
        c1.setNome("teste");
        c1.setIdade(10);
        c1.setDataCadastro(new Date(System.currentTimeMillis()));
        
        contatoDao.update(c1);
        
        //Excluir Registro
        contatoDao.deleteById(1);
        
    }

}
