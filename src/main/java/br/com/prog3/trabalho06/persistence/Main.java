package br.com.prog3.trabalho06.persistence;

import java.util.List;

import br.com.prog3.trabalho06.model.Aluno;

public class Main {
	public static void main(String[] args) {
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno aluno = ad.findByMatricula(2);
		if (aluno != null) {
			System.out.println(aluno.getNome());
		}
	}
}
