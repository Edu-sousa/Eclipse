package Herança;

public abstract class Animal {
	
	private String tipoAnimal;
	
	public Animal (String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	//abstract public void nome(String nome);
	//abstract public void idade(String idade);
	//abstract public void som(String som);
	//abstract public void habilidade(String habilidade);
	
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	

}
