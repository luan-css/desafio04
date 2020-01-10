package br.com.gft.main;

import java.util.ArrayList;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

public class Main {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "Educativo", 500);
		
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

		
		ArrayList<Livro> livros = new ArrayList<>();
		//livros.add(l1);
		//livros.add(l2);
		//livros.add(l3);
		
		ArrayList<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas" , "aiaiai", livros, games);
		
		l2.calculaImposto();
		l3.calculaImposto();
		
		
		ps4Usado.calculaImposto();
		ps4.calculaImposto();
		System.out.println("-------------------------------------------------");
		
		System.out.println("A lojas Americanas possui estes livros para venda:");
		americanas.listaLivros();	
		
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("A lojas Americanas possui estés video-games para venda: ");
		americanas.listaVideosGames();
		
		System.out.println("-------------------------------------------------");
		
		americanas.calculaPatrimonio();
		
	}

}
