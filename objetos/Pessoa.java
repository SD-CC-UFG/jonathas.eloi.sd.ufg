package rmi.objetos;

import java.util.*;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Pessoa implements Serializable {
	String nome = "";
	String cargo = "";
	Float salario = 0F;
	int idade = 0;
	String sexo = "";
	boolean maioridade = false;

	public Pessoa() {

	}

	public Pessoa(String nome, String cargo, Float salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public boolean getMaioridade() {
		return maioridade;
	}

	public void setMaioridade(boolean maioridade) {
		this.maioridade = maioridade;
	}
}