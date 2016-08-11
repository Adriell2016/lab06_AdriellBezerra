public class Jogo {

	private String nome;
	private double preco;
	private int maiorScore;
	private int quantasVezesJogou;
	private int quantasVezesZerou;
	
	public Jogo(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		maiorScore = 0;
		quantasVezesJogou = 0;
		quantasVezesZerou = 0;
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
	
	//Adicionei esse método
	public void registraJogada(int score, boolean zerou){
		setQuantasVezesJogou(getQuantasVezesZerou()+1);
		if(zerou == true){
			setQuantasVezesZerou(getQuantasVezesZerou()+1);
		}
		if(score > maiorScore){
			setMaiorScore(score);
		}
	}
}
