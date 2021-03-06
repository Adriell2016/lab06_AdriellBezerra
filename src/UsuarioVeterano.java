/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */

public class UsuarioVeterano extends Usuario {

	public UsuarioVeterano(String nome, String nomeLogin, double qtdDinheiro) throws Exception {
		super(nome, nomeLogin, qtdDinheiro);
		this.setX2p(1000);
		
		
	}

	@Override
	public void comprarJogo(Jogo jogo){
		double desconto = (20.0/100.0)*jogo.getPreco();
		double precoComDesconto = (jogo.getPreco()-desconto);
		super.comprarJogo(jogo);
	    setQtdDinheiro(getQtdDinheiro() - precoComDesconto);
	    setX2p(getX2p() + (((int) jogo.getPreco()) * 15));
	    
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + super.getNome() + " - Jogador Veterano";
		
	}
}
