import static org.junit.Assert.*;

import org.junit.Test;


public class UsuarioTest {

	@Test
	public void testAdicionaDinheiro() throws Exception {
		Usuario usuario = new UsuarioVeterano("Adriell Lima", "adriell.lima", 1000.00);
		Usuario usuario2 = new UsuarioNoob("Adriell Lima", "adriell.lima", 50.00);
		usuario.adicionarDinheiro(60.00);
		usuario2.adicionarDinheiro(40.00);
		assertEquals(1060,00, usuario.getQtdDinheiro());
		assertEquals(90,00, usuario2.getQtdDinheiro());
		
	}

	@Test
	public void testRegistraJogada() throws Exception{
		Jogo jogo = new JogoRPG("Corriga", 300);
		Usuario usuario = new UsuarioNoob("Adriell Bezerra", "nome.login", 2087.00);
		usuario.comprarJogo(jogo);
		usuario.registraJogada(jogo, 200, true);
		assertEquals(1, jogo.getQuantasVezesJogou());
		assertEquals(1, jogo.getQuantasVezesZerou());
		assertEquals(200, jogo.getMaiorScore());
		assertEquals(3010, usuario.getX2p());
		
	}
	
	@Test
	public void testTotalPrecoPago() throws Exception{
		Jogo jogo = new JogoRPG("Corriga", 300);
		Usuario usuario = new UsuarioNoob("Adriell Bezerra", "nome.login", 2087.00);
		usuario.comprarJogo(jogo);
		assertEquals(300,00, usuario.totalPrecoJogos());
		
	}
	
	@Test
	public void testEquals() throws Exception{
		Usuario usuario = new UsuarioNoob("Adriell Bezerra", "nome.login", 2087.00);
		Usuario usuario2 = new UsuarioVeterano("Adriell Bezerra", "nome.login", 1000.00);
		Usuario usuario3 = new UsuarioNoob("Adriell Bezerra", "nome2.login", 300.00);
		Usuario usuario4= new UsuarioVeterano("Adriell Sousa", "nome.login", 3098.00);
		Usuario usuario5 = new Usuario("Adriell Bezerra", "nome.login", 2087.00);
		Usuario usuario6 = new UsuarioNoob("Adriell Bezerra", "nome.login", 2087.00);
		
		assertTrue(usuario.equals(usuario2));
		assertTrue(usuario.equals(usuario5));
		assertTrue(usuario.equals(usuario6));
		assertFalse(usuario.equals(usuario3));
		assertFalse(usuario.equals(usuario4));
	}
}
