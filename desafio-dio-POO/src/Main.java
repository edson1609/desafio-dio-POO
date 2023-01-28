import java.time.LocalDate;

import brcomdiodesafio.Bootcamp;
import brcomdiodesafio.Curso;
import brcomdiodesafio.Dev;
import brcomdiodesafio.Mentoria;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso ();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
        curso2.setTitulo ("Curso de JS");
        curso2.setDescricao("Descrição do curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do curso de Java");
        mentoria.setDescricao("Descrição do curso de Java");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição do bootcamp de java");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);
       
       Dev devEdson = new Dev();
       devEdson.setNome("Edson");
       devEdson.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Edson:" + devEdson.getConteudosInscritos());
       devEdson.progredir();
       devEdson.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Edson:" + devEdson.getConteudosInscritos());
       System.out.println("Conteúdos Concluídos Edson:" + devEdson.getConteudosConcluidos());
       System.out.println("XP:" + devEdson.calcularTotalXp());

       System.out.println("-------");

       Dev devJoyce = new Dev();
       devJoyce.setNome("Joyce");
       devJoyce.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Joyce:" + devJoyce.getConteudosInscritos());
       devJoyce.progredir();
       devJoyce.progredir();
       devJoyce.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Joyce:"+ devJoyce.getConteudosInscritos());
       System.out.println("Contúdos Concluidos Joyce: " + devJoyce.getConteudosConcluidos());
       System.out.println("XP:"+ devJoyce.calcularTotalXp());
    }
  }






        

        
         