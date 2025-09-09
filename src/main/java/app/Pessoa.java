package app;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;

    public Pessoa(String nome, String endereco, LocalDate dataCriacao){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String endereco){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao(){
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public abstract String exibirInformacoes(){ 
        return this.getNome(nome) + " " + this.getEndereco(endereco) +" "+ this.getDataCriacao(dataCriacao);
    }

}
