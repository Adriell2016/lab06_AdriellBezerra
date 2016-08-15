package jogo;

public class UsuarioNoob extends Usuario{
	
	public UsuarioNoob(String nome, String nomeLogin, double qtdDinheiro) {
		super(nome, nomeLogin, qtdDinheiro, 0);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void comprarJogo(Jogo jogo){
		double desconto = (10.0/100.0)*jogo.getPreco();
		double precoComDesconto = (jogo.getPreco()-desconto);
		comprarJogo(jogo);
	    setQtdDinheiro(getQtdDinheiro() - precoComDesconto);
	    setX2p(getX2p() + (((int) jogo.getPreco()) * 10));
	}
		
	
}
