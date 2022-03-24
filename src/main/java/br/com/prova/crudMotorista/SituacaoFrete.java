package br.com.prova.crudMotorista;

public enum SituacaoFrete {

	carga("Carga"),
	transporte("Transporte"),
	interrompido("Interrompido"),
	descarga("Descarga"),
	faturado("Faturado"),
	cancelado("Cancelado");

	
    public final String valor;

	private SituacaoFrete(String valor) {
		this.valor = valor;
	}

   
	
}
