

public class JogoLuta extends Jogo{

	
	public JogoLuta(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return super.toString() + "Luta:\n" + "==> Jogou " + this.getQuantasVezesJogou() + " vez(es)\n"
				+ "==> Zerou " + this.getQuantasVezesZerou() + " vez(es)\n"
				+ "==> Maior score: " + this.getMaiorScore();
	}
	
	@Override
	public void registraJogada(int score, boolean zerou){
		this.setQuantasVezesJogou(getQuantasVezesJogou()+1);
		if(zerou == true){
			setQuantasVezesZerou(getQuantasVezesZerou()+1);
		}
		//Acrescentado o segundo ig  - TESTES
		if(score > getMaiorScore()){
			
			this.setX2p(score/1000);
		}
		
		if(score > getMaiorScore()){
			setMaiorScore(score);
		}
		
	}
}
