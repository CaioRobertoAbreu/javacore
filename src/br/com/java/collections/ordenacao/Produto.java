package br.com.java.collections.ordenacao;

public class Produto implements Comparable<Produto>{

	private Integer id;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(int id, String nome, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	

	public int getQuantidade() {
		return quantidade;
	}


	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}


	@Override
	public int compareTo(Produto outroProdutoId) {
		//retorna 1 se this > outroProdutoId;
		//retorna 0 se this = outroProdutoId;
		//retorna -1 se this < outroProdutoId;
		
		return  this.id.compareTo(outroProdutoId.getId());
	}
	
	

}
