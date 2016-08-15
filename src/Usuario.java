package jogo;

import java.util.ArrayList;

public class Usuario {
	private int x2p;
	private String nome;
	private String nomeLogin;
	private double qtdDinheiro;
	private ArrayList<Jogo> jogosComprados = new ArrayList<Jogo>();
	
	
	public Usuario(String nome, String nomeLogin, double qtdDinheiro, int x2p){
		this.nome = nome;
		this.nomeLogin = nomeLogin;
		this.qtdDinheiro = qtdDinheiro;
		this.setX2p(x2p);
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
	
	public void registraJogada(Jogo jogo, int score, boolean zerou) throws Exception{
		
		if(score > 100000){
			throw new Exception("O score nao pode ser maior que 100000");
		}
		
		jogo.registraJogada(score, zerou);
		if (jogo.getTipo().equals("rpg")){
			setX2p(getX2p()+10);
			if(score > jogo.getMaiorScore()){
				jogo.setMaiorScore(score);
			}
		}else if(jogo.getTipo().equals("plataforma")){
			setX2p(getX2p()+20);
			if(score > jogo.getMaiorScore()){
				jogo.setMaiorScore(score);
			}
		}else{
			if(score > jogo.getMaiorScore()){
				int s = score/1000;
				setX2p(getX2p()+(1*s));
				jogo.setMaiorScore(score);
			}
		}
		
		
	}
	
}
