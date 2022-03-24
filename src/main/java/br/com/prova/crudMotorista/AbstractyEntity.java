package br.com.prova.crudMotorista;

import java.time.LocalDateTime;

public  abstract class AbstractyEntity {

		
	private long id; 
	private LocalDateTime cadastro; 
	private LocalDateTime Atualizado; 
	private LocalDateTime excluido;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getCadatro() {
		return cadastro;
	}
	public void setCadatro(LocalDateTime cadastro) {
		this.cadastro = cadastro;
	}
	public LocalDateTime getAtualizado() {
		return Atualizado;
	}
	public void setAtualizado(LocalDateTime atualizado) {
		Atualizado = atualizado;
	}
	public LocalDateTime getExcluido() {
		return excluido;
	}
	public void setExcluido(LocalDateTime excluido) {
		this.excluido = excluido;
	} 
	
	
	
	
	
	
}
