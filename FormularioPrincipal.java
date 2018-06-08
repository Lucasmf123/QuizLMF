import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormularioPrincipal.class.getResource("/imagens/icons8-help-80.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/icons8-help-80.png")));
		label.setBounds(177, 0, 257, 102);
		contentPane.add(label);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(190, 200, 109, 25);
		contentPane.add(comboBox);
		comboBox.addItem("Conhecimentos Gerais");
		comboBox.addItem("Geografia");
		comboBox.addItem("Super-Heróis");
		
		Acao a = new Acao();
		JTable tabela = new JTable(a.listarClienteCadastrado());

		JButton btnIniciar = new JButton("INICIAR!!");
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setBackground(Color.BLACK);
		btnIniciar.setBounds(335, 173, 89, 77);
		contentPane.add(btnIniciar);
		btnIniciar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						// Obter os dados informados pelo usuário
						String nome = textField.getText();
						int pontuacao = 0;

						// Criar objeto e chamar o método
						a.Cadastrar(nome, pontuacao);

						// Atualizar tabela
						tabela.setModel(a.listarClienteCadastrado());
					
				if ((!textField.getText().equals("")) && (comboBox.getSelectedItem().equals("Conhecimentos Gerais"))) {

					FormularioPerguntaP pfp = new FormularioPerguntaP();
					dispose();

				} else if ((!textField.getText().equals("")) && (comboBox.getSelectedItem().equals("Geografia"))) {

					FormularioPerguntaG pfg = new FormularioPerguntaG();
					dispose();

				} else if ((!textField.getText().equals("")) && (comboBox.getSelectedItem().equals("Super-Heróis"))) {

					FormularioPerguntaH pfh = new FormularioPerguntaH();
					dispose();

				} else {

					JOptionPane.showMessageDialog(null, "Insira um nome primeiro!");

				}

			}
		});

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(30, 200, 109, 25);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(30, 175, 81, 14);
		contentPane.add(lblNome);

		JLabel lblTemas = new JLabel("Temas:");
		lblTemas.setForeground(Color.WHITE);
		lblTemas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTemas.setBounds(190, 177, 71, 14);
		contentPane.add(lblTemas);

		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(0, 142, 434, 119);
		contentPane.add(label_1);
		label_1.setOpaque(true);

		JLabel lblQuizLmf = new JLabel("QUIZ LMF");
		lblQuizLmf.setFont(new Font("Algerian", Font.PLAIN, 36));
		lblQuizLmf.setBounds(139, 88, 248, 43);
		contentPane.add(lblQuizLmf);
		setVisible(true);
	}
}
