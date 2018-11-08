package br.com.prog3.trabalho06.persistence;

import java.util.List;

import br.com.prog3.trabalho06.model.Aluno;

public interface AlunoDao {
	public String save(Aluno aluno);
	public String delete(int matricula);
	public String update(Aluno aluno);
	public List<Aluno> list();
	public Aluno findByMatricula(int matricula);
}
