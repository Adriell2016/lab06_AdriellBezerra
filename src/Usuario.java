/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */

import java.util.ArrayList;

public class Usuario {
	private int x2p;
	private String nome;
	private String nomeLogin;
	private double qtdDinheiro;
	private ArrayList<Jogo> jogosComprados = new ArrayList<Jogo>();
	
	
	public Usuario(String nome, String nomeLogin, double qtdDinheiro) throws Exception{
		
		if(nome.trim().equals("") || nome == null){
			Exception e = new Exception("Nome vazio ou nulo.");
			throw e;
		}
		
		if(nomeLogin.trim().equals("") || nomeLogin == null){
			Exception e = new Exception("Nome de login vazio ou nulo.");
			throw e;
		}
		
		this.nome = nome;
		this.nomeLogin = nomeLogin;
		this.qtdDinheiro = qtdDinheiro;
		
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
	
	public void setJogosComprados(ArrayList<Jogo> jogosComprados) {
		this.jogosComprados = jogosComprados;
	}
	
	public ArrayList<Jogo> getJogosComprados() {
		return jogosComprados;
	}
	
	public void comprarJogo(Jogo jogo){
		jogosComprados.add(jogo);
	}
	
	public void adicionarDinheiro(double dinheiro) throws Exception{
		if (dinheiro < 0){
			Exception e = new Exception("Quantidade negativa");
			throw e;
		}
		this.qtdDinheiro += dinheiro;
	}
	
	
	public int registraJogada(Jogo jogo, int score, boolean zerou) throws Exception{
		int x2pJogada = 0;
		jogo.registraJogada(score, zerou);
		x2pJogada = jogo.getX2p();
		this.x2p += x2pJogada;
		jogo.setX2p(0);
		return x2pJogada;
	}
	
	
	public void imprimeJogosComprados(){
		for (Jogo jogo : jogosComprados) {
			System.out.println(jogo);
		}
	}
	
	public int sizeJogosComprados(){
		return jogosComprados.size();
	}
	
	public double totalPrecoJogos(){
		double retorno = 0;
		
		for (int i = 0; i < jogosComprados.size(); i++){
			retorno += jogosComprados.get(i).getPreco();
		}
		
		return retorno;
	}
	
	@Override
	public String toString(){
		return this.nomeLogin;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Usuario){
			Usuario outro = (Usuario) obj;
			if(outro.getNome().equals(this.nome) && outro.getNomeLogin().equals(this.nomeLogin)){
				return true;
			}
		}
		return false;
	}
	
	
}
