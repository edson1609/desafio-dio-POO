import java.time.LocalDate;

import brcomdiodesafio.Curso;
import brcomdiodesafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo();
        curso2.setDescricao("Descrição do curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do curso de Java");
        mentoria.setDescricao("Descrição do curso de Java");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
        System.out.println(mentoria);
        

        
         }
}
