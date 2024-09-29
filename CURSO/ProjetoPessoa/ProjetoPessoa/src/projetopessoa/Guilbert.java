package projetopessoa;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang.StringUtils;

public class Guilbert extends Pessoa {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String turma;
    private Date dataCadastro;
    private int telefone;

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String formatarTelefone() {
        String phone = Integer.toString(getTelefone());
        return "(61)" + phone.substring(0, 5) + "-" + phone.substring(5, 9);
    }

    public String formatarCpf() {
        String cpfCompleto = StringUtils.leftPad(getCpf(), 11, '0');
        return cpfCompleto.substring(0, 3) + "." + cpfCompleto.substring(3, 6) + "." + cpfCompleto.substring(6, 9) + "-" + cpfCompleto.substring(9, 11);
    }

    public Guilbert() {

    }

    public Guilbert(String nome, String cpf, int idade,int altura, String turma, Date dataCadastro, int telefone) {
        super(nome, cpf, idade, altura);
        this.turma = turma;
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n---------------------------------"
                + "\nDados do Aluno:"
                + "\n---------------------------------"
                + "\nNome:" + getNome()
                + "\nCPF:" + formatarCpf()
                + "\nIdade:" + getIdade()
                + "\nIdade:" + getAltura()
                + "\nTurma:" + getTurma()
                + "\nData Cadastro:" + sdf.format(dataCadastro)
                + "\nTelefone: " + formatarTelefone()
                + "\n---------------------------------";
    }
}
