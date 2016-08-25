/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */

public class JogoRPG extends Jogo {
		
	public JogoRPG(String nome, double preco) throws Exception {
		super(nome, preco);
		
	}
	
	@Override
	public String toString(){
		return super.toString() + "RPG:\n" + "==> Jogou " + this.getQuantasVezesJogou() + " vez(es)\n"
				+ "==> Zerou " + this.getQuantasVezesZerou() + " vez(es)\n"
				+ "==> Maior score: " + this.getMaiorScore();
	}
	
	@Override
	public void registraJogada(int score, boolean zerou) throws Exception{
		super.registraJogada(score, zerou);
		
		if(score > getMaiorScore()){
			setMaiorScore(score);
		}
		this.setX2p(10);
	}
	
}
