package projetocrud;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ContatoDAO {

    /*
    Create - save
    Read
    Update
    Delete
     */
    public void save(Contato contato) {

        String sql = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES (?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
            pstm.execute();

            System.out.println("Registro cadastrado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
