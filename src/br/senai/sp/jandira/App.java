package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Arquivo;
import br.senai.sp.jandira.ui.FrameManipulacaoArquivos;

public class App {
	
	public static void main(String[] args) {
		
		FrameManipulacaoArquivos tela = new FrameManipulacaoArquivos();
		tela.setVisible(true);
		
		/*Arquivo teste = new Arquivo("C:\\Users\\21276092\\Desktop\\TesteArquivo\\teste.txt");
		
		String texto1 = "Banana";
		String texto2 = "Abacaxi";
		String texto3 = "Manga";
		String texto4 = "Abacate";
		String texto5 = "Laranja";
		
		teste.escrever(texto1);
		teste.escrever(texto2);
		teste.escrever(texto3);
		teste.escrever(texto4);
		teste.escrever(texto5);
		
		System.out.println(teste.ler());*/
	}
}
