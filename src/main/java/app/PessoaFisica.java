package app;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PessoaFisica extends Pessoa{
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, String endereco, LocalDate dataCriacao, LocalDate dataNascimento, String cpf){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String exibirInformacoes(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.getNome() +" "+ this.getDataNascimento().format(formatter) +" " +this.getEndereco()+" " + this.getDataCriacao()+" " + this.getCpf();
    }
}


