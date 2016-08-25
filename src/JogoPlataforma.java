/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */

public class JogoPlataforma extends Jogo{

	public JogoPlataforma(String nome, double preco) throws Exception {
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
	public void registraJogada(int score, boolean zerou) throws Exception{
		super.registraJogada(score, zerou);
		
		if(score > getMaiorScore()){
			setMaiorScore(score);
		}
		
		if(zerou == true){
			this.setX2p(20);
		}
		
	}
}
