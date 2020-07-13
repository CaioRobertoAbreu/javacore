package br.com.java.enumeradores;

public class Cliente {
	public enum TipoPagamento {
		AVISTA, APRAZO;
		
		}
	//Enumeradores podem ser internos (dentro da classe)
	//ou externos (criando uma classe so para eles).
	
	
	private String nome;
	private TipoCliente tipoDeCliente;
	private TipoPagamento pagamento;
	
	
	public Cliente(String nome, TipoCliente tipo, TipoPagamento pagamento) {
		this.nome = nome;
		this.tipoDeCliente = tipo;
		this.pagamento = pagamento;
	}
	
	public TipoPagamento getPagamento() {
		return pagamento;
	}
	

	public TipoCliente getTipoDeCliente() {
		return tipoDeCliente;
	}

	public void setTipoCliente(TipoCliente tipo) {
		this.tipoDeCliente = tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "{" + this.nome.toUpperCase() + " - " + this.tipoDeCliente + 
				"(" + this.tipoDeCliente.getTipo() + ")" + " - " + this.pagamento + 
				 "}";
	}
}
