

public class TesteComMain {
	public static void main(String[] args){
		//testaJogabilidade();
		compraJogoRegistraJogada();
		
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
		
		System.out.println("\n\n");
		
		JogoLuta novoJogo2 = new JogoLuta("BoxePixel", 100.80);
		novoJogo2.registraJogada(450, true);
		novoJogo2.Jogabilidade(Jogabilidade.ONLINE);
		novoJogo2.Jogabilidade(Jogabilidade.ONLINE);
		novoJogo2.Jogabilidade(Jogabilidade.OFFLINE);
		novoJogo2.imprimeEnums();
	}
	
	public static void compraJogoRegistraJogada(){
		
		/*UsuarioNoob usuario1 = new UsuarioNoob("Adriell", "adriell.bezerra", 1000);
		Jogo novoJogo3 = new Jogo("suicide", 400.00, "rpg");
		usuario1.comprarJogo(novoJogo3);
		usuario1.registraJogada(novoJogo3, 1000, false);
		System.out.println(usuario1);
		usuario1.registraJogada(novoJogo3, 100, false);
		usuario1.imprimeJogosComprados();
		
		System.out.println("\n\n");
		UsuarioVeterano usuario2 = new UsuarioVeterano("Adriell Bezerra", "adriell.mestre", 1000);
		Jogo novoJogo4 = new Jogo("Mortal Combat", 400.00, "rpg");
		usuario2.comprarJogo(novoJogo4);
		usuario2.registraJogada(novoJogo4, 1000, false);
		System.out.println(usuario2);
		usuario2.registraJogada(novoJogo4, 2000, true);;
		usuario2.imprimeJogosComprados();
		System.out.println(usuario2);
		
		System.out.println("\n\n");
		UsuarioNoob usuario3 = new UsuarioNoob("Ariell Bezerra", "ariell.sousa", 1000.00);
		JogoLuta novoJogo5 = new JogoLuta("Mortal Combat", 100.00);
		usuario3.comprarJogo(novoJogo5);
		usuario3.registraJogada(novoJogo5, 20000, false);
		System.out.println(usuario3);
		usuario3.registraJogada(novoJogo5, 40000, false);
		System.out.println(usuario3);*/
		
		UsuarioNoob usuario4 = new UsuarioNoob("Adriell", "adriell.adv", 1000.00);
		JogoPlataforma novoJogo6 = new JogoPlataforma("Super Mario World", 30.00);
		usuario4.comprarJogo(novoJogo6);
		usuario4.registraJogada(novoJogo6, 60000, true);
	
		System.out.println(usuario4);
		
		
	}
}
