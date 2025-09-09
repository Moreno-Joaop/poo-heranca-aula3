package app;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PessoaJuridica extends Pessoa{
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, LocalDate dataCriacao, String nomeFantasia, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }

    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformacoes(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.getNome() +" "+ this.getEndereco() +" "+ this.getDataCriacao().format(formatter) +" "+ this.getCnpj() +" "+ this.getNomeFantasia();
    }
}

