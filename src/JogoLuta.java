/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */

public class JogoLuta extends Jogo{

	
	public JogoLuta(String nome, double preco) throws Exception {
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
	public void registraJogada(int score, boolean zerou) throws Exception{
		if(score > 100000){
			Exception e = new Exception("Score alcancado maior que 100000.");
			throw e;
		}
		super.registraJogada(score, zerou);
		
		//Acrescentado o segundo ig  - TESTES
		if(score > getMaiorScore()){
			
			this.setX2p(score/1000);
		}
		
		if(score > getMaiorScore()){
			setMaiorScore(score);
		}
		
	}
}
