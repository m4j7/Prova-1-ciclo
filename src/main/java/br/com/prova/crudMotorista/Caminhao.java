package br.com.prova.crudMotorista;

public class Caminhao extends AbstractyEntity  {

	private long kmRodado;
	private String nrPlaca;
	private String nmMarca;
	private int ano;
	private String cor;
	private String dsObservacao;
	
	public long getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(long kmRodado) {
		this.kmRodado = kmRodado;
	}
	public String getNrPlaca() {
		return nrPlaca;
	}
	public void setNrPlaca(String nrPlaca) {
		this.nrPlaca = nrPlaca;
	}
	public String getNmMarca() {
		return nmMarca;
	}
	public void setNmMarca(String nmMarca) {
		this.nmMarca = nmMarca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDsObservacao() {
		return dsObservacao;
	}
	public void setDsObservacao(String dsObservacao) {
		this.dsObservacao = dsObservacao;
	}
	@Override
	public String toString() {
		return "Caminhao [kmRodado=" + kmRodado + ", nrPlaca=" + nrPlaca + ", nmMarca=" + nmMarca + ", ano=" + ano
				+ ", cor=" + cor + ", dsObservacao=" + dsObservacao + "]";
	}
	
	
	
	
}
