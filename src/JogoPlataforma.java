

public class JogoPlataforma extends Jogo{

	public JogoPlataforma(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return super.toString() + "Plataforma:\n" + "==> Jogou " + this.getQuantasVezesJogou() + " vez(es)\n"
				+ "==> Zerou " + this.getQuantasVezesZerou() + " vez(es)\n"
				+ "==> Maior score: " + this.getMaiorScore();
	}
	
	@Override
	public void registraJogada(int score, boolean zerou){
		this.setQuantasVezesJogou(getQuantasVezesJogou()+1);
		if(zerou == true){
			setQuantasVezesZerou(getQuantasVezesZerou()+1);
		}
		if(score > getMaiorScore()){
			setMaiorScore(score);
		}
		
		if(zerou == true){
			this.setX2p(20);
		}
		
	}
}
