public class TesteComMain {
	public static void main(String[] args){
		JogoRPG novoJogo = new JogoRPG("jogo1", 7.99);
		novoJogo.registraJogada(10, false);
		novoJogo.Jogabilidade(Jogabilidade.COMPETITIVO);
		novoJogo.Jogabilidade(Jogabilidade.COMPETITIVO);
		System.out.println(novoJogo.toString());
	}
}
