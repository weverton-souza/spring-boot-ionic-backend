package com.weverton.cursomc.enums;


public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(final int cod, final String descricao) {

		this.cod = cod;
		this.descricao = descricao;
	}
	
	public static EstadoPagamento toEnum(final Integer cod) {
		
		if(cod == null)
			return null;
		
		for(EstadoPagamento t : EstadoPagamento.values()) {
			
			if(cod.equals(t.getCod()))
				return t;
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

	public int getCod() {
	
		return cod;
	}

	public String getDescricao() {
	
		return descricao;
	}	
}
