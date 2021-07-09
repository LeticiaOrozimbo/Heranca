package Familia28;

public class Pregui�a extends Animal{
	//Bradypus e Choloepus
	private String genero;
	private String habitos;
	
	public Pregui�a(String nome,int idade, String genero,String habitos)
	{
		super(nome,idade);
		this.genero = genero;
		this.habitos = habitos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHabitos() {
		return habitos;
	}

	public void setHabitos(String habitos) {
		this.habitos = habitos;
	}
	
	public void ImprimirInfosPregui()
	{
		System.out.println("\nNome do cachorro: "+getNome()+" Idade: "+getIdade()+"\nGenero: "+genero+" Habitos: "+habitos);
	}
	

}
