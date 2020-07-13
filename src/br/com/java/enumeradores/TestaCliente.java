package br.com.java.enumeradores;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente caio = new Cliente("Caio Abreu", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA);
		
		System.out.println(caio);
		
		caio.setTipoCliente(TipoCliente.PESSOA_FISICA);
		System.out.println(caio);
		
	}

}
