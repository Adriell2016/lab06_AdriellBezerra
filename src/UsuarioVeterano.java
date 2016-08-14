package jogo;

public class UsuarioVeterano extends Usuario {

	public UsuarioVeterano(String nome, String nomeLogin, double qtdDinheiro) {
		super(nome, nomeLogin, qtdDinheiro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comprarJogo(Jogo jogo){
		double desconto = (20.0/100.0)*jogo.getPreco();
		double precoComDesconto = (jogo.getPreco()-desconto);
		comprarJogo(jogo);
	    setQtdDinheiro(getQtdDinheiro() - precoComDesconto);
	}
}
