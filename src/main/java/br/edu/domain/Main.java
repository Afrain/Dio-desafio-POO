package br.edu.domain;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setId(1);
		bootcamp.setNome("Bootcamp Java");
		bootcamp.setDescricao("Java Iniciante");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAfrain = new Dev();
		devAfrain.inscreverBootcamp(bootcamp);
		System.out.println("Cursos inscritos: " + devAfrain.getConteudosInscritos());
		devAfrain.progredir();
		System.out.println(devAfrain.getConteudosInscritos());
		System.out.println("Cursos concluidos: " + devAfrain.getConteudosConluidos());
		System.out.println(devAfrain.calcularTotalXp());

	}

}
