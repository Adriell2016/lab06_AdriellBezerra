

public class JogoRPG extends Jogo {
		
	public JogoRPG(String nome, double preco) {
		super(nome, preco);
		
	}
	
	@Override
	public String toString(){
		return super.toString() + "RPG:\n" + "==> Jogou " + this.getQuantasVezesJogou() + " vez(es)\n"
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
		this.setX2p(10);
	}
	
}
