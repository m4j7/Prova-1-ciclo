package br.com.prova.crudMotorista;

public enum StDespesa {
	
	aprovada("aprovada"),
	negada("negada");

    public final String valor;

	private StDespesa(String valor) {
		this.valor = valor;
	}

}
