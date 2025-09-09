package app;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        // Tarefa[] tarefas = new Tarefa[5];
        // Compromisso[] compromissos = new Compromisso[5];


        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas[4] = new Tarefa(4, "novo teste", false);

        // compromissos[2] = new Compromisso(0, "Compromisso", "hoje", "amanhã");


        // System.out.println(tarefas[0].getDescricao());
        // System.out.println(tarefas[4].getDescricao());
        // System.out.println(compromissos[2].getDescricao());

    PessoaFisica pf = new PessoaFisica("João", "R. Uapes, 215", LocalDate.now() , LocalDate.of(2007, Month.FEBRUARY, 26), "441.922.638-23");

    PessoaJuridica pj = new PessoaJuridica("JPMA Repr", "Rua dos Bobos, 0", LocalDate.now(),"53.009.0001.52", "JPMA Lindão");

    System.out.println(pf.exibirInformacoes());
    System.out.println(pj.exibirInformacoes());
    }
}