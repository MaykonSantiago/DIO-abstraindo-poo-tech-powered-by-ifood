import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java.");
        curso1.setDescricao("Dominando Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS.");
        curso2.setDescricao("Dominando JS.");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setTitulo("Esclarecendo dúvidas sobre Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer.");
        bootcamp.setDescricao("Bootcamp Java com 96hrs.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev maykon = new Dev();
        maykon.setNome("Maykon");
        maykon.inscreverBootcamp(bootcamp);
        maykon.progredir();
        maykon.progredir();

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        joao.progredir();
        joao.progredir();
        joao.progredir();

        System.out.println(maykon);
        System.out.println(joao);
    }
}
