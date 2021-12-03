package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Arquivo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class FrameManipulacaoArquivos extends JFrame {

	private JPanel contentPane;
	private Arquivo arquivo;

	public FrameManipulacaoArquivos() {
		this.arquivo = new Arquivo("C:\\Users\\21276092\\Desktop\\TesteArquivo\\teste.txt");
		setTitle("Manipula\u00E7\u00E3o de Arquivos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManipulacaoDeArquivos = new JLabel("Manipula\u00E7\u00E3o de Arquivos");
		lblManipulacaoDeArquivos.setBounds(87, 11, 137, 24);
		contentPane.add(lblManipulacaoDeArquivos);
		
		JLabel lblTexto = new JLabel("Texto:");
		lblTexto.setBounds(10, 42, 46, 14);
		contentPane.add(lblTexto);
		
		JScrollPane scrollPaneTexto = new JScrollPane();
		scrollPaneTexto.setBounds(10, 67, 314, 169);
		contentPane.add(scrollPaneTexto);
		
		JTextPane textPane = new JTextPane();
		scrollPaneTexto.setViewportView(textPane);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			arquivo.escrever(textPane.getText());
			textPane.setText("");
			}
		});
		btnGravar.setBounds(10, 262, 89, 23);
		contentPane.add(btnGravar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.setText(arquivo.ler());
				
			}
		});
		btnExibir.setBounds(124, 262, 89, 23);
		contentPane.add(btnExibir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
			}
		});
		btnLimpar.setBounds(235, 262, 89, 23);
		contentPane.add(btnLimpar);
	}
}
