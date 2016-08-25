/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */

public class UsuarioNoob extends Usuario{
	
	public UsuarioNoob(String nome, String nomeLogin, double qtdDinheiro) throws Exception {
		super(nome, nomeLogin, qtdDinheiro);
		this.setX2p(0);
		
		
	}

	@Override
	public void comprarJogo(Jogo jogo){
		double desconto = (10.0/100.0)*jogo.getPreco();
		double precoComDesconto = (jogo.getPreco()-desconto);
		super.comprarJogo(jogo);
	    setQtdDinheiro(getQtdDinheiro() - precoComDesconto);
	    setX2p(getX2p() + (((int) jogo.getPreco()) * 10));
	}
	
	@Override
	public String toString(){
		String retorno = super.toString() + "\n" + super.getNome() + " - Jogador Noob";
		
		return retorno;
	}
	
}
