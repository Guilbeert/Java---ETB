package projetopessoa;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GuilbertDAO {

    public void save(Guilbert guilbert) {

        String sql = "INSERT INTO guilberts(nome , cpf, idade, altura, turma, dataCadastro, telefone) VALUES (?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, guilbert.getNome());
            pstm.setString(2, guilbert.getCpf());
            pstm.setInt(3, guilbert.getIdade());
            pstm.setInt(4, guilbert.getAltura());
            pstm.setString(5, guilbert.getTurma());
            pstm.setDate(6, new Date(guilbert.getDataCadastro().getTime()));
            pstm.setInt(7, guilbert.getTelefone());

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

    public List<Guilbert> getGuilbert() throws Exception {

        String sql = "SELECT * FROM guilberts";

        List<Guilbert> guilberts = new ArrayList<Guilbert>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Guilbert guilbert = new Guilbert();

                guilbert.setNome(rset.getString("nome"));
                guilbert.setCpf(rset.getString("cpf"));
                guilbert.setIdade(rset.getInt("idade"));
                guilbert.setAltura(rset.getInt("altura"));
                guilbert.setTurma(rset.getString("turma"));
                guilbert.setDataCadastro(rset.getDate("dataCadastro"));
                guilbert.setTelefone(rset.getInt("telefone"));

                guilberts.add(guilbert);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return guilberts;
    }

    public void update(Guilbert guilbert) {
        String sql = "UPDATE guilberts SET nome = ?, cpf = ?, idade = ?, altura = ?, turma = ?, dataCadastro = ?, telefone = ? WHERE cpf = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, guilbert.getNome());
            pstm.setString(2, guilbert.getCpf());
            pstm.setInt(3, guilbert.getIdade());
            pstm.setInt(4, guilbert.getAltura());
            pstm.setString(5, guilbert.getTurma());
            pstm.setDate(6, new Date(guilbert.getDataCadastro().getTime()));
            pstm.setInt(7, guilbert.getTelefone());

            pstm.execute();

            System.out.println("Registro editado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteById(String cpf) {
        String sql = "DELETE FROM guilberts WHERE cpf = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, cpf);
            pstm.execute();

            System.out.println("Registro excluido com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
