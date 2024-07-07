package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRayanne = new Dev();
        devRayanne.setNome("Rayanne");
        devRayanne.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rayanne: " + devRayanne.getConteudosInscritos());
        System.out.println("-");
        devRayanne.progredir();
        devRayanne.progredir();
        System.out.println("Conteúdos Inscritos Rayanne: " + devRayanne.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rayanne: " + devRayanne.getConteudosConcluidos());
        System.out.println("XP: " + devRayanne.calcularTotalXP());
        System.out.println("-");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("-");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
        System.out.println("-");

        System.out.println("Curso: " + curso1.getTitulo());
        System.out.println("Carga horária: " + curso1.getCargaHoraria() + " horas");
        System.out.println("XP ganho com o curso: " + curso1.calcularXP());
        System.out.println("-");

        System.out.println("Curso: " + curso2.getTitulo());
        System.out.println("Carga horária: " + curso2.getCargaHoraria() + " horas");
        System.out.println("XP ganho com o curso: " + curso2.calcularXP());
        System.out.println("-");

        System.out.println(mentoria.getTitulo());
        System.out.println("Data de início da mentoria: " + mentoria.getData());
        System.out.println("XP ganho com a mentoria: " + mentoria.calcularXP());
        System.out.println("-");

        System.out.println(bootcamp.getNome());
        System.out.println("Início do bootcamp: " + bootcamp.getDataInicial());
        System.out.println("Prazo final para conclusão do bootcamp: " + bootcamp.getDataFinal());
        System.out.println("Devs inscritos: " + devJoao.getNome() + " e " + devRayanne.getNome());
        System.out.println("Cursos oferecidos: " + bootcamp.getConteudos());

    }
}
