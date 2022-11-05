import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java.");
        curso1.setDescricao("Descrição curso java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS.");
        curso2.setDescricao("Descrição curso JS.");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setTitulo("Descrição mentoria de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}
