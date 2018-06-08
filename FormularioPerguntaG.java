import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioPerguntaG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPerguntaG frame = new FormularioPerguntaG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int i = 0;
	int acertos = 0;
	int erros = 0;
	int indice = 0;
	int questoescontador = 0;
	int pulos = 0;

	/**
	 * Create the frame.
	 */
	public FormularioPerguntaG() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormularioPerguntaG.class.getResource("/imagens/icons8-help-80.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Geografia g = new Geografia();
		g.cadastrarPerguntas();
		Padrao.gerarValoresAleatorios();

		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setForeground(Color.WHITE);
		label.setBackground(Color.BLACK);
		label.setBounds(10, 11, 594, 45);
		contentPane.add(label);
		label.setOpaque(true);
		setVisible(true);
		label.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getPergunta());

		JRadioButton rdbtnNewRadioButton = new JRadioButton(
				Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoA());
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setActionCommand("a");
		rdbtnNewRadioButton.setBounds(10, 84, 437, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(
				Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoB());
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setActionCommand("b");
		rdbtnNewRadioButton_1.setBounds(10, 125, 437, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(
				Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoC());
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setActionCommand("c");
		rdbtnNewRadioButton_2.setBounds(10, 167, 437, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton(
				Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoD());
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setActionCommand("d");
		rdbtnNewRadioButton_3.setBounds(10, 210, 437, 23);
		contentPane.add(rdbtnNewRadioButton_3);

		// Adicionar perguntas e respostas
		ButtonGroup questoes = new ButtonGroup();
		questoes.add(rdbtnNewRadioButton);
		questoes.add(rdbtnNewRadioButton_1);
		questoes.add(rdbtnNewRadioButton_2);
		questoes.add(rdbtnNewRadioButton_3);

		JButton btnPular = new JButton("Pular!");
		btnPular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPular.setForeground(Color.WHITE);
		btnPular.setBackground(Color.BLACK);
		btnPular.setBounds(515, 220, 89, 23);
		contentPane.add(btnPular);
		
		btnPular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				i++;
				pulos++;
				questoescontador++;
				label.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getPergunta());
				rdbtnNewRadioButton.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoA());
				rdbtnNewRadioButton_1.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoB());
				rdbtnNewRadioButton_2.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoC());
				rdbtnNewRadioButton_3.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoD());
				
				if (pulos == 3) {
					btnPular.setEnabled(false);
				}
				
			}
		});

		JButton btnAjuda = new JButton("Ajuda!");
		btnAjuda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAjuda.setForeground(Color.WHITE);
		btnAjuda.setBackground(Color.BLACK);
		btnAjuda.setBounds(515, 186, 89, 23);
		contentPane.add(btnAjuda);

		JButton btnConferir = new JButton("Conferir!");
		btnConferir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConferir.setForeground(Color.WHITE);
		btnConferir.setBackground(Color.BLACK);
		btnConferir.setBounds(515, 116, 89, 59);
		contentPane.add(btnConferir);

		btnConferir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					if (Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getResposta() == questoes
							.getSelection().getActionCommand().charAt(0)) {

						JOptionPane.showMessageDialog(null, "Resposta Certa");
						acertos++;

					} else {

						JOptionPane.showMessageDialog(null, "Resposta Errada");
						erros++;

					}
					System.out.println(questoes.getSelection().getActionCommand());

					i++;

				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Informe uma alternativa!");
				}

				questoescontador++;

				if ((questoescontador-pulos) == 10) {
					Jogadores j = new Jogadores();
					
					j.getDados().get(j.getDados().size()-1).setPontuacao(acertos);
					FormularioResultado fr = new FormularioResultado();
					dispose();
					fr.setVisible(true);
					
				}
				
				label.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getPergunta());
				rdbtnNewRadioButton.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoA());
				rdbtnNewRadioButton_1.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoB());
				rdbtnNewRadioButton_2.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoC());
				rdbtnNewRadioButton_3.setText(Padrao.conjuntoPerguntas.get(Padrao.indicesAleatorios[i]).getQuestaoD());
				
				
			}

		});

	}

}
