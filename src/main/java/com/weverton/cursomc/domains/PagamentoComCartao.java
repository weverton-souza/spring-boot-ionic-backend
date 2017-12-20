
package com.weverton.cursomc.domains;

import javax.persistence.Entity;

import com.weverton.cursomc.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {

	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {

	}

	public PagamentoComCartao(final Integer id, final EstadoPagamento estado, final Pedido pedido,
	          final Integer numeroDeParcelas) {

		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {

		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {

		this.numeroDeParcelas = numeroDeParcelas;
	}

}
