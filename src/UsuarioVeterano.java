;

public class UsuarioVeterano extends Usuario {

	public UsuarioVeterano(String nome, String nomeLogin, double qtdDinheiro) {
		super(nome, nomeLogin, qtdDinheiro, 1000);
		// TODO Auto-generated constructor stub
		
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
		return super.toString() + "/n" + super.getNome() + " - Jogador Veterano";
		
	}
}
