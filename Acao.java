import java.util.Date;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;


public class Acao {
	
	// Métodos para cadastro
	public static void Cadastrar(String nome, int pontuacao) {

		Date d = new Date();
		
		// Criar objeto
		Jogadores pc = new Jogadores();
		pc.setNome(nome);
		pc.setPontuacao(pontuacao);
		pc.setData(d.toString());

		// Add ao ArrayList
		Jogadores.dados.add(pc);

	}

	// Método para retornar os dados do cliente cadastrado
	public DefaultTableModel listarClienteCadastrado() {

		// DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Pontuação");
		modelo.addColumn("Data");

		for (int indice = 0; indice < Jogadores.dados.size(); indice++) {

			modelo.addRow(new Object[] { Jogadores.dados.get(indice).getNome(),
					Jogadores.dados.get(indice).getPontuacao(), 
					Jogadores.dados.get(indice).getData()
					});

		}

		// Retorno
		return modelo;

	}


}
