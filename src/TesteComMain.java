package jogo;

public class TesteComMain {
	public static void main(String[] args){
		testaJogabilidade();
		
		
	}
	
	public static void testaJogabilidade(){
		JogoRPG novoJogo = new JogoRPG("jogo1", 7.99);
		novoJogo.registraJogada(10, false);
		novoJogo.Jogabilidade(Jogabilidade.COMPETITIVO);
		novoJogo.Jogabilidade(Jogabilidade.COMPETITIVO);
		novoJogo.Jogabilidade(Jogabilidade.OFFLINE);
		novoJogo.Jogabilidade(Jogabilidade.MULTIPLAYER);
		novoJogo.Jogabilidade(Jogabilidade.COOPERATIVO);
		novoJogo.Jogabilidade(Jogabilidade.ONLINE);
		novoJogo.imprimeEnums();
	}
}
