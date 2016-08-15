package jogo;

import java.util.ArrayList;

public class Usuario {
	private int x2p;
	private String nome;
	private String nomeLogin;
	private double qtdDinheiro;
	private ArrayList<Jogo> jogosComprados = new ArrayList<Jogo>();
	
	
	public void setJogosComprados(ArrayList<Jogo> jogosComprados) {
		this.jogosComprados = jogosComprados;
	}

	public Usuario(String nome, String nomeLogin, double qtdDinheiro, int x2p){
		this.nome = nome;
		this.nomeLogin = nomeLogin;
		this.qtdDinheiro = qtdDinheiro;
		this.x2p = x2p;
	}
	
	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeLogin() {
		return nomeLogin;
	}
	
	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}
	
	public double getQtdDinheiro() {
		return qtdDinheiro;
	}
	
	public void setQtdDinheiro(double qtdDinheiro) {
		this.qtdDinheiro = qtdDinheiro;
	}
	
	public ArrayList<Jogo> getJogosComprados() {
		return jogosComprados;
	}
	
	public void comprarJogo(Jogo jogo){
		jogosComprados.add(jogo);
	}
	
	public void adicionarDinheiro(double dinheiro){
		this.qtdDinheiro += dinheiro;
	}
	
	public void registraJogada(Jogo jogo, int score, boolean zerou){
		
		for (int i = 0; i < jogosComprados.size(); i++){
			
			if(jogo.equals(jogosComprados.get(i))){
				jogosComprados.get(i).setQuantasVezesJogou(jogosComprados.get(i).getQuantasVezesJogou()+1);
				//jogosComprados.get(i).registraJogada(score, zerou);
				
				if (jogo.getTipo().equals("rpg")){
					setX2p(getX2p()+10);
					jogosComprados.get(i).registraJogada(score, zerou);
				}else if(jogo.getTipo().equals("plataforma")){
					setX2p(getX2p()+20);
					jogosComprados.get(i).registraJogada(score, zerou);
				}else{
					if(score > jogosComprados.get(i).getMaiorScore()){
						int s = score/1000;
						setX2p(getX2p()+(1*s));
						jogosComprados.get(i).registraJogada(score, zerou);
					}
				}
			break;
			}
		}
			
	}
	
	public void imprimeJogosComprados(){
		for (Jogo jogo : jogosComprados) {
			System.out.println(jogo);
		}
	}
	
	@Override
	public String toString(){
		return "Usuario: " + this.nome + "\nX2P: " + this.x2p;
	}
	
}
