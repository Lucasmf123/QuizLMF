import java.util.ArrayList;

public class Jogadores {

	// Atributos
	private String nome;
	private int pontuacao;
	private String data;

	// ArrayList
	public static ArrayList<Jogadores> dados = new ArrayList<>();

	// Métodos magicos

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public int getPontuacao() {
		return pontuacao;

	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static ArrayList<Jogadores> getDados() {
		return dados;
	}

	public static void setDados(ArrayList<Jogadores> dados) {
		Jogadores.dados = dados;
	}
	
	

}