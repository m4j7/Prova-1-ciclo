package br.com.prova.crudMotorista;

import java.sql.Date;
import java.time.LocalDateTime;

public class Motorista extends AbstractyEntity{
	

	private String nome; 
	private String nrCpf;
	private String nrTelefone;
	private Date dtNascimento;
	private String nrCep;
	private String dsLagradouro;
	private int nrCasa;
	private String cidade;
	private String nacionalidade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNrCpf() {
		return nrCpf;
	}
	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
	}
	public String getNrTelefone() {
		return nrTelefone;
	}
	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getNrCep() {
		return nrCep;
	}
	public void setNrCep(String nrCep) {
		this.nrCep = nrCep;
	}
	public String getDsLagradouro() {
		return dsLagradouro;
	}
	public void setDsLagradouro(String dsLagradouro) {
		this.dsLagradouro = dsLagradouro;
	}
	public int getNrCasa() {
		return nrCasa;
	}
	public void setNrCasa(int nrCasa) {
		this.nrCasa = nrCasa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Motorista(String nome, String nrCpf, String nrTelefone, Date dtNascimento, String nrCep,
			String dsLagradouro, int nrCasa, String cidade, String nacionalidade) {
		super();
		this.nome = nome;
		this.nrCpf = nrCpf;
		this.nrTelefone = nrTelefone;
		this.dtNascimento = dtNascimento;
		this.nrCep = nrCep;
		this.dsLagradouro = dsLagradouro;
		this.nrCasa = nrCasa;
		this.cidade = cidade;
		this.nacionalidade = nacionalidade;
	}
	
	public Motorista() {
		
	}
	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", nrCpf=" + nrCpf + ", nrTelefone=" + nrTelefone + ", dtNascimento="
				+ dtNascimento + ", nrCep=" + nrCep + ", dsLagradouro=" + dsLagradouro + ", nrCasa=" + nrCasa
				+ ", cidade=" + cidade + ", nacionalidade=" + nacionalidade + "]";
	}
	
	
	
	
	
	
	
}
