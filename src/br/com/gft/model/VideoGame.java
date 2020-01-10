package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	private String Marca;
	private String Modelo;
	private boolean isUsado;
	
	public VideoGame(String nome, double preco, int qtd) {
		super(nome, preco, qtd);

	}
	public VideoGame(String nome, double preco, int qtd, String Marca, String Modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.isUsado = isUsado;
	}
	
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}

	public boolean setUsado(boolean isUsado) {
		this.isUsado = isUsado;
		return isUsado;
	}



	@Override
	public void calculaImposto() {
		double aux = getPreco();
		if(this.isUsado == true) {
			aux = (aux * 0.25);
			System.out.println("Imposto " + getNome() + " " + Modelo + ", R$ " + aux );
		}else {
			aux = (aux * 0.45);
			System.out.println("Imposto " + getNome() + " " + Modelo + " R$ " + aux);
		}
	}




}
