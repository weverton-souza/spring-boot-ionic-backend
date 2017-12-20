package com.weverton.cursomc.enums;


public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa física"),
	PESSOAJURIDICA(2, "Pessoa jurídica");
	
	private int cod;
	private String descricao;
	
	
	private TipoCliente(final int cod, final String descricao) {

		this.cod = cod;
		this.descricao = descricao;
	}
	
	public static TipoCliente toEnum(final Integer cod) {
		
		if(cod == null)
			return null;
		
		for(TipoCliente t : TipoCliente.values()) {
			
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
