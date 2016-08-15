package jogo;

import java.util.ArrayList;

public class Jogo {
	private ArrayList<Jogabilidade> enums = new ArrayList<Jogabilidade>();
	private String nome;
	private double preco;
	private int maiorScore;
	private int quantasVezesJogou;
	private int quantasVezesZerou;
	private String tipo;
	
	public Jogo(String nome, double preco, String tipo){
		this.nome = nome;
		this.preco = preco;
		maiorScore = 0;
		quantasVezesJogou = 0;
		quantasVezesZerou = 0;
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getMaiorScore() {
		return maiorScore;
	}

	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	public int getQuantasVezesJogou() {
		return quantasVezesJogou;
	}

	public void setQuantasVezesJogou(int quantasVezesJogou) {
		this.quantasVezesJogou = quantasVezesJogou;
	}

	public int getQuantasVezesZerou() {
		return quantasVezesZerou;
	}

	public void setQuantasVezesZerou(int quantasVezesZerou) {
		this.quantasVezesZerou = quantasVezesZerou;
	}
	
	//Adicionei esse método.
	public void registraJogada(int score, boolean zerou){
		setQuantasVezesJogou(getQuantasVezesZerou()+1);
		if(zerou == true){
			setQuantasVezesZerou(getQuantasVezesZerou()+1);
		}
		/*if(score > maiorScore){
			setMaiorScore(score);
		}*/
	}
	
	public void Jogabilidade(Jogabilidade jogabilidade){
			boolean existe = false;
			for (Jogabilidade jogabilidade2 : enums) {
				if(jogabilidade == jogabilidade2){
					existe = true;
					//System.out.println("Jogabilidade repetida não pode ser adicionada");
					break;
				}
			}
				
			if(existe == false){
				enums.add(jogabilidade);
				//System.out.println("Jogabilidade Adicionada");
			}
			
		}
	
	public void imprimeEnums(){
		for(int i = 0; i < enums.size(); i++){
			System.out.println(enums.get(i).toString());
		}
	
		
	}
	
	@Override
	public String toString(){
		return "Nome: " + this.nome;
	}
}
