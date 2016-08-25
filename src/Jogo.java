/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */
import java.util.ArrayList;


public class Jogo {
	private ArrayList<Jogabilidade> enums = new ArrayList<Jogabilidade>();
	private String nome;
	private double preco;
	private int maiorScore;
	private int quantasVezesJogou;
	private int quantasVezesZerou;
	
	
	private int x2p;
		
	public Jogo(String nome, double preco) throws Exception{
		
		
		if(nome.trim().equals("") || nome == null){
			Exception e = new Exception("Nome do Jogo vazio ou nulo");
			throw e;
		}
		
		if(preco < 0.0){
			Exception e = new Exception("Preco inferior a 0");
			throw e;
		}
		
		
		this.nome = nome;
		this.preco = preco;
		this.maiorScore = 0;
		this.quantasVezesJogou = 0;
		this.quantasVezesZerou = 0;
		this.setX2p(0);
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
	
	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}
	
	public void registraJogada(int score, boolean zerou) throws Exception{
		
		if(score < 0){
			Exception e = new Exception("score menor que 0.");
			throw e;
		}
		
		setQuantasVezesJogou(getQuantasVezesJogou()+1);
		if(zerou == true){
			setQuantasVezesZerou(getQuantasVezesZerou()+1);
		}
	}
	
	public void Jogabilidade(Jogabilidade jogabilidade){
		boolean existe = false;
		for (Jogabilidade jogabilidade2 : enums) {
			if(jogabilidade == jogabilidade2){
				existe = true;
				break;
			}
		}
				
		if(existe == false){
			enums.add(jogabilidade);
		}
			
	}
	
	
	public String imprimeEnums(){
		String s = "";
		for(int i = 0; i < enums.size(); i++){
			System.out.println(enums.get(i).toString());
			s += " " + enums.get(i).toString();
		}
		return s;
		
	}
	
	@Override
	public boolean equals(Object obj){
		
		boolean retorno = false;
		
		if(obj instanceof JogoLuta){
			Jogo outro = (Jogo) obj;
			if(outro.getNome().equals(this.nome)){
				retorno = true;
			}
		}else if(obj instanceof JogoPlataforma){
			Jogo outro = (Jogo) obj;
			if(outro.getNome().equals(this.nome)){
				retorno = true;
			}
		}else if(obj instanceof JogoRPG){
			Jogo outro = (Jogo) obj;
			if(outro.getNome().equals(this.nome)){
				retorno = true;
			}
		}
		return retorno;
	}
	
	@Override
	public String toString(){
		return "+ " + this.nome + " - ";
	}

	
}
