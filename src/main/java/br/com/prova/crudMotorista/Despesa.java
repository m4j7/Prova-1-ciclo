package br.com.prova.crudMotorista;

public class Despesa {

	
	private String TipoDespesa;
	private String vlDespesa;
	
	public String getNmDespesa() {
		return TipoDespesa;
	}
	public void setNmDespesa(String nmDespesa) {
		this.TipoDespesa = nmDespesa;
	}
	public String getVlDespesa() {
		return vlDespesa;
	}
	public void setVlDespesa(String vlDespesa) {
		this.vlDespesa = vlDespesa;
	}
	public Despesa(String nmDespesa, String vlDespesa) {
		super();
		this.TipoDespesa = nmDespesa;
		this.vlDespesa = vlDespesa;
	}
	@Override
	public String toString() {
		return "TipoDespesa [nmDespesa=" + TipoDespesa + ", vlDespesa=" + vlDespesa + "]";
	}
	
	
	
	
	
}
