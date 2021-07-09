package Familia28;


/*
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
public class Cliente {
	//declara��o de atributos(caracter�sticas)
	
	private String nome;
	private String idade;
	private String cpf;
	private String nacionalidade;
	
	//m�todo constructor
	public Cliente (String nome, String idade, String cpf,String nacionalidade)
	{
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.nacionalidade= nacionalidade;

	}
	
	//declara��o dos demais m�todos
	public void imprimirInfo()
	{
		System.out.println(nome+" com idade de: "+idade+" CPF: "+cpf+" Nacioconalidade: "+nacionalidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
