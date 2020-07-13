package br.com.java.enumeradores;

public enum TipoCliente {
	PESSOA_FISICA(1), PESSOA_JURIDICA(2); //As constantes sempre tem que vir antes dos atributos
	//N�o � obrigatorio os numeros apos a constante
	//Os numeros n�o ser�o passados quando estiver executando
	
	private int tipo;
	
	TipoCliente(int tipo){
		this.tipo = tipo;
	}
	//O construtor � automaticamente privado e ser� invocado.
	
	public int getTipo() { //Solicita os valor do tipo
		return tipo;
	}
	
	// OUTRO EXEMPLO DE IMPLEMENTA��O
//	
//	PESSOA_FISICA(1, "Pessoa F�sica"), PESSOA_JURIDICA(2, "Pessoa Jur�dica"); 
//	
//	private int tipo;
//	private int nome;
//	
//	TipoCliente(int tipo, String nome){
//		this.tipo = tipo;
//		this.nome = nome;
//	}
//	
//	
//	public int getTipo() { 
//		return tipo;
//	}
//	
//	public int getNome() {
//		return nome;
//	}
	
	
//	Na classe cliente eu poderia chamar o getNome no lugar do tipo de Cliente;

}
