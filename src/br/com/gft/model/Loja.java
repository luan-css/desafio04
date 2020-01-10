package br.com.gft.model;

import java.util.ArrayList;

public class Loja {
	private String nome;
	private String cnpj;
	ArrayList<Livro> Livro = new ArrayList<Livro>();
	ArrayList<VideoGame> VideoGame = new ArrayList<VideoGame>();

	public Loja(String cnpj, String nome, ArrayList<Livro> Livros, ArrayList<VideoGame> games) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.Livro = Livros;
		this.VideoGame = games; 
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<Livro> getLivro() {
		return Livro;
	}

	public void setLivro(ArrayList<Livro> livro) {
		Livro = livro;
	}

	public ArrayList<VideoGame> getVideoGame() {
		return VideoGame;
	}

	public void setVideoGame(ArrayList<VideoGame> videoGame) {
		VideoGame = videoGame;
	}

	public void listaLivros() {
		if(Livro.isEmpty() == true) {
			System.out.println("A loja não tem livros no seu estoque.");
		}
			for (int i = 0; i < Livro.size(); i++) {
				System.out.println("Titulo: " + Livro.get(i).getNome() + ", preço R$" + Livro.get(i).getPreco()
					+ " , quantidade " + Livro.get(i).getQtd() + " em estoque");
			}
		

	}

	public void listaVideosGames() {
		for (int i = 0; i < VideoGame.size(); ++i) {
			System.out.println("TItulo " + VideoGame.get(i).getNome() + " , preço R$" + VideoGame.get(i).getPreco()
					+ ", quantidade " + VideoGame.get(i).getQtd() + " em estoque");
		}
	}

	public void calculaPatrimonio() {
		double x = 0;
		double y = 0;

		for(int i = 0; i < Livro.size(); i++) {
			x += Livro.get(i).getPreco() * Livro.get(i).getQtd();	
		}
		for(int i = 0; i < VideoGame.size(); i++) {
			y += VideoGame.get(i).getPreco() * VideoGame.get(i).getQtd();
		}
		double total = x + y;
		System.out.println("O Patrimonio da loja: Americanas é de R$ " + total);
	}
}
