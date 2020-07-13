package br.com.java.collections.equals;

public class Celular {

	private String IMEI;
	private String nome;

	public Celular(String IMEI, String nome) {
		this.IMEI = IMEI;
		this.nome = nome;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//REGRAS DE BOAS PRATICAS E IMPLEMENTACAO:
	//**Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
    //**Simetrico para xe y diferentes de null, se x.equals(y) == true logo y.equals(x) tem que ser true
    //**Transitividade para x, y, z diferentes de null, se x.equals(y) == true, logo y.equals(x) == true e 
	//x.equals(z) == true logo y.equals(z) também tem que ser true
    //**Consistente x.equals(y) deve sempre retornar o mesmo valor
    // para x diferente de null x.equals(null) tem que retornar false;
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		Celular celular = (Celular) obj;
		return IMEI != null && IMEI.equals(celular.getIMEI());		

	}
}
