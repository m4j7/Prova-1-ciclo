package br.com.prova.crudMotorista;

import java.time.LocalDateTime;

public class Frete extends AbstractyEntity {
 
	private Double  kmInicial;
	private Double KmFinal;
	private String produto;
	private Double pesoInicial; 
	private Double pesoFinal;
	private Double pesoTotal;
	private LocalDateTime dtInicial;
	private LocalDateTime dtFinal;
	private Double precoTonelada;
	private Double totalBrutoRecebido;
	private String dsObservação;
	private Motorista motorista;
	private Caminhao caminhao;
	public Double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(Double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public Double getKmFinal() {
		return KmFinal;
	}
	public void setKmFinal(Double kmFinal) {
		KmFinal = kmFinal;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getPesoInicial() {
		return pesoInicial;
	}
	public void setPesoInicial(Double pesoInicial) {
		this.pesoInicial = pesoInicial;
	}
	public Double getPesoFinal() {
		return pesoFinal;
	}
	public void setPesoFinal(Double pesoFinal) {
		this.pesoFinal = pesoFinal;
	}
	public Double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public LocalDateTime getDtInicial() {
		return dtInicial;
	}
	public void setDtInicial(LocalDateTime dtInicial) {
		this.dtInicial = dtInicial;
	}
	public LocalDateTime getDtFinal() {
		return dtFinal;
	}
	public void setDtFinal(LocalDateTime dtFinal) {
		this.dtFinal = dtFinal;
	}
	public Double getPrecoTonelada() {
		return precoTonelada;
	}
	public void setPrecoTonelada(Double precoTonelada) {
		this.precoTonelada = precoTonelada;
	}
	public Double getTotalBrutoRecebido() {
		return totalBrutoRecebido;
	}
	public void setTotalBrutoRecebido(Double totalBrutoRecebido) {
		this.totalBrutoRecebido = totalBrutoRecebido;
	}
	public String getDsObservação() {
		return dsObservação;
	}
	public void setDsObservação(String dsObservação) {
		this.dsObservação = dsObservação;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Caminhao getCaminhao() {
		return caminhao;
	}
	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}
	
	
	public Frete(Double kmInicial, Double kmFinal, String produto, Double pesoInicial, Double pesoFinal,
			Double pesoTotal, LocalDateTime dtInicial, LocalDateTime dtFinal, Double precoTonelada,
			Double totalBrutoRecebido, String dsObservação, Motorista motorista, Caminhao caminhao) {
		super();
		this.kmInicial = kmInicial;
		KmFinal = kmFinal;
		this.produto = produto;
		this.pesoInicial = pesoInicial;
		this.pesoFinal = pesoFinal;
		this.pesoTotal = pesoTotal;
		this.dtInicial = dtInicial;
		this.dtFinal = dtFinal;
		this.precoTonelada = precoTonelada;
		this.totalBrutoRecebido = totalBrutoRecebido;
		this.dsObservação = dsObservação;
		this.motorista = motorista;
		this.caminhao = caminhao;
	}
	@Override
	public String toString() {
		return "Frete [kmInicial=" + kmInicial + ", KmFinal=" + KmFinal + ", produto=" + produto + ", pesoInicial="
				+ pesoInicial + ", pesoFinal=" + pesoFinal + ", pesoTotal=" + pesoTotal + ", dtInicial=" + dtInicial
				+ ", dtFinal=" + dtFinal + ", precoTonelada=" + precoTonelada + ", totalBrutoRecebido="
				+ totalBrutoRecebido + ", dsObservação=" + dsObservação + ", motorista=" + motorista + ", caminhao="
				+ caminhao + "]";
	}
	
	
}
