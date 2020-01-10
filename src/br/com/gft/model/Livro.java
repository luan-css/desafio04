package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	private String autor;
	private String tema;
	private int qtdPag;

	public Livro(String nome, double preco, int qtd) {
		super(nome, preco, qtd);
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public void calculaImposto() {
		double precoaux = getPreco();
		if (tema.equals("Educativo")) {
			System.out.println("Livro educativo não tem imposto: " + getNome());

		} else {
			precoaux = (precoaux * 10) / 100;
			System.out.println("R$ " + precoaux + " de impostos sobre o livro " + getNome());
		}
	}
}
